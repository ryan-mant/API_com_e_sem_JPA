import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/views/home/home.component';
import { CadastrarComponent } from './components/views/cadastrar/cadastrar.component';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { ListaAtletaComponent } from './components/views/atleta/lista-atleta/lista-atleta.component';
import { AdicionarAtletaComponent } from './components/views/atleta/adicionar-atleta/adicionar-atleta.component';
import { ListaProfessorComponent } from './components/views/professor/lista-professor/lista-professor.component';
import { AdicionarProfessorComponent } from './components/views/professor/adicionar-professor/adicionar-professor.component';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { DeletarAtletaComponent } from './components/views/atleta/deletar-atleta/deletar-atleta.component';
import { DeleteComponent } from './components/views/delete/delete.component';
import { AtualizarAtletaComponent } from './components/views/atleta/atualizar-atleta/atualizar-atleta.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CadastrarComponent,
    NavbarComponent,
    ListaAtletaComponent,
    AdicionarAtletaComponent,
    ListaProfessorComponent,
    AdicionarProfessorComponent,
    DeletarAtletaComponent,
    DeleteComponent,
    AtualizarAtletaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
