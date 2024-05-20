let user = new User()
user.init()

function openWindow(title, filepath){
    var popupWidth = 600;
    var popupHeight = 700;
    var left = (screen.width - popupWidth) / 2;
    var top = (screen.height - popupHeight) / 2;
    window.open(filepath, title, 'width=' + popupWidth + ',height=' + popupHeight + ',top=' + top + ',left=' + left);
}

document.getElementById('pagamentosButton').addEventListener('click', function() {
    // var popupWidth = 600;
    // var popupHeight = 700;
    // var left = (screen.width - popupWidth) / 2;
    // var top = (screen.height - popupHeight) / 2;
    // window.open('../iframes/pagamentos.html', 'Pagamento', 'width=' + popupWidth + ',height=' + popupHeight + ',top=' + top + ',left=' + left);
    openWindow('Pagamento', '../iframes/pagamentos.html')
});
document.getElementById('investimentosButton').addEventListener('click', function() {
    // var popupWidth = 600;
    // var popupHeight = 700;
    // var left = (screen.width - popupWidth) / 2;
    // var top = (screen.height - popupHeight) / 2;
    // window.open('../iframes/investimentos.html', 'Investimento', 'width=' + popupWidth + ',height=' + popupHeight + ',top=' + top + ',left=' + left);
    openWindow('Investimento', '../iframes/investimentos.html')
});