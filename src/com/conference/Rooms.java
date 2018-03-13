package com.conference;

import java.util.Comparator;

public class Rooms implements Comparator{
	
	String roomName;
	int roomSize;
	boolean isAvailable;
	int startTime,endTime;
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}
	public boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(boolean b) {
		this.isAvailable = b;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	@Override
	public int compare(Object arg,Object arg1) {
		// TODO Auto-generated method stub
		Rooms room = (Rooms)arg;
		Rooms room1 = (Rooms)arg1;
		return room.getRoomName().compareTo(room1.getRoomName());
		
		
	}
	
	

}
