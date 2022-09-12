class Pessoa{
    constructor(){
        this.nome;
        this.idade = 0;
    }
    gerarIdentidade(){
        return `${this.nome} - ${this.idade}`;
    }
    get nomeCompleto(){
        return this.nome;
    }
    set nomeCompleto(nome){
        this.nome = nome;
    }
}
class PessoaJuridica extends Pessoa {
    constructor(cnpj){
        super();
        this.CNPJ = cnpj;
    }
}

let umaPessoa = new Pessoa();
umaPessoa.nome = "Zezinho";
console.log(umaPessoa.nome);
console.log(umaPessoa.gerarIdentidade());
umaPessoa.nomeCompleto = "Zezinho da Silva Sauro";
console.log(umaPessoa.nomeCompleto);
let empresa = new PessoaJuridica("12345678910");
console.log(empresa);