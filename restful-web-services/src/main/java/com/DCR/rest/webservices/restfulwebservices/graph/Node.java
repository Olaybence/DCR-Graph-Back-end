package com.DCR.rest.webservices.restfulwebservices.graph;

// Defining a node class
public class Node {
    
	// Declaring private variables
    private String color;
    private String key;
    private Boolean pending;
    private String text;
    
    // Definition of a node
    public Node(String key) {
    	this.color = "lightblue";
    	this.key = key;
    	this.pending = true;
    	this.text = key;
    }
    
    // Definition of a node
    public Node(String color, String key, Boolean pending, String text) {
    	super();
    	this.color = color;
    	this.key = key;
    	this.pending = pending;
    	this.text = text;
    }

    // Getter and Setter functions
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

	public void setPending(Boolean pending) {
		this.pending = pending;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
