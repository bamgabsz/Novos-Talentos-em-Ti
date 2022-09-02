function click_botao(valor){
    let txttela = document.getElementById("txttela");
    txttela.value += valor;
}

function click_igual(){
    let txttela = document.getElementById("txttela");
    let resultado = eval(txttela.value);
    txttela.value = resultado;
}