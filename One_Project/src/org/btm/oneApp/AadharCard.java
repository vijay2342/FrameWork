package org.btm.oneApp;

import javax.persistence.*;
@Entity
@Table(name="Aadar_Details")
public class AadharCard 
{
	@Id
	@GeneratedValue
	private int aadno;
	private String name;
	public int getAadno() {
		return aadno;
	}
	public void setAadno(int aadno) {
		this.aadno = aadno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
