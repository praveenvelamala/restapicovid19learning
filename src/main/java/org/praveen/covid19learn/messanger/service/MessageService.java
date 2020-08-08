package org.praveen.covid19learn.messanger.service;

import java.util.ArrayList;
import java.util.List;
import org.praveen.covid19learn.messanger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Praveen","Hello Praveen" );
		Message m2 = new Message(2L, "Kalyani","Hello Kalyani" );
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}
	
}
