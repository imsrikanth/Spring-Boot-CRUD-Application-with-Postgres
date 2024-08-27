package com.crud.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crud.beans.UserDataBean;
import com.crud.entities.UserDataEntity;

@Transactional
@Repository("userDataDao")
public class UserDataDaoImpl implements UserDataDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveDetails(UserDataBean userDataBean) {
		System.out.println("start of saveDetails");
		Session session = null;
		
		try {
			
			session = sessionFactory.getCurrentSession();
			UserDataEntity userData = new UserDataEntity();
			
			userData.setFirstname(userDataBean.getFirstName());
			userData.setLastname(userDataBean.getLastName());
			userData.setEmail(userDataBean.getEmail());
			userData.setGender(userDataBean.getGender());
			userData.setJobtitle(userDataBean.getJobTitle());
			
			//sessionFactory.getCurrentSession().save(userData);
			session.save(userData);
			System.out.println("data saved");
			
		} catch (HibernateException e) {
			System.out.println("hibernate exception");
		}
		
		System.out.println("end of saveDetails");

		
	}

}
