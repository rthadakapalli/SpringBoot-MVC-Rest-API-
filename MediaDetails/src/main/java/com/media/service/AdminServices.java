package com.media.service;

import com.media.model.MediaAccount;

public interface AdminServices {

	public void addMovies(MediaAccount movie);
	
	public void deleteMovies(MediaAccount movie);
	
	public void updateMovies(MediaAccount movie);

}
