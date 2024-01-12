import { Metro } from "./Metro";

export class Linha{
    id?: number;
    nome!: string;
    metros!: Metro[]

    constructor(nome: string, metros: Metro[], id?: number){
        this.id = id;
        this.nome = nome;
        this.metros = metros;
    }
}