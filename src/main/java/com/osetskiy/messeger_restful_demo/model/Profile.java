/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.messeger_restful_demo.model;

import java.util.Date;

/**
 *
 * @author osetskiy
 */
public class Profile {
     private String profileName;
     private String firstName;
     private String secondName;
     private Date created;

     public Profile(){
          
     }
     public Profile(String profileName, String firstName, String secondName) {
          this.profileName = profileName;
          this.firstName = firstName;
          this.secondName = secondName;
          this.created = new Date();          
     }

     public String getProfileName() {
          return profileName;
     }

     public void setProfileName(String profileName) {
          this.profileName = profileName;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getSecondName() {
          return secondName;
     }

     public void setSecondName(String secondName) {
          this.secondName = secondName;
     }

     public Date getCreated() {
          return created;
     }

     public void setCreated(Date created) {
          this.created = created;
     }
     
     
}
