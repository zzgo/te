package com.dituhui.openapi.dbm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.dituhui.openapi.dbm.dao.DemoDaoCustom;
import com.dituhui.openapi.dbm.entity.Demo;

public class DemoDaoImpl implements DemoDaoCustom {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Demo customUpdate(Demo demo) {
		return em.merge(demo);
	}

	@Override
	public void customDelete1(Integer userId) {
		em.remove(em.find(Demo.class, userId));
	}
	
	@Override
	public int customDelete2(Integer userId) {
		return em.createQuery("delete from Demo demo where demo.userId=:userId")
			.setParameter("userId", userId)
			.executeUpdate();
	}

}
