package edu.mum.cs.cs425.studentmgmt.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "transcripts")
@Entity
public class Transcript {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transcriptId;
	private String degreeTitle;
	
	public Transcript() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transcript(String degreeTitle) {
		super();
		this.degreeTitle = degreeTitle;
	}

	public long getTranscriptId() {
		return transcriptId;
	}

	public void setTranscriptId(long transcriptId) {
		this.transcriptId = transcriptId;
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	@Override
	public String toString() {
		return "Transcript [transcriptId=" + transcriptId + ", degreeTitle=" + degreeTitle + "]";
	}
	


}
