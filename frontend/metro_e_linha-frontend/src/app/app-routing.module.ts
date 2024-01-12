import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { CadastrarComponent } from './components/views/cadastrar/cadastrar.component';
import { AtualizarComponent } from './components/views/atualizar/atualizar.component';
import { DeletarComponent } from './components/views/deletar/deletar.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'cadastrar', component: CadastrarComponent},
  {path: "atualizar", component: AtualizarComponent},
  {path:"deletar", component: DeletarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
