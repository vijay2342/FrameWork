package org.qspider.manytoApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration( );
		cfg.configure( );
		SessionFactory sef=cfg.buildSessionFactory( );
		Session ses=sef.openSession( );
		Transaction tran=ses.beginTransaction( );
		
		person p=new person( );
		p.setName("vijay");
		
		BankAccount bc1=new BankAccount( );
		bc1.setAccname("vijay.k");
		bc1.setAccno("10235698744");
		bc1.setPrsn(p);
		
		BankAccount bc2=new BankAccount( );
		bc2.setAccname("vijay.k");
		bc2.setAccno("10235695896");
		bc2.setPrsn(p);
		
		BankAccount bc3=new BankAccount( );
		bc3.setAccname("vijay.k");
		bc3.setAccno("10235692475");
		bc3.setPrsn(p);
		
		ses.save(bc1);
		ses.save(bc2);
		ses.save(bc3);
		
		tran.commit();
		ses.close( );
	}

}
