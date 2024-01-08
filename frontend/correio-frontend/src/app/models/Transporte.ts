import { Pacote } from "./Pacote";

export class Transporte{
    id?: number;
    nome!: string;
    pacotes!: Pacote[];
    constructor(nome: string, pacotes: Pacote[], id?: number){
        this.nome = nome;
        this.id = id;
    }
}