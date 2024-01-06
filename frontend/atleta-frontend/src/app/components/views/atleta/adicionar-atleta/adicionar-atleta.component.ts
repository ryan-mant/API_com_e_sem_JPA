import { Component } from '@angular/core';
import { Atleta } from 'src/app/models/Atleta';
import { Professor } from 'src/app/models/Professor';
import { AtletaService } from 'src/app/services/atleta.service';
@Component({
  selector: 'app-adicionar-atleta',
  templateUrl: './adicionar-atleta.component.html',
  styleUrls: ['./adicionar-atleta.component.css']
})
export class AdicionarAtletaComponent {
  constructor(private atletaService: AtletaService){}
  id!: number;
  nome!: string;
  dataAssinatura!: Date;
  dataDeVencimento!: Date;
  professor: {
    id: number,
    nome: string
    alunos: Atleta[]
  } = {} as Professor;

  public adicionarAtleta(){
    let atleta = new Atleta(this.nome, this.dataAssinatura, this.dataDeVencimento, this.id , this.professor);
    this.atletaService.adicionarAtleta(atleta).subscribe((response) => {
      console.log(response)
    });
  }
  public adicionarAtletaSemProfessor(){
    let atleta = new Atleta(this.nome, this.dataAssinatura, this.dataDeVencimento);
    this.atletaService.adicionarAtleta(atleta).subscribe((response) => {
      console.log(response)
    });
  }
}
