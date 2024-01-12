import { Component } from '@angular/core';
import { Linha } from 'src/app/models/Linha';
import { Metro } from 'src/app/models/Metro';
import { LinhaService } from 'src/app/services/linha.service';

@Component({
  selector: 'app-adicionar-linha',
  templateUrl: './adicionar-linha.component.html',
  styleUrls: ['./adicionar-linha.component.css']
})
export class AdicionarLinhaComponent {
  constructor(private linhaService: LinhaService){}
  id?: number;
  nome!: string;
  metros!: Metro[];

  adicionarLinha(){
    let linha= new Linha(this.nome, this.metros)
    this.linhaService.adicionarLinha(linha).subscribe((res: Linha) =>{
      console.log(res)
    })
  }

}
