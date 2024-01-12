import { Linha } from "./Linha";

export class Metro{
    id?:number;
    ultimaEstacao!: string;
    estacaoDeInicio!: string;
    linha: {
        id?: number;
        nome: string;
        metros: Metro[];
    } = {} as Linha;

    constructor(ultimaEstacao: string, estacaoDeInicio: string, linha: Linha, id?: number){
        this.estacaoDeInicio = estacaoDeInicio;
        this.ultimaEstacao = ultimaEstacao;
        this.id = id;
        this.linha = linha;
    }
}