(function (){
    let botao = document.getElementById("botao");
    let cep = document.getElementById("cep");
    let retorno = document.getElementById("retorno");
    /*const result = 
        await fetch("https://ws.apicep.com/cep/06233-030.json");
    console.log(result);*/

    botao.onclick = function() {

        fetch(`https://ws.apicep.com/cep/${cep.value}.json`)
        .then(function(response){ //callback
            //console.log(response);
            response.json().then(function(json){
                retorno.innerHTML += json.status;
                if(json.status === 200){
                    retorno.innerHTML += json.city;
                }else{
                    retorno.innerHTML += "DEU RUIM NA API";
                }
                
            });
        });
    };
})();