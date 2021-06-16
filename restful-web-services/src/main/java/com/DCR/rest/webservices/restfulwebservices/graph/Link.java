package com.DCR.rest.webservices.restfulwebservices.graph;


public class Link {
    
    private String from;
    private String fromAr;
    private String fromPort;
    private long key;
    private String to;
    private String toArrow;
    private String toPort;
    
    protected Link() {
    	
    }
    
    public Link(String from, String fromAr, String fromPort, long key, 
    		String to, String toArrow, String toPort) {
    	this.from = from;
    	this.fromAr  = fromAr;
    	this.fromPort = fromPort;
    	this.key = key;
    	this.to = to;
    	this.toArrow = toArrow;
    	this.toPort = toPort;
    }

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getFromAr() {
		return fromAr;
	}

	public void setFromAr(String fromAr) {
		this.fromAr = fromAr;
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
