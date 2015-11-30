package com.hibernate.test.DAO;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hibernate.test.api.UserDAOInterface;
import com.hibernate.test.pojo.User;
import com.hibernate.test.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl extends CustomHibernateDaoSupport implements UserDAOInterface {
	private static UserDAOInterface userDAOImpl; 
	
	protected UserDAOImpl()
	{
		
	}
	
	public User getUserInfo(String username, String password)
	{
		return null;
		/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		try
		{
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.eq("username",username));
			criteria.add(Restrictions.eq("password",password));
			
			List<User> result = criteria.list();
			if(result.isEmpty())
				return null;
			User user = result.get(0);
			session.close();
			return user;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			session.close();
			return null;
		}*/
	}
	
	public void createUser(User newUser)
	{
		/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try
		{
			session.save(newUser);
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		session.close();*/
	}
	
	public void editProfile(User user)
	{
		/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try
		{
			session.saveOrUpdate(user);
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}
	
	@Override
	public User findByUserName(String username) {
		List<User> users = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(User.class).list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}

	}
}