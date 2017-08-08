package com.dituhui.openapi.dbm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dituhui.openapi.dbm.service.IDmdeService;

@Service
@Transactional(rollbackFor = Exception.class)
public class DmdeService implements IDmdeService {

}
