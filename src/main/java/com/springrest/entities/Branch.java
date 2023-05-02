package com.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int branchId;
	
	private String branchName;

	public Branch() {
		super();
	}

	public Branch(int branchId, String branchName) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + "]";
	}
	
	
	
}
