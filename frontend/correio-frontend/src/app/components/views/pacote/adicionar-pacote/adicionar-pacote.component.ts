import { Component } from '@angular/core';
import { Pacote } from 'src/app/models/Pacote';
import { Transporte } from 'src/app/models/Transporte';
import { PacoteService } from 'src/app/services/pacote.service';

@Component({
  selector: 'app-adicionar-pacote',
  templateUrl: './adicionar-pacote.component.html',
  styleUrls: ['./adicionar-pacote.component.css']
})
export class AdicionarPacoteComponent {
  constructor(private pacoteService: PacoteService){}
  id!: number;
  nome!: string;
  nomeDoRecebedor!: string;
  enderecoDoRecebedor!: string;
  transporte:{
    id?: number;
    nome: string;
    pacotes: Pacote[]
  } = {} as Transporte

  adicionarPacote(){
    let pacote = new Pacote(this.nome, this.nomeDoRecebedor, this.enderecoDoRecebedor, this.transporte)
    this.pacoteService.adicionarPacote(pacote).subscribe((res: Pacote) =>{
      console.log(res)
    })
  }

}
