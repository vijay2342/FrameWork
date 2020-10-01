package org.btm.oneApp;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class TestDao {
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration( );
		cfg.configure( );
		SessionFactory sef=cfg.buildSessionFactory( );
		Session ses=sef.openSession( );
		Transaction tran=ses.beginTransaction( );
		//INSERT 1 RECORD
		AadharCard aac=new AadharCard();
		aac.setName("vedashree");
		Student s=new Student();
		s.setName("veda");
		s.setAadar(aac);
		ses.save(s);
		//INSERT 2 RECORD
		AadharCard aac1=new AadharCard();
		aac.setName("krishnegowda");
		Student s1=new Student();
		s.setName("gowda");
		s.setAadar(aac1);
		ses.save(s1);
		tran.commit( );
		ses.close( );
	}

}
