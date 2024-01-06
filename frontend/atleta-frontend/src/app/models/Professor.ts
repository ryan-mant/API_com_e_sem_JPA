import { Atleta } from "./Atleta";

export class Professor{
    id!: number;
    nome!: string;
    alunos!: Atleta[];
    constructor(id: number, nome: string, alunos: Atleta[]){
        this.nome = nome;
    }
}