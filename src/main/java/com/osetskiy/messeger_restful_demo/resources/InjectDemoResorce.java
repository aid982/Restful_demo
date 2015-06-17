package com.osetskiy.messeger_restful_demo.resources;


import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import com.osetskiy.messeger_restful_demo.model.Message;

@Path("inject")
//@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.APPLICATION_JSON)
public class InjectDemoResorce {
	@GET	
	//Matrix param exampe http://localhost:8080/messeger_restful_demo/webapi/inject;param=Hello 
	public Message getParam(@MatrixParam("param") String name,@HeaderParam("custom") String header,@CookieParam("cookie") String cokie){
		return new Message(1,name,header);
		
	}
	
	@GET
	@Path("context")
	public Message getParamContext(@Context UriInfo uriInfo,@Context HttpHeaders headers){
			
		String cookies = headers.getCookies().toString();
		return new Message(1,uriInfo.getAbsolutePath().toString(),uriInfo.getPathParameters().toString());
		
	}

}
