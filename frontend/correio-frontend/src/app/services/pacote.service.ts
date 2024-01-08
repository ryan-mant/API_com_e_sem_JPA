import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Pacote } from "../models/Pacote";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn: "root"
})
export class PacoteService{
    constructor(private http: HttpClient){}
    apiUrl = "http://localhost:8080/pacotes";

    getPacote(): Observable<Pacote[]>{
        return this.http.get<Pacote[]>(this.apiUrl);
    }
    adicionarPacote(pacote: Pacote): Observable<Pacote>{
        return this.http.post<Pacote>(this.apiUrl + "/adicionar-pacote", pacote);
    }
    atualizarPacote(pacote:Pacote): Observable<Pacote>{
        return this.http.put<Pacote>(this.apiUrl + "/atualizar-pacote", pacote)
    }
    deletarPacote(id: number):Observable<Pacote>{
        return this.http.delete<Pacote>(this.apiUrl + `/deletar-pacote/${id}`)
    }
}