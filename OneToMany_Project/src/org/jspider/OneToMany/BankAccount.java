package org.jspider.OneToMany;
import javax.persistence.*;
@Entity
@Table(name="Bank_Details")
public class BankAccount 
{
	@Id
	@GeneratedValue
	private int accId;
	private String accno;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	
}
