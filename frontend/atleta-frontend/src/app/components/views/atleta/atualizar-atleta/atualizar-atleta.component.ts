import { Component } from '@angular/core';
import { Atleta } from 'src/app/models/Atleta';
import { Professor } from 'src/app/models/Professor';
import { AtletaService } from 'src/app/services/atleta.service';

@Component({
  selector: 'app-atualizar-atleta',
  templateUrl: './atualizar-atleta.component.html',
  styleUrls: ['./atualizar-atleta.component.css']
})
export class AtualizarAtletaComponent {
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

  public atualizarAtleta(){
    let atleta = new Atleta(this.nome, this.dataAssinatura, this.dataDeVencimento, this.id ,this.professor);
    return this.atletaService.atualizarAtleta(atleta).subscribe((res: Atleta) =>{
      console.log(res);
    })
  }
  public atualizarAtletaSemProfessor(){
    let atleta = new Atleta(this.nome, this.dataAssinatura, this.dataDeVencimento, this.id);
    return this.atletaService.atualizarAtleta(atleta).subscribe((res: Atleta) =>{
      console.log(res);
    })
  }
  

}
