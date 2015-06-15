package com.osetskiy.messeger_restful_demo.resources;

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
import com.osetskiy.messeger_restful_demo.model.Profile;
import com.osetskiy.messeger_restful_demo.service.ProfileService;

@Path ("profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
	 private ProfileService profileService = new ProfileService();
     @GET     
     public List<Profile> getProfiles(){
          return profileService.getAllProfiles();
          
     }
     
     @GET
     @Path("/{prifleName}")     //
     public Profile getProfile(@PathParam("prifleName") String prifleName){
          return profileService.getProfile(prifleName);          
     }
     
     @PUT
     @Path("/{profileName}")  
     public Profile updateProfile(@PathParam("profileName") String profileName,Profile profile){
    	 profile.setProfileName(profileName);
    	 return profileService.updateProfile(profile);
    	 
                  
     }
     
     @DELETE
     @Path("/{profileName}")  
  
     public  Profile deleteProfile(@PathParam("profileName") String profiileName){    	 
    	return profileService.removeProfile(profiileName); 	 
                  
     }
     
     @POST   
     public Profile postProfile(Profile profile){    	 
    	 return profileService.addProfile(profile);
                  
     }

}
