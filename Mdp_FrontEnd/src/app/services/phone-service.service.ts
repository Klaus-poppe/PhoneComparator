import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PhoneService {

  constructor(private http:HttpClient) { }

  res:any;
  baseUrl = 'http://localhost:8080/';
  
  
  getPhoneByName(name)
  {
    let url = this.baseUrl+"get/"+ name;
    console.log(url);
    return this.http.get(url);
  }

}