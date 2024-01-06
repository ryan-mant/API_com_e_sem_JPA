import { Component } from '@angular/core';
import { Atleta } from 'src/app/models/Atleta';
import { AtletaService } from 'src/app/services/atleta.service';


@Component({
  selector: 'app-deletar-atleta',
  templateUrl: './deletar-atleta.component.html',
  styleUrls: ['./deletar-atleta.component.css']
})
export class DeletarAtletaComponent{
  constructor(private atletaService: AtletaService){}

  public id!: number

  public deletarAtleta(id: number){
    return this.atletaService.deletarAtleta(id).subscribe((res: Atleta) =>{
      console.log(res)
    })
  }
}
