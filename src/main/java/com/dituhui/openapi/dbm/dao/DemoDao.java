package com.dituhui.openapi.dbm.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.dituhui.openapi.dbm.entity.Demo;

public interface DemoDao extends Repository<Demo, Integer>, DemoDaoCustom {

	public Demo save(Demo demo);

	public void delete(Integer userId);

	public Demo findByUserId(Integer userId);

	@Query("from Demo demo where demo.userId=:userId")
	public Demo query(@Param("userId") Integer userId);

	@Modifying
	@Query("update Demo demo set demo.username=:username where demo.userId=:userId")
	public int modify(@Param("username") String username,
			@Param("userId") Integer userId);
}
