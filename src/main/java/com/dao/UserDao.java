package com.dao;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.User;
public class UserDao {

	private SessionFactory factory=null;
	private Session session=null;
	private Transaction tx=null;
	

	public UserDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public boolean saveuser(User user)
	{
		
		boolean f=false;
		try {
			
			session=factory.openSession();
			session.beginTransaction();
			
			session.save(user);
			tx.commit();
			f=true;
			
			
		} catch (Exception e) {
		
			if(tx !=null) {
				f = false;
				e.printStackTrace();
			}
				
		
	}
	return f;
}
}
