import { HttpClient } from '@angular/common/http';
import{ Injectable} from '@angular/core'
import { Professor } from '../models/Professor';
import { Observable} from 'rxjs'
@Injectable({
    providedIn: 'root'
})
export class ProfessorService{
    constructor(private http: HttpClient){}

    getProfessores(): Observable<Professor[]>{
        return this.http.get<Professor[]>('http://localhost:8080/professores')
    }
    adicionarProfessor(professor: Professor): Observable<Professor>{
        return this.http.post<Professor>('http://localhost:8080/professores', professor)
    }
}