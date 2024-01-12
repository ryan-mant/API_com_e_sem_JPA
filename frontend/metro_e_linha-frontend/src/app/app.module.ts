import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './components/views/home/home.component';
import { CadastrarComponent } from './components/views/cadastrar/cadastrar.component';
import { AtualizarComponent } from './components/views/atualizar/atualizar.component';
import { DeletarComponent } from './components/views/deletar/deletar.component';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { ListarMetroComponent } from './components/views/metro/listar-metro/listar-metro.component';
import { AdicionarMetroComponent } from './components/views/metro/adicionar-metro/adicionar-metro.component';
import { AtualizarMetroComponent } from './components/views/metro/atualizar-metro/atualizar-metro.component';
import { DeletarMetroComponent } from './components/views/metro/deletar-metro/deletar-metro.component';
import { ListarLinhaComponent } from './components/views/linha/listar-linha/listar-linha.component';
import { AdicionarLinhaComponent } from './components/views/linha/adicionar-linha/adicionar-linha.component';
import { AtualizarLinhaComponent } from './components/views/linha/atualizar-linha/atualizar-linha.component';
import { DeletarLinhaComponent } from './components/views/linha/deletar-linha/deletar-linha.component';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CadastrarComponent,
    AtualizarComponent,
    DeletarComponent,
    NavbarComponent,
    ListarMetroComponent,
    AdicionarMetroComponent,
    AtualizarMetroComponent,
    DeletarMetroComponent,
    ListarLinhaComponent,
    AdicionarLinhaComponent,
    AtualizarLinhaComponent,
    DeletarLinhaComponent,
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
