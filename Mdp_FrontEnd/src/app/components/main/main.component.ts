import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { PhoneService } from 'src/app/services/phone-service.service';
import { Phone } from 'src/app/classes/phone';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  
  constructor(public data:PhoneService) {    }

  test:any;
  display1:boolean= false;
  display2:boolean= false;
  phone1Form:FormGroup;
  phone2Form:FormGroup;
  p1:any;
  p2:any;
  phone1:Phone = new Phone();
  phone2:Phone = new Phone();

  ngOnInit() {
    this.phone1Form = new FormGroup({
      'phone1': new FormControl(null, [Validators.required, Validators.minLength(4)])
    });

    this.phone2Form = new FormGroup({
      'phone2': new FormControl(null, [Validators.required, Validators.minLength(4)])
    });
  }

  
  
  getPhone1()
      {
        console.log(this.phone1Form.value.phone1)
        this.data.getPhoneByName(this.phone1Form.value.phone1).subscribe(
          result =>{
            this.test = result;
            this.phone1 = this.test;
            console.log(this.test.path)
            this.p1 = "src/assets/" + this.test.path
            
          },
          error=>{
          console.error();
          }
        );
        this.display1=true;
        
        
      }

      getPhone2()
      {
        console.log(this.phone2Form.value.phone2)
        this.data.getPhoneByName(this.phone2Form.value.phone2).subscribe(
          result =>{
            this.test = result
            this.phone2 = this.test
            this.p2 = "src/assets/" + this.test.path
            
          },
          error=>{
          console.error();
          }
        );
        this.display2=true;
      }
    
}
