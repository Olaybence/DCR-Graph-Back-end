package com.DCR.rest.webservices.restfulwebservices.graph;

public class Node {
    
    private String color;
    private String key;
    private Boolean pending;
    private String text;
    
    public Node(String key) {
    	this.color = "lightblue";
    	this.key = key;
    	this.pending = true;
    	this.text = key;
    }
    
    public Node(String color, String key, Boolean pending, String text) {
    	super();
    	this.color = color;
    	this.key = key;
    	this.pending = pending;
    	this.text = text;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Boolean getPending() {
		return this.pending;
	}

	public void setPending(Boolean pend) {
		this.pending = pending;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
