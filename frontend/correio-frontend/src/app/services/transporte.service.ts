import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Transporte } from "../models/Transporte";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn: "root"
})
export class TransporteService{
    constructor(private http: HttpClient){}
    apiUrl = "http://localhost:8080/transportes";
    getTransporte(): Observable<Transporte[]>{
        return this.http.get<Transporte[]>(this.apiUrl);
    }
    adicionarTransporte(transporte: Transporte): Observable<Transporte>{
        return this.http.post<Transporte>(this.apiUrl + "/adicionar-transporte", transporte)
    }
    atualizarTransporte(transporte:Transporte): Observable<Transporte>{
        return this.http.put<Transporte>(this.apiUrl + "/atualizar-transporte", transporte)
    }
    deletarTransporte(id: number): Observable<Transporte>{
        return this.http.delete<Transporte>(this.apiUrl + `/deletar-transporte/${id}`)
    }
}