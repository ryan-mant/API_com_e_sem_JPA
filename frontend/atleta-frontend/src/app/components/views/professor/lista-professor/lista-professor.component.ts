import { Component, OnInit } from '@angular/core';
import { Professor } from 'src/app/models/Professor';
import { ProfessorService } from 'src/app/services/professor.service';

@Component({
  selector: 'app-lista-professor',
  templateUrl: './lista-professor.component.html',
  styleUrls: ['./lista-professor.component.css']
})
export class ListaProfessorComponent implements OnInit{
  constructor(private professorService: ProfessorService){}

  public professores!: Professor[];
  ngOnInit(): void {
    this.professorService.getProfessores().subscribe((res: Professor[])=>{
      this.professores = res;
    })
  }
}
