function* infinity(){
    let i = 0;
    while(true){
        console.log(i++);
        yield;
    }
}
function date(){
    console.log(new Date());
}

const infgen = infinity();
console.log(typeof(infgen));
infgen.next();
date();
infgen.next();
