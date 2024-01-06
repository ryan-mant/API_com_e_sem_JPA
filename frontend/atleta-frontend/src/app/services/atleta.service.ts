import { HttpClient } from "@angular/common/http";
import { Injectable} from "@angular/core"
import { Observable} from 'rxjs'
import { Atleta } from "../models/Atleta";
@Injectable({
    providedIn: 'root'
})
export class AtletaService{
    constructor(private http: HttpClient){}
    apiUrl = 'http://localhost:8080/atletas'

    getAtletas(): Observable<Atleta[]> {
        return this.http.get<Atleta[]>(this.apiUrl)
    }
    
    adicionarAtleta(atleta: Atleta): Observable<Atleta>{
        return this.http.post<Atleta>(this.apiUrl + '/adicionar-atleta', atleta)
    }
    deletarAtleta(id: number): Observable<Atleta>{
        return this.http.delete<Atleta> (this.apiUrl + `/${id}`)
    }
    atualizarAtleta(atleta: Atleta): Observable<Atleta>{
        return this.http.put<Atleta>(this.apiUrl + '/atualizar-atleta', atleta)
    }
}