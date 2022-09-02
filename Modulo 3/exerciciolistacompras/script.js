//closure
(function(){
    let btninserir = document.getElementById("btninserir");
    let txtproduto = document.getElementById("txtproduto");
    let itens = document.getElementById("itens");
    let txtqtd = document.getElementById("txtqtd");

    let lista = [];
    btninserir.onclick = click_btninserir;
    txtproduto.onkeydown = tecla_enter;

    function tecla_enter(key){
        if(key.key === 'Enter'){
            adiciona(txtproduto.value, txtqtd.value);    
        }
    }
    function click_btninserir(){
        //alert("clicou...");
        adiciona(txtproduto.value, txtqtd.value);
        
    }
    function adiciona(produto, qtd){
        //lista.push(produto);
        lista.push({
            nome: produto,
            qtd: qtd
        });
        atualiza_itens();
    }

    function atualiza_itens(){
        itens.innerHTML = "";
        for(let i in lista){
            let umItem = lista[i];

            let botao = document.createElement("button");
            botao.appendChild(document.createTextNode("Excluir"));
            botao.setAttribute("data-id",i);
            botao.onclick = excluir;

            let li = document.createElement("li");
            //li.appendChild(document.createTextNode(umItem));
            let textobonito = `Prod: ${umItem.nome} - QTD: ${umItem.qtd}`;
            li.appendChild(document.createTextNode(textobonito));
            itens.appendChild(li);
            li.appendChild(botao);
        }
    }
    
    function excluir(e){
        //console.log(e.target.getAttribute("data-id"));
        let posicao = e.target.getAttribute("data-id");
        lista.splice(posicao,1);
        atualiza_itens();
    }

})();