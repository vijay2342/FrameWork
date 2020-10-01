package org.qspider.manytoApp;
import javax.persistence.*;
@Entity
@Table
public class BankAccount 
{
	@Id
	@GeneratedValue
	private int bid;
	private String accname;
	private String accno;
	@ManyToOne(cascade=CascadeType.ALL)
	private person prsn;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public person getPrsn() {
		return prsn;
	}
	public void setPrsn(person prsn) {
		this.prsn = prsn;
	}
	
}
