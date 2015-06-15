/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.messeger_restful_demo.database;

import com.osetskiy.messeger_restful_demo.model.Message;
import com.osetskiy.messeger_restful_demo.model.Profile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author osetskiy
 */
public class DataBase {
     private static  Map<Long,Message> messages = new HashMap<>();
     private static  Map<String,Profile> profiles = new HashMap<>();

     public static Map<Long, Message> getMessages() {
          return messages;
     }


     public static Map<String, Profile> getProfiles() {
          return profiles;
     }


     
}
