/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.messeger_restful_demo.resources;

import com.osetskiy.messeger_restful_demo.model.Message;
import com.osetskiy.messeger_restful_demo.service.MessageService;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author osetskiy
 */

@Path ("messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
     private MessageService messageService = new MessageService();
     @GET
     @Produces(MediaType.APPLICATION_JSON)
     public List<Message> getMessages(){
          return messageService.getAllMessages();
          
     }
     
     @GET
     @Path("/{messageId}")
     //@Produces(MediaType.APPLICATION_JSON)
     public Message getMessage(@PathParam("messageId") long id){
          return messageService.getMessage(id);          
     }
     
     @PUT
     @Path("/{messageId}")
   //  @Consumes(MediaType.APPLICATION_JSON)
   //  @Produces(MediaType.APPLICATION_JSON)
     public Message updateMessages(@PathParam("messageId") long id,Message message){
    	 message.setId(id);
    	 return messageService.updateMessage(message);
    	 
                  
     }
     
     @DELETE
     @Path("/{messageId}")
   //  @Consumes(MediaType.APPLICATION_JSON)
    // @Produces(MediaType.APPLICATION_JSON)
     public  void deleteMessages(@PathParam("messageId") long id){    	 
    	 messageService.removeMessage(id);  	 
                  
     }
     
     @POST
   //  @Produces(MediaType.APPLICATION_JSON)
//     @Consumes(MediaType.APPLICATION_JSON)
     public Message postMessages(Message message){
    	 
    	 return messageService.addMessage(message);
                  
     }
     
}
