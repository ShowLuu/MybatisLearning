package com.ss.mybatis.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	@Select("select * from knowledge_user ")
	public void findAll();
	
	@Delete("delete from knowledge_user where id=#{id}")
	public void delete(Long id);

}
