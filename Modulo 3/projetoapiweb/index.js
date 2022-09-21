const express = require('express');
const app = express();
//DICA
const bodyparser = require('body-parser');
app.use(bodyparser.json());

const fakeData = [
    {
        id: 1,
        nome: 'Zezinho',
        endereco: 'Rua lalala 100',
        sexo: 'Masculino',
        telefone: '5555-1234'
    },
    {
        id: 2,
        nome: 'Mariazinha',
        endereco: 'Rua lulululu 200',
        sexo: 'Feminino',
        telefone: '5555-4321'
    }
];
//GET /api/v1/clientes - consulta que retorna todos os registros
app.get("/api/v1/clientes", (req,res) =>{
    //writeHead define o HTTP Status + headers da resposta
    res.writeHead(200,{"Content-Type": "application/json"});
    res.end(JSON.stringify(fakeData));
});

app.get("/api/v1/clientes/:id", (req,res)=>{
    //BUSCAR O CLIENTE PELO ID
    let httpStatus = 200;
    let resultado = fakeData.find(o => o.id == req.params.id);
    //VERIFICAR SE HOUVE RESULTADO
    if(resultado == undefined){
        httpStatus = 404;
    }
    //RETORNAR
    res.writeHead(httpStatus,{"Content-Type": "application/json"});
    res.end(JSON.stringify(resultado));
});

app.get("/api/v1/clientes/nome/:nome", (req,res) =>{
    let httpStatus = 200;

    let resultado = fakeData.find(o => o.nome.includes(req.params.nome));
    if (resultado == undefined){
        httpStatus = 404;
    }
    res.writeHead(httpStatus,{"Content-Type": "application/json"});
    res.end(JSON.stringify(resultado));
});

app.post("/api/v1/clientes", (req,res)=>{
    let httpStatus = 201;
    //recuperando o cliente de dentro do Body da requisição
    let novoCliente = req.body;
    if (!novoCliente.hasOwnProperty('nome')){
        httpStatus = 400; //Bad Request
    }else{
        //descobrindo o maior ID já cadastrado de clientes
        let maiorid = Math.max(...fakeData.map( o => o.id ));
        //validação caso lista fakeData esteja vazia
        if (maiorid == -Infinity) maiorid = 0;
        //adiciono 1 ao maior id dos clientes e gravo novo Cliente
        novoCliente.id = maiorid + 1;

        //inserir o novo cliente na lista fakeData
        fakeData.push(novoCliente);//guarda o cliente
    }
    //devolvo o objeto cliente para quem chamou
    res.writeHead(httpStatus,{"Content-Type": "application/json"});
    res.end(JSON.stringify(novoCliente));
});

app.put("/api/v1/clientes/:id", (req,res) =>{
    let httpStatus = 200;
    let idClienteAntigo = req.params.id; //id da URL
    let clienteAtualizacao = req.body;
    let clienteAnt =
        fakeData.find(o => o.id == idClienteAntigo);
    if(clienteAnt == undefined){
        httpStatus = 404; //Not found
    }else{
        let campos = ['nome','endereco','sexo','telefone'];
        if (!Object.keys(clienteAtualizacao).some(o => campos.includes(o))){
            clienteAnt = {};
            httpStatus = 400; //Bad Request
        }else{
            clienteAnt.nome = clienteAtualizacao.nome;
            clienteAnt.endereco = clienteAtualizacao.endereco;
            clienteAnt.sexo = clienteAtualizacao.sexo;
            clienteAnt.telefone = clienteAtualizacao.telefone;
        }
    }
    res.writeHead(httpStatus,{"Content-Type": "application/json"});
    res.end(JSON.stringify(clienteAnt));
});

app.delete("/api/v1/clientes/:id", (req,res)=>{
    //Guardo da URL o ID do cliente para remover
    let idCliente = req.params.id;
    //Procurar pelo objeto usando o id
    let clienteExcluir = fakeData.find(o => o.id == idCliente);
    //Descobrir a posição do objeto dentro do array
    let posicao = fakeData.indexOf(clienteExcluir);
    //Mando excluir
    fakeData.splice(posicao,1);
    res.writeHead(200,{"Content-Type": "application/json"});
    res.end(JSON.stringify(clienteExcluir));
});

app.listen(3000, () =>{ //CALLBACK
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});