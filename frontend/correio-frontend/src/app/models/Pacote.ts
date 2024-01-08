import { Transporte } from "./Transporte";
export class Pacote{
    id?:number;
    nome!: string;
    nomeDoRecebedor!: string;
    enderecoDoRecebedor!: string;
    transporte: {
        id?:number,
        nome: string,
        pacotes: Pacote[]
    } = {} as Transporte

    constructor(nome: string, nomeDoRecebedor: string, enderecoDoRecebedor: string, transporte: Transporte, id?:number){
        this.id = id;
        this.nome = nome;
        this.nomeDoRecebedor = nomeDoRecebedor;
        this.enderecoDoRecebedor = enderecoDoRecebedor;
        this.transporte = transporte;
    }
}