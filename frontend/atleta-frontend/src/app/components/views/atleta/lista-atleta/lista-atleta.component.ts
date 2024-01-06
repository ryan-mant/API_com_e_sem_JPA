import { Component, OnInit } from '@angular/core';
import { Atleta } from 'src/app/models/Atleta';
import { AtletaService } from 'src/app/services/atleta.service';

@Component({
  selector: 'app-lista-atleta',
  templateUrl: './lista-atleta.component.html',
  styleUrls: ['./lista-atleta.component.css']
})
export class ListaAtletaComponent implements OnInit{
  constructor(private atletaService: AtletaService){}
  public atletas!: Atleta[];
  ngOnInit(): void {
    this.atletaService.getAtletas().subscribe((res: Atleta[]) =>{
      this.atletas = res;
    })
  }

}
