//VARIAVEL GLOBAL
//mensagem = "UNIVILLE";
/*void function() {
    console.log(mensagem);
}();*/
//elevação de variáveis
//eleva a declaração da variavel para a 
//primeira linha do bloco
//var mensagem = "UNIVILLE";

//let - declara variavel escopo de bloco
/*var exibeMensagem = function() {
    if(true){
        var escopoFuncao = 'Caelum';
        let escopoBloco = 'Alura';
        
        console.log(escopoFuncao);
        console.log(escopoBloco);
    
    }
    //console.log(escopoFuncao);
    //console.log(escopoBloco);
}
exibeMensagem();
console.log(exibeMensagem.name);*/

void function(){
    //let teste = 1234;
    //não pode = let teste = "lalala";

    const mensagem = 'Alura';
    console.log(mensagem);
    //ERRO mensagem = 'Caelum';
}();

(function (){
    let frutas = ['laranja', 'banana', 'uva'];
    console.log(frutas);
    for(let umafruta in frutas){
        //interpolação de strings
        console.log(`${umafruta} - ${frutas[umafruta]}`);
        //concatenação de strings
        console.log(umafruta + " - " + frutas[umafruta]);
    }
}());