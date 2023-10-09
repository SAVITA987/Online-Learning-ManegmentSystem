import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

  users : Observable<User[]> | undefined;
  user1 = new User();
  constructor(private _serive : UserService,private router:Router) { }

  ngOnInit(): void 
  {
    this.users = this._serive.getAllUsers();
  }
  public deleteProfile(userid: string){
    this._serive.deleteUserById(userid).subscribe(
      (Response)=>{
        this.users =Response;
        alert("User Deleted Successfully.");
        this.router.navigate(['admindashboard']);
      }
    )

  }
  Data1="";
  Data2="";
  Data3="";
  Data4="";
  Data5="";
  Data6="";
   public search(){
    console.log(this.user1.username);
 
    this. _serive.getUserByName(this.user1.username).subscribe(
      
      (Response)=>{
        if(Response.length>0){


        
        console.log('Searching for: ' + this.user1.username);
        this.Data1=Response[0].username;
        this.Data2=Response[0].email;
        this.Data3=Response[0].address;
        this.Data4=Response[0].profession;
        this.Data5=Response[0].gender;
        this.Data6=Response[0].mobile;


        this.users =Response;
        console.log(this.users);
        alert("User search Successfully.");
        }else{
          alert("User not found");
        }
        // this.router.navigate(['userlist']);
      }
    )
  
    }

}