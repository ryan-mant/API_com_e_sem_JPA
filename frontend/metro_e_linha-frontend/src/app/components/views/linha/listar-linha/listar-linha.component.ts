import { Component, OnInit } from '@angular/core';
import { Linha } from 'src/app/models/Linha';
import { LinhaService } from 'src/app/services/linha.service';

@Component({
  selector: 'app-listar-linha',
  templateUrl: './listar-linha.component.html',
  styleUrls: ['./listar-linha.component.css']
})
export class ListarLinhaComponent implements OnInit{
  constructor(private linhaService:  LinhaService){}
  linhas!: Linha[];
  ngOnInit(): void {
    this.linhaService.getLinhas().subscribe((res: Linha[])=>{
      this.linhas = res
    })
  }

}
