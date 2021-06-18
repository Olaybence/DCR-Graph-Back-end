package com.DCR.rest.webservices.restfulwebservices.graph;

// Declaring the link class
public class Link {
    
	// Defining private variables
    private String from;
    private String fromArrow;
    private String fromPort;
    private long key;
    private String to;
    private String toArrow;
    private String toPort;
    
    // Defining a public link with set variables
    public Link() {
    	this.from = "Alpha";
    	this.fromArrow = "";
    	this.fromPort = "r";
    	this.key = -1;
    	this.to = "Beta";
    	this.toArrow = "BackSlash";
    	this.toPort = "l";
    }

    // Defining a public link for receiving input
    public Link(String from, String fromArrow, String fromPort, long key, 
    		String to, String toArrow, String toPort) {
    	this.from = from;
    	this.fromArrow  = fromArrow;
    	this.fromPort = fromPort;
    	this.key = key;
    	this.to = to;
    	this.toArrow = toArrow;
    	this.toPort = toPort;
    }

    // Defining Getters and Setters for the variables
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getFromArrow() {
		return fromArrow;
	}

	public void setFromArrow(String fromArrow) {
		this.fromArrow = fromArrow;
	}

	public String getFromPort() {
		return fromPort;
	}

	public void setFromPort(String fromPort) {
		this.fromPort = fromPort;
	}

	public long getKey() {
		return key;
	}

	public void setKey(long key) {
		this.key = key;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getToArrow() {
		return toArrow;
	}

	public void setToArrow(String toArrow) {
		this.toArrow = toArrow;
	}

	public String getToPort() {
		return toPort;
	}

	public void setToPort(String toPort) {
		this.toPort = toPort;
	}
    
    
}
