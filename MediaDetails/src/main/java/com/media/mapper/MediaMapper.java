package com.media.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.media.model.MediaAccount;

@Mapper
public interface MediaMapper {

	
	@Select("select * from media_table")
	public List<MediaAccount> getMoviesList();
	
	@Insert("insert into media_table (title, year, rated, released, runtime, genre, director, writer, actors, plot,"
			+ "language, country, awards, poster, metascore, imdbrating, imdbvotes, imdbid, type) "
			+ "values (#{title}, #{year}, #{rated, jdbcType=VARCHAR}, #{released}, #{runtime, jdbcType=VARCHAR}, #{genre}, #{director, jdbcType=VARCHAR}, #{writer, jdbcType=VARCHAR}, #{actors, jdbcType=VARCHAR},"
			+ "#{plot}, #{language}, #{country}, #{awards, jdbcType=VARCHAR}, #{poster}, #{metascore}, #{imdbrating}, #{imdbvotes}, #{imdbid, jdbcType=VARCHAR}, #{type})")
	public void addMovie( MediaAccount title );
	
	@Delete("delete from mediatable where title=#{title}")
	public void deleteMovie( MediaAccount delete );
	
	@Update("update mediatable set title=#{title} where mid=#{mid}")
	public void updateMovie( MediaAccount update );
	
	@Select("select genre from mediatable group by genre")
	public List<MediaAccount> getMoviesByGenre();
	
}
