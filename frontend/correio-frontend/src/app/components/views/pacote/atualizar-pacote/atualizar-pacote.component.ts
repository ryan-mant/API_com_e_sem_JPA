import { Component } from '@angular/core';
import { Pacote } from 'src/app/models/Pacote';
import { Transporte } from 'src/app/models/Transporte';
import { PacoteService } from 'src/app/services/pacote.service';

@Component({
  selector: 'app-atualizar-pacote',
  templateUrl: './atualizar-pacote.component.html',
  styleUrls: ['./atualizar-pacote.component.css']
})
export class AtualizarPacoteComponent {
  constructor(private pacoteService: PacoteService){}

  id!: number;
  nome!: string;
  nomeDoRecebedor!: string;
  enderecoDoRecebedor!: string;
  transporte: {
    id?: number;
    nome: string;
    pacotes: Pacote[]
  } = {} as Transporte

  atualizarPacote(){
    let pacote = new Pacote(this.nome, this.nomeDoRecebedor,this.enderecoDoRecebedor,this.transporte, this.id)
    this.pacoteService.atualizarPacote(pacote).subscribe((res) =>{
      console.log(res)
    })
  }
}
