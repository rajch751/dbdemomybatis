package com.example.dbdemo.repo;


import java.util.Set;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DbDemoRepo {
	
	@Select("SELECT * FROM tocoe_admin_user WHERE user_id = #{userid}")
    public Set<String> findById(String userid);

}
