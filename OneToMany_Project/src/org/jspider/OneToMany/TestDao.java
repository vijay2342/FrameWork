package org.jspider.OneToMany;
import java.util.*;
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
		
		BankAccount acc1=new BankAccount( );
		acc1.setAccno("2013156987");
		BankAccount acc2=new BankAccount( );
		acc2.setAccno("2018963547");
		BankAccount acc3=new BankAccount( );
		acc3.setAccno("1023596784");
		
		List<BankAccount> blst=new ArrayList<BankAccount>( );
		blst.add(acc1);
		blst.add(acc2);
		blst.add(acc3);
		
		Person p=new Person( );
		p.setName("vijay");
		p.setAcc(blst);
		ses.save(p);
		
		tran.commit( );
		ses.close( );
	}

}
