import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Location } from '../Models/Location';


@Component({
  selector: 'app-location-form',
  templateUrl: './location-form.component.html',
  styleUrls: ['./location-form.component.css']
})
export class LocationFormComponent implements OnInit {
  url = "http://localhost:8080/location";
  locations: Location[];

  constructor(public http: HttpClient) { 
    this.locations = [];
  }

  ngOnInit(): void {

    this.getLocation().subscribe((locations_list:any) => {
      locations_list.forEach(loc => {
        this.locations.push(loc);
      });
    },(error) => {
      console.log('Request Error');
    });
  }

  getLocation(): Observable<any>{
    return this.http.get(this.url);
  }

  createLocation(name: string, area: string, parent_location?: string){
    const loc_create = JSON.stringify({name: name, area: area, parent_location: parent_location});
    const httpHeader = { headers: new HttpHeaders({'Content-Type': 'application/json'})}
    this.http.post(this.url, loc_create, httpHeader).subscribe((newLocation:any) => {
      this.locations.push(newLocation);
    }, (error) => {
      console.log('Request Error', error);
    })
  }

  deleteLocation(id: number){
    this.http.delete(this.url + '/' + id).subscribe((response) => {
      this.locations = this.locations.filter(({ idlocation }) => idlocation !== id);   
    });
  }
}
