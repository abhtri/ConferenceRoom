package com.conference;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConferenceRoom conferenceRoom= new ConferenceRoom();
		Rooms room =conferenceRoom.bookRoom(5, 10);
		System.out.println(room.getRoomName());
		 room =conferenceRoom.bookRoom("S1002", 10);
		 System.out.println(room.getRoomName());
		
		
	}

}
