import { Component } from '@angular/core';
import { Linha } from 'src/app/models/Linha';
import { LinhaService } from 'src/app/services/linha.service';

@Component({
  selector: 'app-deletar-linha',
  templateUrl: './deletar-linha.component.html',
  styleUrls: ['./deletar-linha.component.css']
})
export class DeletarLinhaComponent {
  constructor(private linhaService: LinhaService){}

  id!:number;

  deletarLinha(){
    this.linhaService.deletarLinha(this.id).subscribe((res: Linha)=>{
      console.log(res)
    })
  }

}
