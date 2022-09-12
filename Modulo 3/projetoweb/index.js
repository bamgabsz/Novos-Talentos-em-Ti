const express = require('express');
const app = express();
const { engine } = require('express-handlebars');

app.set('view engine', 'handlebars');
app.engine('handlebars', engine());

app.get("/", function(req,res){
    //res.send(`<h1>EU NAO ACREDITO ${req.query['nome']} ${req.query['sobrenome']}</h1>`);
    res.render('index');
})

app.listen(3000, () =>{ //CALLBACK
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});

