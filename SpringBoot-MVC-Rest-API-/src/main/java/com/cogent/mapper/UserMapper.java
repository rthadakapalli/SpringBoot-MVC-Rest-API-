package com.cogent.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cogent.model.UserAccount;
import com.media.model.MediaAccount;

@Mapper
public interface UserMapper {

@Select("select * from user_acc")
public List<UserAccount> getUsers();



@Insert("insert into user_acc(firstname, lastname, userid, pass, email, dob, usertype, updateuid) "
		+ " values (#{firstname}, #{lastname}, #{userid}, #{pass}, #{email}, #{dob}, #{usertype}, #{updateuid})")
public List<UserAccount> createUser(UserAccount user);



@Select("select * from user_acc where userid = #{userid}") // tablecolumn = POJO property
public UserAccount getuserid(int id);



@Update("update user_acc set firstname=#{firstname}, lastname=#{lastname}, pass=#{pass, jdbcType=VARCHAR}, email=#{email}, dob=#{dob},"
		+ "usertype=#{usertype}, updateuid=#{updateuid} where userid=#{userid}")
public void updateUser(UserAccount uc);



@Delete("delete from user_acc where userid=#{userid}")
public void deleteUser(UserAccount ud);


//@Results({ @Result(property = "userid", column = "userid"), @Result(property = "pass", column = "pass") })
@Select("select * from user_acc where userid = #{userid} and pass=#{pass} ")
public UserAccount getUserMovies(@Param("userid") String userid, @Param("pass") String pass);


/*@Select("select genre from mediatable group by genre")
public UserAccount getMoviesbyGenre();
*/
}
