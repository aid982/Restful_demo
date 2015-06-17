/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.messeger_restful_demo.service;

import com.osetskiy.messeger_restful_demo.database.DataBase;
import com.osetskiy.messeger_restful_demo.model.Message;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 *
 * @author osetskiy
 */
public class MessageService {
     private Map<Long,Message> messages = DataBase.getMessages();               

     public MessageService() {
          messages.put(1L, new Message(1," Hi user1","sdfsd"));
          messages.put(2L, new Message(2," Hi user 2 ","sdfsd"));
     }
     
     public  List<Message> getAllMessages(){
          
          return new ArrayList<Message>(messages.values());
     }
     
     public  List<Message> getAllMessagesByYear(int year){
    	 
    	 List<Message> messagesByYear = new ArrayList<Message>();
    	 Calendar calendar = Calendar.getInstance();
    	 for(Message message:messages.values())
    	 {
    		 calendar.setTime(message.getCreated());
    		 if(calendar.get(Calendar.YEAR)==year){
    			 messagesByYear.add(message);   			 
    		 }    		 
    	 }
    	 
         return messagesByYear;
    }
     
     
     public  List<Message> getAllMessagesPaginated(int start,int  size)
     {
    	 List<Message> messagesPagineted = new ArrayList<Message>(messages.values());
    	    		 
    	 if(start+size>messagesPagineted.size()) {
    		 return new ArrayList<Message>();
    	 }
    	 return messagesPagineted.subList(start, start+size);
    	 
    	 
     }
     
     
     
     
      
     
     public Message addMessage(Message message)
     {
           message.setId(messages.size()+1);
           messages.put(message.getId(), message);
           return message;
     }
     
     public Message getMessage(long id)
     {          
          return messages.get(id);
     }
     
     public Message removeMessage(long id)
     {          
          return messages.remove(id);
     }
     
     public Message updateMessage(Message message)               
     {          
          if (message.getId()<=0) return null;
          messages.put(message.getId(), message);               
          return message;
     }
     
     
}
