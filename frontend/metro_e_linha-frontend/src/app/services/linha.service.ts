import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Linha } from "../models/Linha";

@Injectable({providedIn:'root'})
export class LinhaService{
    constructor(private http: HttpClient){}
    apiUrl = 'http://localhost:8080/linhas'

    getLinhas():Observable<Linha[]>{
        return this.http.get<Linha[]>(this.apiUrl)
    }
    getLinhaById(id: number): Observable<Linha>{
        return this.http.get<Linha>(this.apiUrl + `/${id}`)
    }
    adicionarLinha(linha: Linha): Observable<Linha>{
        return this.http.post<Linha>(this.apiUrl + "/adicionar-linha", linha)
    }
    atualizarLinha(linha: Linha): Observable<Linha>{
        return this.http.put<Linha>(this.apiUrl + "/atualizar-linha", linha)
    }
    deletarLinha(id: number): Observable<Linha>{
        return this.http.delete<Linha>(this.apiUrl + `/deletar/${id}`)
    }
}