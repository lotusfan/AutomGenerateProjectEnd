package com.lotusfan.model;

import java.math.BigInteger;

public class CommArea extends ParentModel{

	private BigInteger id; //
	private String name; //
	private String description; //
	private String status; //
	private BigInteger parentId; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription (String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public BigInteger getParentId() {
		return parentId;
	}
	public void setParentId (BigInteger parentId) {
		this.parentId = parentId;
	}
}