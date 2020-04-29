package cn.zj.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.zj.ssm.pojo.User;

//@Repository //接口，应该由MyBatis的SQLSession创建
public interface UserMapper {
// DML ：增删改

	@Insert("insert into t_user (name,password,age) values (#{name},#{password},#{age})")
	int insert(User user);
	
	@Update("update t_user set name=#{name},password=#{password},age=#{age} where id=#{id}")
	int updateByPrimaryKey(User user);

	@Delete("delete from t_user where id = #{id}")
	int deleteByPrimaryKey(Integer id);

	// DQL : 查询

	@Select("select * from t_user where id = #{id}")
	User selectByPrimaryKey(Integer id);

	@Select("select * from t_user")
	List<User> selectList();

}
