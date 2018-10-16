package com.media.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.media.model.MediaAccount;
import com.media.service.AdminServices;
import com.media.service.MediaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/movie")
@Api(value="onlinestore", description ="Operations pertaining to products in Media Store")
//@ApiExplorerSettings(IgnoreApi = true)
public class MediaController {

	
	@Autowired
	MediaService mediaservice;
	@Autowired
	AdminServices adminservice;
	
	@ApiOperation(value = "View a list of available movies", response = Iterable.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved movie list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	}
	)
	@GetMapping(path="/list")
	public List<MediaAccount> getMovies() {
		List<MediaAccount> ma = mediaservice.getMovies();
		return ma;
	}
	
	@ApiOperation(value = "Add new movies", response = Iterable.class)
	@PostMapping(path="/add")
	public void addMovies(MediaAccount media) {
		//adminservice.addNewMovies(movie);
	}
	
	@ApiOperation(value = "Delete movies", response = Iterable.class)
	@DeleteMapping(path="/delete")
	public void deleteMovies(MediaAccount media) {
		adminservice.deleteMovies(media);
	}
	
	@ApiOperation(value = "Update movies", response = Iterable.class)
	@PutMapping(path="/update")
	public void updateMovies(MediaAccount media) {
		adminservice.updateMovies(media);
	}
	
	@ApiOperation(value = "View movies by genre", response = Iterable.class)
	@GetMapping(path="/bygenre")
	public List<MediaAccount> getMoviesByGenre(){
		List<MediaAccount> mm = mediaservice.getMoviesByGenre();
		
		return mm;
	}
	
	
	@PostMapping("/insertall")
	public List<MediaAccount> insertAll(@RequestBody MediaAccount media[]) {
		for(int i=0; i<media.length; i++) {
		adminservice.addMovies(media[i]); }
		return getMovies();
	}
}
