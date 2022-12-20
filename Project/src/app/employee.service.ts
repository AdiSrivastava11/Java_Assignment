import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http'
import { Observable, throwError } from 'rxjs';
import { Employee } from './employee';
import { catchError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private employees:Employee[];
  private baseURL = "http://localhost:8080/api/v1/employees";
  httpsOptions = {
    headers: new HttpHeaders({
      'Content=Type': 'application/json'
    })
  }
  constructor(private httpClient: HttpClient) { }

  
  getEmployeesList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }

  createEmployee(employee: Employee): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, employee);
  }

  getEmployeeById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/${id}`);
  }

  updateEmployee(id: number, employee: Employee): Observable<Object>{
    console.log('update employee called'+employee)
    return this.httpClient.put(`${this.baseURL}/${id}`, employee);
  }

  deleteEmployee(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
  
}
