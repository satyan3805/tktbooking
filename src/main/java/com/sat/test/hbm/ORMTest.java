package com.sat.test.hbm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sat.tktbooking.UserEntity;

public class ORMTest {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

//		User u1 = new User();
//		u1.setUserId(1);
//		u1.setFirstName("satya");
//		u1.setLastName("navara");
//		session.save(u1);
		
		RegularEmployee r1 = new RegularEmployee(104, "mat", "12-12-1999", "1-1-2023");
		session.save(r1);
		
		ContractEmployee c1 = new ContractEmployee(104, "bat", "12-12-1999", "1-1-2023");
		session.save(c1);
		
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();

	}

}
