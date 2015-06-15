package com.lotusfan.model;

import java.math.BigInteger;

public class Numm extends ParentModel{

	private BigInteger num; //
	private Integer id; //

	public BigInteger getNum() {
		return num;
	}
	public void setNum (BigInteger num) {
		this.num = num;
	}
	public Integer getId() {
		return id;
	}
	public void setId (Integer id) {
		this.id = id;
	}
}