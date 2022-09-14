const express = require('express');
const app = express();
const { engine } = require('express-handlebars');
const path = require('path');
const bodyparser = require('body-parser');

app.use(bodyparser.urlencoded({ extended:false }));
app.set('view engine', 'handlebars');
app.engine('handlebars', engine());

app.use('/css', express.static(path.join(__dirname, 'node_modules/bootstrap/dist/css')))
app.use('/js', express.static(path.join(__dirname, 'node_modules/bootstrap/dist/js')))
app.use('/js', express.static(path.join(__dirname, 'node_modules/jquery/dist')))

app.use('/public', express.static(path.join(__dirname, 'public')))
//lista de objetos
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


app.get("/", function(req,res){
    //res.send(`<h1>EU NAO ACREDITO ${req.query['nome']} ${req.query['sobrenome']}</h1>`);
    res.render('index');
});

app.get("/clientes", function(req,res){
    res.render('cliente/cliente',{listaclientes: fakeData});
});

app.get("/clientes/novo", function(req,res){
    res.render("cliente/formcliente");
});

app.post("/clientes/save", function(req,res){
    //console.log(req.body.nome);
    // Criando um novo objeto JS com o atributo nome
    //Math.max()

    let maiorid = Math.max(...fakeData.map( o => o.id ));
    if (maiorid == -Infinity) maiorid = 0;
    /*
        const fakedata = [ {id: 1, nome: 'ze'}, {id: 2, nome: 'lu'}];
        fakeData.map( o => o.id ) Transforma em
        const outralista = [ {id: 1}, {id: 2}];
        ...fakeData.map( o => o.id ) Transforma em
        const listanumeros = [1,2];
    */
    let novoCliente = {
        id: maiorid + 1,
        nome: req.body.nome,
        endereco: req.body.endereco,
        sexo: req.body.sexo,
        telefone: req.body.telefone
    };
    fakeData.push(novoCliente);
    res.redirect("/clientes");
});

app.listen(3000, () =>{ //CALLBACK
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});

