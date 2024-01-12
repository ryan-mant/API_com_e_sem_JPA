import { Component } from '@angular/core';
import { Linha } from 'src/app/models/Linha';
import { Metro } from 'src/app/models/Metro';
import { LinhaService } from 'src/app/services/linha.service';

@Component({
  selector: 'app-atualizar-linha',
  templateUrl: './atualizar-linha.component.html',
  styleUrls: ['./atualizar-linha.component.css']
})
export class AtualizarLinhaComponent {
  constructor(private linhaService: LinhaService){}

  id?: number;
  nome!: string;
  metros!: Metro[];

  atualizarLinha(){
    let linha = new Linha(this.nome, this.metros, this.id)
    this.linhaService.atualizarLinha(linha).subscribe((res: Linha)=>{
      console.log(res)
    })
  }

}
