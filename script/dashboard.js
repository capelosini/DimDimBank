document.getElementById('pagamentosButton').addEventListener('click', function() {
    var popupWidth = 600;
    var popupHeight = 700;
    var left = (screen.width - popupWidth) / 2;
    var top = (screen.height - popupHeight) / 2;
    window.open('../iframes/pagamentos.html', 'Pagamento', 'width=' + popupWidth + ',height=' + popupHeight + ',top=' + top + ',left=' + left);
});
