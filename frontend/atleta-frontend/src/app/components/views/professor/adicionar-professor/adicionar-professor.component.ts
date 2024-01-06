import { Component } from '@angular/core';
import { Atleta } from 'src/app/models/Atleta';
import { Professor } from 'src/app/models/Professor';
import { ProfessorService } from 'src/app/services/professor.service';

@Component({
  selector: 'app-adicionar-professor',
  templateUrl: './adicionar-professor.component.html',
  styleUrls: ['./adicionar-professor.component.css']
})
export class AdicionarProfessorComponent {
  constructor(private professorService: ProfessorService){}
  id!: number;
  nome!: string;
  alunos!: Atleta[];
  public adicionarProfessor(){
    let professor = new Professor(this.id,this.nome, this.alunos);
    this.professorService.adicionarProfessor(professor).subscribe((response) => {
      console.log(response)
    })
  }

}
