package org.praveen.covid19learn.messanger.resources;

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

import org.praveen.covid19learn.messanger.model.Profile;
import org.praveen.covid19learn.messanger.service.ProfileService;

@Path ("/profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService ps = new ProfileService();
	
	
@GET
public List<Profile> getAllProfiles(){
	return ps.getAllProfiles();
}

@GET
@Path("/{name}")
public Profile getProfile(@PathParam("name") String name){
	System.out.println("In get");
	return ps.getProfile(name);
}

@POST
public Profile createProfile(Profile p){
	return ps.addProfile(p);	 
}

@PUT
@Path("/{name}")
public Profile updateProfile(@PathParam("name") String name, Profile p){
	return ps.updateProfile(p);
}

@DELETE
@Path("/{name}")
public void deleteProfile(@PathParam("name") String name){
	ps.deleteProfile(name);
}

}
