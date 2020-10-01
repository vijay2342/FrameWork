package org.btm.oneApp;
import javax.persistence.*;
@Entity
@Table(name="Student_Details")
public class Student 
{
	@Id
	@GeneratedValue
	private int rollno;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	private AadharCard aadar;
	
	public void setAadar(AadharCard aadar) {
		this.aadar = aadar;
	}
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
	public AadharCard getAadar() {
		return aadar;
	}
}
