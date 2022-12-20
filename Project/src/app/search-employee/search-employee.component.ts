import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-search-employee',
  templateUrl: './search-employee.component.html',
  styleUrls: ['./search-employee.component.css']
})
export class SearchEmployeeComponent{

  firstName:string;
  employees:Employee[];
  constructor(private employee:EmployeeService){
    this.employee.getEmployeesList().subscribe(
      data => {
        this.employees = data;
      }
    )
    this.firstName='';
  }

  // submitform(){
  //   this.employee.searchEmployee(this.firstName).subscribe(
  //     (data)=>{
  //       this.employees = data;
  //       console.log(this.employee);
  //     }
  //   )
  //   // console.log(this.employee);
  // }

  // findEmployee(firstName: string){
  //   this.employee.searchEmployee(this.firstName).subscribe(data => {
  //     this.employees=data;
  //   })
  // }


}
