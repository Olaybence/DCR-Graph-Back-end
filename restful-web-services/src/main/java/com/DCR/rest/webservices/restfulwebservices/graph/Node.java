package com.DCR.rest.webservices.restfulwebservices.graph;

public class Node {
    
    private String color;
    private long key;
    private String pend;
    private String text;
    
    protected Node() {
    	
    }
    
    public Node(String color, long key, String pend, String text) {
    	super();
    	this.color = color;
    	this.key = key;
    	this.pend = pend;
    	this.text = text;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getKey() {
		return key;
	}

	public void setKey(long key) {
		this.key = key;
	}

	public String getPend() {
		return pend;
	}

	public void setPend(String pend) {
		this.pend = pend;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
