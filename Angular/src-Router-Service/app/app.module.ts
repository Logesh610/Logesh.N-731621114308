import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LogeshComponent } from './logesh/logesh.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import path from 'path';
// import { Route, Routes } from '@angular/router';
import { Routes, RouterModule } from '@angular/router';
import { CalculatorService } from './calculator.service';

const ROUTES : Routes =[
  {path : 'home',component : HomeComponent},
   {path : 'logesh',component : LogeshComponent},
 {path : 'contact',component : ContactComponent},
   
];

@NgModule({
  declarations: [
    AppComponent,
    LogeshComponent,
    HomeComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(ROUTES),
  ],
  providers: [
    provideClientHydration(),
     CalculatorService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 
}
