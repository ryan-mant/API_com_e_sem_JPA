import { Component } from '@angular/core';
import { Metro } from 'src/app/models/Metro';
import { MetroService } from 'src/app/services/metros.service';

@Component({
  selector: 'app-deletar-metro',
  templateUrl: './deletar-metro.component.html',
  styleUrls: ['./deletar-metro.component.css']
})
export class DeletarMetroComponent {
  constructor(private metroService: MetroService){}

  id!: number;

  deletarMetro(){
    this.metroService.deletarMetro(this.id).subscribe((res: Metro) =>{
      console.log(res)
    })
  }

}
