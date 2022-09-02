function sum (a, b, callbackfunction){
    setTimeout(() => { //Arrow Functions
        //return a + b;
        callbackfunction(a + b);
    }, 500);
    /*
    setTimeout(function() { //Arrow Functions
        return a + b;
    }, 500);
    */
   console.log("FIM DA FUNCAO");
}
//const a = sum(2, 2);
//console.log(a);
sum(2, 2, function(result){
    console.log(result);
});
