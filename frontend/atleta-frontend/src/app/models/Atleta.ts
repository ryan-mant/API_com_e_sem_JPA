import { Professor} from './Professor';
export class Atleta{
    id?: number;
    nome!: string;
    dataAssinatura!: Date;
    dataDeVencimento!: Date;
    professor?: {
        id: number,
        nome: string
        alunos: Atleta[]
    } = {} as Professor
    

    constructor(nome: string, dataAssinatura: Date, dataDeVencimento: Date,id?: number, professor?: Professor){
        this.id = id;
        this.nome = nome;
        this.dataAssinatura = dataAssinatura;
        this.dataDeVencimento = dataDeVencimento;
        this.professor = professor;
    }
}