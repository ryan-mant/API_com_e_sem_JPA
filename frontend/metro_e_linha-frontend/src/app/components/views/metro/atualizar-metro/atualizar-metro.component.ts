import { Component } from '@angular/core';
import { Linha } from 'src/app/models/Linha';
import { Metro } from 'src/app/models/Metro';
import { MetroService } from 'src/app/services/metros.service';

@Component({
  selector: 'app-atualizar-metro',
  templateUrl: './atualizar-metro.component.html',
  styleUrls: ['./atualizar-metro.component.css']
})
export class AtualizarMetroComponent {
  constructor(private metroService: MetroService){}

  id?: number;
  ultimaEstacao!: string;
  estacaoDeInicio!: string;
  linha: {
    id?: number;
    nome: string;
    metros: Metro[];
  } = {} as Linha;

  atualizarMetro(){
    let metro = new Metro(this.ultimaEstacao, this.estacaoDeInicio, this.linha, this.id)
    this.metroService.atualizarMetro(metro).subscribe((res: Metro) =>{
      console.log(res);
    })
  }

}
