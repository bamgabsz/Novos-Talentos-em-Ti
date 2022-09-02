/*const lista = ['🐸','💕','😎','🐱‍🐉'];

for(let umitem of lista){
    console.log(umitem);
}*/

/*const mapa = new Map();

mapa.set('sapo','🐸');
mapa.set('coruja','🦉');
mapa.set('jacare','🐊');

console.log(mapa);
console.log(mapa.get('sapo'));
*/

/*const listavaloresunicos = new Set();
listavaloresunicos.add('🐸');
listavaloresunicos.add('🐊');
listavaloresunicos.add('🐶');
listavaloresunicos.add('🐸');
console.log(listavaloresunicos);*/

/*function soma(x = 1, y = 2){
    return x + y;
}
console.log(soma()); //x = 1, y = 2
console.log(soma(3)); //x = 3, y = 2
console.log(soma(3,5)); //x = 3, y = 5

let soma2 = (x=1 , y=2) => x + y
console.log(soma2());
*/
/*
function outrafuncao(){
    for(let umitem of arguments){
        console.log(umitem);
    }
}
outrafuncao(1);
outrafuncao(11);


function minhafuncao(...valores){
    console.log(valores);
}
minhafuncao();
minhafuncao(1);
minhafuncao(1,2);

console.log(1);
console.log(1,2);
console.log(1,2,3);

function minhafuncao2(val1, val2=2, ...valores){
    console.log("val1",val1);
    console.log("val2",val2);
    console.log(valores);
}
minhafuncao2(11,22,33,44);
*/

const lista =['🐶','🐊','🐸','🐧'];
let a, b, c, d;
[a,b,c,d] = lista;
console.log(a);
console.log(b);
console.log(c);
console.log(d);

function minhafunc(a,b,c,d){
    console.log(a);
    console.log(b);
    console.log(c);
    console.log(d);    
}
minhafunc(...lista); //SPREAD Operator
