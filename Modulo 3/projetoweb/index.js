const express = require('express');
const app = express();
const { engine } = require('express-handlebars');
const path = require('path');

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

app.listen(3000, () =>{ //CALLBACK
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});

