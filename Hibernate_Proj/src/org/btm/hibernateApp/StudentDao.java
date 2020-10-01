package org.btm.hibernateApp;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class StudentDao {

	public static void main(String[] args) 
	{
		Student s=new Student( );
		s.setName("veda");
		
		Configuration cfg=new Configuration( );
		cfg.configure( );
		SessionFactory sef=cfg.buildSessionFactory( );
		Session ses=sef.openSession( );
		Transaction tran=ses.beginTransaction( );
		ses.save(s);
		tran.commit( );
		ses.close( );
	}

}
