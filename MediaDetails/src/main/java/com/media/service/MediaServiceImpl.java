package com.media.service;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.media.mapper.MediaMapper;
import com.media.model.MediaAccount;

@Service
@MapperScan("com.media.mapper")
public class MediaServiceImpl implements MediaService {

	@Autowired
	MediaMapper mediamapper;
	
	@Override
	public List<MediaAccount> getMovies() {
		
		List<MediaAccount> ma = mediamapper.getMoviesList(); 
		return ma;
	} 
	
	public List<MediaAccount> getMoviesByGenre(){
		
		List<MediaAccount> mm = mediamapper.getMoviesByGenre();
		
		return mm;
	}
}
