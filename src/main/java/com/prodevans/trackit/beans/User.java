package com.prodevans.trackit.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="registration")
public class User
{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int S_no;
	
	
	@Column
	private String E_id;
	
	@Column
	private String E_username;
	
	@Column
	private String E_password;
	
	@Column
	private String E_role;

	public int getS_no() {
		return S_no;
	}

	public void setS_no(int s_no) {
		S_no = s_no;
	}

	public String getE_id() {
		return E_id;
	}

	public void setE_id(String e_id) {
		E_id = e_id;
	}

	public String getE_username() {
		return E_username;
	}

	public void setE_username(String e_username) {
		E_username = e_username;
	}

	public String getE_password() {
		return E_password;
	}

	public void setE_password(String e_password) {
		E_password = e_password;
	}

	public String getE_role() {
		return E_role;
	}

	public void setE_role(String e_role) {
		E_role = e_role;
	}
	

}
