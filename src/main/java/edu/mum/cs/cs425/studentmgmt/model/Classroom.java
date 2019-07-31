package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "classrooms")
@Entity
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long classroomId;
	private String buildingName;
	private String roomNumber;
	
	public Classroom() {
		super();
	}
	
	public Classroom(String buildingName, String roomNumber) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

	public long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(long classroomId) {
		this.classroomId = classroomId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Classroom [classroomId=" + classroomId + ", buildingName=" + buildingName + ", roomNumber=" + roomNumber
				+ "]";
	}
	
	

}
