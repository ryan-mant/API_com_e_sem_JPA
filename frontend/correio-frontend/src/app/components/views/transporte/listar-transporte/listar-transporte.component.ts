import { Component, OnInit } from '@angular/core';
import { Transporte } from 'src/app/models/Transporte';
import { TransporteService } from 'src/app/services/transporte.service';

@Component({
  selector: 'app-listar-transporte',
  templateUrl: './listar-transporte.component.html',
  styleUrls: ['./listar-transporte.component.css']
})
export class ListarTransporteComponent implements OnInit{
  constructor(private transporteService: TransporteService){}
  transportes!: Transporte[]
  ngOnInit(): void {
    this.transporteService.getTransporte().subscribe((res: Transporte[])=>{
      this.transportes = res;
    })
  }

}
