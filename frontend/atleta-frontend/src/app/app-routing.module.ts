import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { CadastrarComponent } from './components/views/cadastrar/cadastrar.component';
import { DeleteComponent } from './components/views/delete/delete.component';
import { AtualizarAtletaComponent } from './components/views/atleta/atualizar-atleta/atualizar-atleta.component';

const routes: Routes = [
  {path: 'cadastrar', component: CadastrarComponent},
  {path: "", component: HomeComponent},
  {path: 'deletar', component: DeleteComponent},
  {path: 'atualizar', component: AtualizarAtletaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
