package com.conference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConferenceRoom {

	
	List<Rooms> smallRoom = new ArrayList<Rooms>();
	List<Rooms> medRoom = new ArrayList<Rooms>();
	List<Rooms> largeRoom = new ArrayList<Rooms>();
	
	public ConferenceRoom() {
		// initialize available Rooms 
		for(int i =0;i<5;i++) {
			Rooms room = new Rooms();
			room.setEndTime(-1);
			room.setStartTime(-1);
			room.setIsAvailable(true);
			room.setRoomName("S100"+i);
			room.setRoomSize(10 +i*5);
			smallRoom.add(room);
			Rooms room1 = new Rooms();
			room1.setEndTime(-1);
			room1.setStartTime(-1);
			room1.setIsAvailable(true);
			room1.setRoomName("S100"+i);
			room1.setRoomSize(50 +i*5);
			medRoom.add(room1);
			Rooms room2 = new Rooms();
			room2.setEndTime(-1);
			room2.setStartTime(-1);
			room2.setIsAvailable(true);
			room2.setRoomName("S100"+i);
			room2.setRoomSize(100 +i*5);
			largeRoom.add(room);
			
			
		}
		
	}
	
	// provide a method to add new Rooms in future// 
	
	public boolean addRoom() {
		
		return true;
	}
	
	
	// Book a room by Name and Time 
	
	public Rooms bookRoom(String name, int startTime) {
		
		if(startTime >23 || startTime<0) {
			return null;
		}
		
		Rooms room=null;
		boolean roomFound = false;
		Iterator<Rooms> iterator = smallRoom.iterator();
		int i = -1;
		while(iterator.hasNext()) {
			 room = iterator.next();
			 i++;
			if(room.getRoomName().equals(name)&& (room.getStartTime()<startTime || (room.getStartTime()==23 && startTime!=23)) ) {
				if(startTime==23) {
					room.setEndTime(0);
				}else {
					room.setEndTime(startTime+1);
				}
				room.setStartTime(startTime);
				
				
				iterator.remove();
				roomFound = true;
				break;
			}
		}
		
		if(roomFound){
			smallRoom.set(i,room);
			return room;
		}
	
		/*iterator = medRoom.iterator();
		i=-1;
		while(iterator.hasNext()) {
			room = iterator.next();
			if(room.getRoomName().equals(name) && room.isAvailable) {
					room.setStartTime(startTime);
					room.setEndTime(startTime+1);
					iterator.remove();
					roomFound=true;
					break;
			}
		}
		if(roomFound){
			medRoom.set(i,room);
			return room;
		}
		iterator = largeRoom.iterator();
		i=-1;
		while(iterator.hasNext()) {
			room = iterator.next();
			if(room.getRoomName().equals(name) && room.isAvailable) {
					room.setStartTime(startTime);
					room.setEndTime(startTime+1);
					iterator.remove();
					
					break;
			}
		}
		
		if(roomFound){
			largeRoom.set(i,room);
			return room;
		}*/
		
		
		return null;
	}
	
	public Rooms bookRoom(int size,int startTime) {
		if(startTime >23 || startTime<0) {
			return null;
		}
		
		Rooms room=null;
		boolean roomFound=  false;
		
			Iterator<Rooms> iterator = smallRoom.iterator();
			int i=-1;
			while(iterator.hasNext()) {
				room = iterator.next();
				i++;
				if(room.getRoomSize()>size &&  (room.getStartTime()<startTime || (room.getStartTime()==23 && startTime!=23))) {
						room.setStartTime(startTime);
						room.setEndTime(startTime+1);
						//iterator.remove();
						roomFound = true;
						break;
				}
			}
			
			if(roomFound){
				smallRoom.set(i,room);
				return room;
			}
		
		/*	iterator = medRoom.iterator();
			i=-1;
			while(iterator.hasNext()) {
				room = iterator.next();
				if(room.getRoomSize()<size && room.isAvailable) {
						room.setStartTime(startTime);
						room.setEndTime(startTime+1);
						iterator.remove();
						roomFound=true;
						break;
				}
			}
			if(roomFound){
				medRoom.set(i,room);
				return room;
			}
			
			iterator = largeRoom.iterator();
			i=-1;
			while(iterator.hasNext()) {
				room = iterator.next();
				if(room.getRoomSize()<size && room.isAvailable) {
						room.setStartTime(startTime);
						room.setEndTime(startTime+1);
						iterator.remove();
						roomFound=true;
						break;
				}
			}
			if(roomFound){
				largeRoom.set(i,room);
				return room;
			}
*/			
			
		
		return null;
	}
	
}
