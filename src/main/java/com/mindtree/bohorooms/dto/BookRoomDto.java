package com.mindtree.bohorooms.dto;

public class BookRoomDto {
	
	private int facilityId;
	private String facilityName;
	private String roomNo;
	
	public BookRoomDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	

}
