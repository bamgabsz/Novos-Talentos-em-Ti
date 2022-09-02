function infinity() {
    let i = 0;
    while(true){
        console.log(i++);
    }
}

function infinity2(){
    let i = 0;
    //setInterval(function(){ //Define intervalo de execução repetido
    //CALLBACK
    //JS executa func daqui a 1 segundo
    setTimeout(function(){ // Define um tempo unico de execução
        console.log(i++);
        return i;
    }, 1000); //unidade de milisegundos
    console.log("FIM DO INFINITY2");
}

function date(){
    console.log(new Date());
    fazqqcoisa();
}

function fazqqcoisa(){
    console.log("qq coisa");
}
//infinity(); cuidado
//let resultado = infinity2();
//console.log("Result " + resultado);
//infinity();
infinity2();
date();