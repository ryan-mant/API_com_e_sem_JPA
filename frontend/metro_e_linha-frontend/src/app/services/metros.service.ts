import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Metro } from "../models/Metro";

@Injectable({providedIn: 'root'})
export class MetroService{
    constructor(private http: HttpClient){}
    apiUrl = 'http://localhost:8080/metros'

    getMetros():Observable<Metro[]>{
        return this.http.get<Metro[]>(this.apiUrl)
    }

    getMetroById(id:number): Observable<Metro>{
        return this.http.get<Metro>(this.apiUrl + `/${id}`)
    }
    adicionarMetro(metro: Metro): Observable<Metro>{
        return this.http.post<Metro>(this.apiUrl + "/adicionar-metro", metro)
    }
    atualizarMetro(metro: Metro): Observable<Metro>{
        return this.http.put<Metro>(this.apiUrl  + "/atualizar-metro", metro)
    }
    deletarMetro(id: number): Observable<Metro>{
        return this.http.delete<Metro>(this.apiUrl + `/deletar/${id}`)
    }
}