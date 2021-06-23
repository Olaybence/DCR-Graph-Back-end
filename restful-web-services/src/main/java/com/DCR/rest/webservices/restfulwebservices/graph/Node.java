package com.DCR.rest.webservices.restfulwebservices.graph;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// Defining a node class
@Entity
public class Node {
	
	@Id
	private String key;
	
	//private Graph graph;
    
	// Declaring private variables
    private String color;
    private Boolean pending;
    private String text;
    private String loc;
    
    // Definition of a node
    public Node(String key) {
    	this.color = "lightblue";
    	this.key = key;
    	this.pending = true;
    	this.text = key;
    	this.loc = "0 0";
    }
    
    // Definition of a node
    public Node(String color, String key, Boolean pending, String text, String loc) {
    	super();
    	this.color = color;
    	this.key = key;
    	this.pending = pending;
    	this.text = text;
    	this.loc = loc;
    }
    

    // Getter and Setter functions
    
    /*@ManyToOne(targetEntity = Graph.class)
    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }*/

    public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
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
