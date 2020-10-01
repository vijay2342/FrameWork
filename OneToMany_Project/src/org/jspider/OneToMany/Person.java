package org.jspider.OneToMany;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name="Person_Detals")
public class Person 
{
	@Id
	@GeneratedValue
	private int rollno;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	private List<BankAccount> acc;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BankAccount> getAcc() {
		return acc;
	}
	public void setAcc(List<BankAccount> acc) {
		this.acc = acc;
	}
	
	
}
