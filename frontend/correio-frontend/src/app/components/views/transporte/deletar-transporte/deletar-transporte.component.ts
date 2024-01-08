import { Component } from '@angular/core';
import { TransporteService } from 'src/app/services/transporte.service';

@Component({
  selector: 'app-deletar-transporte',
  templateUrl: './deletar-transporte.component.html',
  styleUrls: ['./deletar-transporte.component.css']
})
export class DeletarTransporteComponent {
  constructor(private transporteService: TransporteService){}
  id!:number;
  deletarTransporte(){
    this.transporteService.deletarTransporte(this.id).subscribe((res) =>{
      console.log(this.id)
      console.log(res)
    })
  }

}
