package com.cogent.service;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.cogent.mapper.UserMapper;
import com.cogent.model.UserAccount;
import com.media.model.MediaAccount;
import com.media.service.MediaService;

@Service
@MapperScan({"com.cogent.mapper", "com.media.mapper"})
@ComponentScan(basePackages = "com.media.service")

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper usermapper;
	
	@Autowired
	private MediaService ms;

	
	@Override
	public List<UserAccount> getUsers() {
	
		List<UserAccount> obj = usermapper.getUsers();
		return obj;
	}
	
	@Override
	public UserAccount getUserId(int id) {
		
		UserAccount user = usermapper.getuserid(id);
		
		return user;
	}
	
	
	@Override
	public void createUser(UserAccount ua) {
	
		System.out.println("Hello");
		usermapper.createUser(ua);
		
	}
	
	
	
	@Override
	public void updateUser(UserAccount uc) {
	
		usermapper.updateUser(uc);
				
	}
	
	
	@Override
	public void deleteUser(UserAccount ud) {

		usermapper.deleteUser(ud);
	}

	@Override
	public List<MediaAccount> getUserMovies(String userid, String pass) { 
		
		UserAccount um = usermapper.getUserMovies(userid, pass);
		// after validating the user i need to pull the list of movies  and return movies list 
		
		
		if(um.getUserid().equals(userid) && um.getPass().equals(pass)) {
		
		List<MediaAccount> lma = ms.getMovies();
		
		return lma; }
		
		else {
			
			System.out.println("INVALID USER");
			
			return null;
		}
	}
	
}
