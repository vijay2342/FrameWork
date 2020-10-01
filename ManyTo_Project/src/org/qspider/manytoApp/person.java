package org.qspider.manytoApp;
import javax.persistence.*;
@Entity
@Table
public class person 
{
	@Id
	@GeneratedValue
	private int pid;
	private String name;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
