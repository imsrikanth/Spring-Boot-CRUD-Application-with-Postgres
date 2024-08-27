package com.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.beans.UserDataBean;
import com.crud.dao.UserDataDao;

@Service
public class UserDataServiceImpl implements UserDataService {
	
	@Autowired
	UserDataDao userDataDao;


	@Override
	@Transactional
	public void saveDetails(UserDataBean userDataBean) {
		userDataDao.saveDetails(userDataBean);
		
	}



}
