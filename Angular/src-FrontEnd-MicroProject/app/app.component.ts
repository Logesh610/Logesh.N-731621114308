import { Component , HostListener} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'microProject';
  submit : string;
  message: string = '';
  flag : boolean;
  myClass : string;
  myH1 : string;
  flag1 : boolean ;
  message1: string = "";
  flag2 : boolean ;
  message2: string = "";
  myStyle : {};

  constructor(){
    this.submit="";
    this.message = 'Button clicked';
    this.message1 = " Button Updated";
    this.message2 = " Message Deleted";
    this.flag = false;
    this.myClass = "heading";
    this.myH1 = "H2";
    this.flag1 = false;
    this.flag2 = false;
    this.myStyle = {'text-align':'center'};
  }
  changeSubmit(){
    this.submit="Result1";
  }
  ClickMe() {
    this.flag = ! this.flag;
    
  }
  UpdateMe(){
    this.flag1 = ! this.flag1;
  }
  DeleteMe(){
    this.flag2 = ! this.flag2;
  }
  @HostListener('document:click', ['$event'])
  handleClick(event: Event) {
    const targetElement = event.target as HTMLElement;

    // Check if the click is outside the button
    if (this.flag && !targetElement.closest('.submit-btn')) {
      this.flag = false;
    }
    
    // if (this.flag && !targetElement.closest('.Update-btn')) {
    //   this.flag = false;
    // }
    // if (this.flag && !targetElement.closest('. Delete-btn')) {
    //   this.flag = false;
    // }
  }
 
}
