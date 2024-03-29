package com.mobusher.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medicine")
public class Medicine {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int mid;

	@Column(name = "Name")
	private String name;

	// Prescribed or Over the counter
	@Column(name = "Type")
	private String type;

	@Column(name = "Amount")
	private int amount;

	public int getmId() {
		return mid;
	}

	public void setmId(int mId) {
		this.mid = mId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


}
