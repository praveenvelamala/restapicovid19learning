package org.praveen.covid19learn.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	public Long messageId;
	public String messageAuthor;
	public Date messageCreated;
	public String message;
	
	public Message(){
		
	}
	
	public Message(Long messageId, String messageAuthor, String message) {
		this.messageId = messageId;
		this.messageAuthor = messageAuthor;
		this.messageCreated = new Date();
		this.message = message;
	}
	public Long getMessageId() {
		return messageId;
	}
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}
	public String getMessageAuthor() {
		return messageAuthor;
	}
	public void setMessageAuthor(String messageAuthor) {
		this.messageAuthor = messageAuthor;
	}
	public Date getMessageCreated() {
		return messageCreated;
	}
	public void setMessageCreated(Date messageCreated) {
		this.messageCreated = messageCreated;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
