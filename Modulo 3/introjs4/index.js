const express = require('express');
const app = express();

app.get("/", function(req,res){
    res.json({
        msg: "Eu não acredito"
    });
})
app.get("/date", function(req,res){
    res.json({
        date: new Date()
    });
});

app.get("/infinity", function(req,res){
    let i = 0;
    while(i < 50000){
        console.log(i++);
    }
});



app.listen(8080);
