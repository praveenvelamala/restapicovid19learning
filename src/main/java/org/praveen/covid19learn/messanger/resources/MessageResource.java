package org.praveen.covid19learn.messanger.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.praveen.covid19learn.messanger.model.Message;
import org.praveen.covid19learn.messanger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessage(){
//		return "Welcome to the world of Rest";
//	}
	MessageService ms = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessages(){
		System.out.println("I am at current place");
		Message m1 = new Message(1L, "Praveen","Hello Praveen" );
		Message m2 = new Message(2L, "Kalyani","Hello Kalyani" );
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return  list;
	}

	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessageForId(){
		return "I am getMessageForId";
	}
	
}
