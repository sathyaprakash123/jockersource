package com.jockerspring.jockersource.api;

public class JokeClass {
	
	private int id ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSetup() {
		return setup;
	}
	public void setSetup(String setup) {
		this.setup = setup;
	}
	public String getPunchline() {
		return punchline;
	}
	public void setPunchline(String punchline) {
		this.punchline = punchline;
	}
	private String type;
	private String setup;
	private String punchline;
	
	

}
