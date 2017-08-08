package com.dituhui.openapi.dbm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dituhui.openapi.dbm.dao.DemoDao;
import com.dituhui.openapi.dbm.service.IDemoService;
import com.dituhui.openapi.dbm.entity.Demo;

@Service
@Transactional(rollbackFor = Exception.class)
public class DemoService implements IDemoService {

	@Autowired
	private DemoDao demoDao;

	@Override
	public Demo save(Demo demo) {
		return demoDao.save(demo);
	}

	@Override
	public void delete(Integer userId) {
		demoDao.delete(userId);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Demo findByUserId(Integer userId) {
		return demoDao.findByUserId(userId);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Demo query(Integer userId) {
		return demoDao.query(userId);
	}

	@Override
	public int modify(String username, Integer userId) {
		return demoDao.modify(username, userId);
	}

	@Override
	public Demo customUpdate(Demo demo) {
		return demoDao.customUpdate(demo);
	}

	@Override
	public void customDelete1(Integer userId) {
		demoDao.customDelete1(userId);
	}

	@Override
	public int customDelete2(Integer userId) {
		return demoDao.customDelete2(userId);
	}

}
