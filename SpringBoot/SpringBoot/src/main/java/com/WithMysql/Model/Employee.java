package com.WithMysql.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int EMPID;
	@Column
	private String EMPNAME;
	@Column
	private String EMPSURNAME;
	@Column
	private int AGE;
	@Column
	private String GENDER;
	public int getEMPID() {
		return EMPID;
	}
	public void setEMPID(int eMPID) {
		EMPID = eMPID;
	}
	public String getEMPNAME() {
		return EMPNAME;
	}
	public void setEMPNAME(String eMPNAME) {
		EMPNAME = eMPNAME;
	}
	public String getEMPSURNAME() {
		return EMPSURNAME;
	}
	public void setEMPSURNAME(String eMPSURNAME) {
		EMPSURNAME = eMPSURNAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	@Override
	public String toString() {
		return "Employee [EMPID=" + EMPID + ", EMPNAME=" + EMPNAME + ", EMPSURNAME=" + EMPSURNAME + ", AGE=" + AGE
				+ ", GENDER=" + GENDER + "]";
	}
 
}
