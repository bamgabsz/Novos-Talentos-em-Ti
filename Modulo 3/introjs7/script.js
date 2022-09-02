function sum (a,b){
    return new Promise(function(resolve,reject){
        if(a<0 || b<0){
            reject("Valores negativos não suportados");
        }
        setTimeout(() => {
            resolve( a + b);
        }, 500);
    });
}
const a = sum(-2,2).then((result) => {
    console.log(result);
    //return result;
}).catch((err) =>{
    console.log(err);
});
console.log(a);
//.then((result2)=>{
//    console.log(result2);
//});