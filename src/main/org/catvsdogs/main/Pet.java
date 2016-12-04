package org.catvsdogs.main;

public class Pet {

	private String name;
	private int keepMeVotes = 0;
	private int throwMeVotes = 0;
	
	public int getKeepMeVotes() {
		return keepMeVotes;
	}
	public void setKeepMeVotes(int keepMeVotes) {
		this.keepMeVotes = keepMeVotes;
	}
	public int getThrowMeVotes() {
		return throwMeVotes;
	}
	public void setThrowMeVotes(int throwMeVotes) {
		this.throwMeVotes = throwMeVotes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addKeepMeVote(){
		this.keepMeVotes += 1;
	}
	public void addThrowMeVote(){
		this.throwMeVotes += 1;
	}
	
	
	
}
