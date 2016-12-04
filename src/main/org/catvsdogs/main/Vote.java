package org.catvsdogs.main;

public class Vote {

	private String vote;
	private String keepPet;
	private String throwPet;
	private int votes = 0;
	
	public Vote(String vote){
		String[] voteSplitted = vote.split(" ");
		this.setVote(vote);
		this.keepPet = voteSplitted[0];
		this.throwPet = voteSplitted[1];
		this.votes += 1;
	}
	
	public String getKeepPet() {
		return keepPet;
	}
	public void setKeepPet(String keepPet) {
		this.keepPet = keepPet;
	}
	public String getThrowPet() {
		return throwPet;
	}
	public void setThrowPet(String throwPet) {
		this.throwPet = throwPet;
	}
	public void addVote(){
		this.votes += 1;
	}
	
	public int getVotes(){
		return this.votes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((keepPet == null) ? 0 : keepPet.hashCode());
		result = prime * result
				+ ((throwPet == null) ? 0 : throwPet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		if (keepPet == null) {
			if (other.keepPet != null)
				return false;
		} else if (!keepPet.equals(other.keepPet))
			return false;
		if (throwPet == null) {
			if (other.throwPet != null)
				return false;
		} else if (!throwPet.equals(other.throwPet))
			return false;
		return true;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}
	
	
	
}
