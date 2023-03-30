package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class UserDao {

	public static int register(User u)
	{
		int i=0;
		StandardServiceRegistry ssr=
				new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		//2. Pass registry object to MetaData
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		//3. create an instance of session factory
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		//4. Open a session
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		i=(Integer) session.save(u);
		t.commit();
		session.close();
		return i;
		
	}
}
