import { Component, OnInit } from '@angular/core';
import { Pacote } from 'src/app/models/Pacote';
import { PacoteService } from 'src/app/services/pacote.service';

@Component({
  selector: 'app-listar-pacote',
  templateUrl: './listar-pacote.component.html',
  styleUrls: ['./listar-pacote.component.css']
})
export class ListarPacoteComponent implements OnInit{

  constructor(private pacoteService: PacoteService) { }
  public pacotes!: Pacote[]

  ngOnInit(): void {
    this.pacoteService.getPacote().subscribe((res: Pacote[])=>{
      this.pacotes = res
    })
  }
}
