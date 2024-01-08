import { Component } from '@angular/core';
import { Pacote } from 'src/app/models/Pacote';
import { Transporte } from 'src/app/models/Transporte';
import { TransporteService } from 'src/app/services/transporte.service';

@Component({
  selector: 'app-adicionar-transporte',
  templateUrl: './adicionar-transporte.component.html',
  styleUrls: ['./adicionar-transporte.component.css']
})
export class AdicionarTransporteComponent {
  constructor(private transporteService: TransporteService){}
  id!: number;
  nome!: string;
  pacotes!: Pacote[]

  adicionarTransporte(){
    let transporte = new Transporte(this.nome, this.pacotes, this.id)
    this.transporteService.adicionarTransporte(transporte).subscribe((res) =>{
      console.log(res)
    })
  }

}
