package com.media.service;

import java.util.List;

import com.media.model.MediaAccount;

public interface MediaService {

	public List<MediaAccount> getMovies();
	
	public List<MediaAccount> getMoviesByGenre();
}
