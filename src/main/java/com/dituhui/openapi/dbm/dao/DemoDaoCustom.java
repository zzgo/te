package com.dituhui.openapi.dbm.dao;

import com.dituhui.openapi.dbm.entity.Demo;

public interface DemoDaoCustom {

	public Demo customUpdate(Demo demo);

	public void customDelete1(Integer userId);

	public int customDelete2(Integer userId);
}
