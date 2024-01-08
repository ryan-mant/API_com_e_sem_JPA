import { Component } from '@angular/core';
import { Pacote } from 'src/app/models/Pacote';
import { Transporte } from 'src/app/models/Transporte';
import { TransporteService } from 'src/app/services/transporte.service';

@Component({
  selector: 'app-atualizar-transporte',
  templateUrl: './atualizar-transporte.component.html',
  styleUrls: ['./atualizar-transporte.component.css']
})
export class AtualizarTransporteComponent {
  constructor(private transporteService: TransporteService){}
  id!: number;
  nome!: string;
  pacotes!: Pacote[]

  atualizarTransporte(){
    let transporte = new Transporte(this.nome, this.pacotes, this.id)
    return this.transporteService.atualizarTransporte(transporte).subscribe((res: Transporte) =>{
      console.log(transporte.id)
      console.log(res)
    })
  }
  

}
