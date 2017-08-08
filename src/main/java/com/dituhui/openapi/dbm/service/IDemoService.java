package com.dituhui.openapi.dbm.service;

import com.dituhui.openapi.dbm.entity.Demo;

public interface IDemoService {

	public Demo save(Demo demo);

	public void delete(Integer userId);

	public Demo findByUserId(Integer userId);

	public Demo query(Integer userId);

	public int modify(String username, Integer userId);

	public Demo customUpdate(Demo demo);

	public void customDelete1(Integer userId);

	public int customDelete2(Integer userId);
}
