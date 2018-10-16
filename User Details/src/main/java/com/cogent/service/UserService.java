package com.cogent.service;

import java.util.List;

import com.cogent.model.UserAccount;
import com.media.model.MediaAccount;

public interface UserService {
	
	public List<UserAccount> getUsers();
	
	public UserAccount getUserId(int id);
	
	public void createUser(UserAccount ua);
	
	public void updateUser(UserAccount uc);
	
	public void deleteUser(UserAccount ud);
	
	public List<MediaAccount> getUserMovies(String userid, String pass);
	
	
	//public List<MediaAccount> users();
	

	
}
