import { Component } from '@angular/core';
import { PacoteService } from 'src/app/services/pacote.service';

@Component({
  selector: 'app-deletar-pacote',
  templateUrl: './deletar-pacote.component.html',
  styleUrls: ['./deletar-pacote.component.css']
})
export class DeletarPacoteComponent {
  constructor(private pacoteService: PacoteService){}
  id!:number;

  public deletarPacote(){
    this.pacoteService.deletarPacote(this.id).subscribe((res) =>{
      console.log(res)
    })
  }
}
