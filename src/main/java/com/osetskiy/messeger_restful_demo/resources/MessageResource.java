/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.messeger_restful_demo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author osetskiy
 */
@Path ("/messages")
public class MessageResource {
     @GET
     @Produces(MediaType.TEXT_PLAIN)
     public String getMessages(){
          return "Hello world";
     }
     
}
