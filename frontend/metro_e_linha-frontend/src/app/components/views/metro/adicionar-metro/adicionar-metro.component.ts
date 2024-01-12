import { Component } from '@angular/core';
import { Linha } from 'src/app/models/Linha';
import { Metro } from 'src/app/models/Metro';
import { MetroService } from 'src/app/services/metros.service';

@Component({
  selector: 'app-adicionar-metro',
  templateUrl: './adicionar-metro.component.html',
  styleUrls: ['./adicionar-metro.component.css']
})
export class AdicionarMetroComponent {
  constructor(private metroService: MetroService){}
  id?: number;
  ultimaEstacao!: string;
  estacaoDeInicio!: string;
  linha: {
    id?: number;
    nome: string;
    metros: Metro[];
  } = {} as Linha

  adicionarMetro(){
    let metro = new Metro(this.ultimaEstacao, this.estacaoDeInicio, this.linha)
    this.metroService.adicionarMetro(metro).subscribe((res: Metro) =>{
      console.log(res)
    })
  }

}
