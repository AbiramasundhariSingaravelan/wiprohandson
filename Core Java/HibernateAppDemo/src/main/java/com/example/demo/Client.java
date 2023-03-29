package com.example.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//1. Creating ServiceRegistryObject to pass configuration details
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
		Employee e1=new Employee();
		e1.setEno(100);
		e1.setFirstName("Arthi");
		e1.setLastName("Singaravelan");
		session.save(e1);
		t.commit();
		System.out.println("Successfully saved");
		factory.close();
		session.close();
	}

}
