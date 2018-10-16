package com.media.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.media.mapper.MediaMapper;
import com.media.model.MediaAccount;

@Service
@MapperScan("com.media.mapper")
public class AdminServicesImpl implements AdminServices {

	@Autowired
	MediaMapper mediamapper;

	@Override
	public void addMovies(MediaAccount movie) {
		mediamapper.addMovie(movie);
	}

	@Override
	public void deleteMovies(MediaAccount movie) {
		mediamapper.deleteMovie(movie);
	}

	@Override
	public void updateMovies(MediaAccount movie) {
		mediamapper.updateMovie(movie);
	}

}
