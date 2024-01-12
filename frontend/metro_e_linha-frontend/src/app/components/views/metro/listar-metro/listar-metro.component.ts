import { Component, OnInit } from '@angular/core';
import { Metro } from 'src/app/models/Metro';
import { MetroService } from 'src/app/services/metros.service';

@Component({
  selector: 'app-listar-metro',
  templateUrl: './listar-metro.component.html',
  styleUrls: ['./listar-metro.component.css']
})
export class ListarMetroComponent implements OnInit{
  constructor(private metroService: MetroService){}
  metros!: Metro[]

  ngOnInit(): void {
    this.metroService.getMetros().subscribe((res: Metro[]) =>{
      this.metros = res
    })
  }
}
