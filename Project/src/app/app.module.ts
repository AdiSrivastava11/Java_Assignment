import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { FormsModule} from '@angular/forms';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { SearchEmployeeComponent } from './search-employee/search-employee.component'
import { Ng2FilterPipeModule } from 'ng2-filter-pipe';


@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    CreateEmployeeComponent,
    UpdateEmployeeComponent,
    EmployeeDetailsComponent,
    SearchEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    Ng2FilterPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
