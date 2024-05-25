let user = new User()
user.init()
let localUser=user.getLocalUser()

// PAGAMENTO
if ($("#paymentForm").length > 0){
    document.getElementById("paymentForm").addEventListener("submit", (e) => {
        e.preventDefault()
        let value = Number(document.getElementById("valor").value.replace("-", "").replace("R$ ", "").replace(",", ""))
        if (!document.getElementById("creditOption").checked){
            if (localUser.money >= value && value != 0){
                localUser.money-=value
                localUser.extrato.push({"value": -value, "desc": "PIX"})
                user.saveCurrentUser(localUser)
                window.close()
            } else{
                alert("Você não possui este dinheiro!")
            }
        } else{
            if (value != 0){
                localUser.extrato.push({"value": -value, "desc": "Crédito"})
                user.saveCurrentUser(localUser)
            } else{
                alert("Coloque um valor válido!")
            }
            window.close()
        }
    })

    const paymentMethodInputs = document.querySelectorAll('input[name="paymentMethod"]');
    const creditCardInputs = document.getElementById('creditCardInputs');
    paymentMethodInputs.forEach(input => {
        input.addEventListener('change', function () {
            if (this.value === 'credit') {
                creditCardInputs.style.display = 'block';
            } else {
                creditCardInputs.style.display = 'none';
            }
        });
    });
    new Cleave('#valor', {
        numeral: true,
        numeralThousandsGroupStyle: 'thousand',
        prefix: 'R$ ',
        noImmediatePrefix: true,
        rawValueTrimPrefix: true
    });
} 
// INVESTIMENTO
else if($("#investmentForm").length > 0){
    $("#investmentForm").on("submit", e => {
        e.preventDefault()
        var investmentType = $('#investmentType').val();
        var investmentValue = $('#investmentValue').val();
        var chartData = {
            labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
            datasets: [{
                label: 'Investment Performance',
                data: generateRandomData(7, 50, 100),
                backgroundColor: 'rgba(75, 192, 192, 0.2)',
                borderColor: 'rgba(75, 192, 192, 1)',
                borderWidth: 1,
                fill: true
            }]
        };
        updateChart(chartData);
    })
    $("#btnSubmit").on("click", e => {
        let value = Number(document.getElementById("investmentValue").value.replace("-", "").replace("R$ ", "").replace(",", ""))
        if (localUser.money >= value && value != 0){
            localUser.money-=value
            localUser.extrato.push({"value": -value, "desc": $("#investmentType").val()})
            user.saveCurrentUser(localUser)
            window.close()
        } else{
            alert("Você não possui este dinheiro para investir!")
        }
    })
    
    new Cleave('#investmentValue', {
        numeral: true,
        numeralThousandsGroupStyle: 'thousand',
        prefix: 'R$ ',
        noImmediatePrefix: true,
        rawValueTrimPrefix: true
    });
    
    var investmentChart;
    
    function generateRandomData(points, min, max) {
        let data = [];
        for (let i = 0; i < points; i++) {
            data.push(Math.floor(Math.random() * (max - min + 1)) + min);
        }
        return data;
    }
    
    function updateChart(data) {
        if (investmentChart) {
            investmentChart.destroy();
        }
        var ctx = document.getElementById('investmentChart').getContext('2d');
        investmentChart = new Chart(ctx, {
            type: 'line',
            data: data,
            options: {
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });
    }
    
    $('#investmentType').change(function () {
    
        $('#investmentForm').trigger('submit');
    });
}