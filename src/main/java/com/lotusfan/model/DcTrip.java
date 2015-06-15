package com.lotusfan.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class DcTrip extends ParentModel{

	private BigInteger id; //
	private Timestamp tripTime; //
	private BigInteger dcId; //

	public BigInteger getId() {
		return id;
	}
	public void setId (BigInteger id) {
		this.id = id;
	}
	public Timestamp getTripTime() {
		return tripTime;
	}
	public void setTripTime (Timestamp tripTime) {
		this.tripTime = tripTime;
	}
	public BigInteger getDcId() {
		return dcId;
	}
	public void setDcId (BigInteger dcId) {
		this.dcId = dcId;
	}
}