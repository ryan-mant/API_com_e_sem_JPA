import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/views/home/home.component';
import { CadastrarComponent } from './components/views/cadastrar/cadastrar.component';
import { DeletarComponent } from './components/views/deletar/deletar.component';
import { AtualizarComponent } from './components/views/atualizar/atualizar.component';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { ListarPacoteComponent } from './components/views/pacote/listar-pacote/listar-pacote.component';
import { AdicionarPacoteComponent } from './components/views/pacote/adicionar-pacote/adicionar-pacote.component';
import { AtualizarPacoteComponent } from './components/views/pacote/atualizar-pacote/atualizar-pacote.component';
import { DeletarPacoteComponent } from './components/views/pacote/deletar-pacote/deletar-pacote.component';
import { ListarTransporteComponent } from './components/views/transporte/listar-transporte/listar-transporte.component';
import { AdicionarTransporteComponent } from './components/views/transporte/adicionar-transporte/adicionar-transporte.component';
import { AtualizarTransporteComponent } from './components/views/transporte/atualizar-transporte/atualizar-transporte.component';
import { DeletarTransporteComponent } from './components/views/transporte/deletar-transporte/deletar-transporte.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CadastrarComponent,
    DeletarComponent,
    AtualizarComponent,
    NavbarComponent,
    ListarPacoteComponent,
    AdicionarPacoteComponent,
    AtualizarPacoteComponent,
    DeletarPacoteComponent,
    ListarTransporteComponent,
    AdicionarTransporteComponent,
    AtualizarTransporteComponent,
    DeletarTransporteComponent
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
