package com.cogent.api;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.model.UserAccount;
import com.cogent.service.UserService;
import com.media.model.MediaAccount;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/user")
@Api(value="onlinestore", description ="Operations pertaining to users")
public class UserController {
	
	@Autowired
	private UserService userservice;



	@ApiOperation(value = "View a list of users", response = Iterable.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved users list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	}
	)
	@GetMapping(path="/list")
	public List<UserAccount> getUsers() {
		
	List<UserAccount> users = userservice.getUsers();
		
		return users;
	}
	
	@GetMapping(path="/getuser", produces=javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public UserAccount getUser(@PathParam("") int id) {
		
		UserAccount u = userservice.getUserId(id);
		System.out.println("dafaq");
		return u;
	}
	
	@PostMapping(path ="/createuser")
	public List<UserAccount> createUser(UserAccount id) {
		
		userservice.createUser(id);
		
		return getUsers();
	}
	
	
	@PutMapping(path="/updateuser")
	public void updateUser(UserAccount uc) {
		
		userservice.updateUser(uc);
		
	}
	
	@DeleteMapping(path="/deleteuser")
	public void deleteUser(UserAccount ud) {
		
		userservice.deleteUser(ud);
		
	}
	
	@GetMapping(path="/moviesbyid")
	public List<MediaAccount> getUserMovies(@PathParam("userid") String userid, @PathParam("pass") String pass) { 
		// Two steps 
		// 1. validate the user 2. return movies list
		
		List<MediaAccount> um = userservice.getUserMovies(userid, pass);
	   
		return um;
	    
	}
	
	
}
