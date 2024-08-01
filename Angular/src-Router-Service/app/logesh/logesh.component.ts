import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-logesh',
  templateUrl: './logesh.component.html',
  styleUrl: './logesh.component.css'
})
export class LogeshComponent {
  sum : number;
  sub : number;
    constructor(private calc : CalculatorService) { 
      this.sum = calc.getAddition(10,20);
      this.sub = calc.getSubtraction(10 ,20);
    }
}
