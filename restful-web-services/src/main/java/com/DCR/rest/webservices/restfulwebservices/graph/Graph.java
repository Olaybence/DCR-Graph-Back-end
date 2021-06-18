package com.DCR.rest.webservices.restfulwebservices.graph;

//Imports
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

// Class definition of the graph
// It is also declared as an entity which is used for database management
@Entity
public class Graph {
	
	// Enum for location
	public enum Location {
		LOCAL,
		SHARED
	};
	
	// Declarations of all graph variables
	// Id is defined as the important variable for database management
	@Id
	@GeneratedValue
	private Long id;
	
	private Location location;
	private String name;
	private LocalDate creationDate;
	private LocalDateTime lastOpened;
	private String description;
	private String shortDescription;
	private List<String> comments;
	private List<String> collaborators;
	private List<String> roles;
	private long startRoles;
	private List<Node> nodes;
	private List<Link> links;
	
	// Declaration of a protected graph
	protected Graph() {
		
	}
			
	// Declaring a public graph 
	public Graph(long id, String name, LocalDate creationDate, 
			LocalDateTime lastOpened, String description, 
			String shortDescription, List<String> comments, 
			List<String> collaborators, List<String> roles, long startRoles,
			List<Node> nodes, List<Link> links, Location location) {	
		super();
		this.id = id;
		this.name = name;
		this.creationDate = creationDate;
		this.lastOpened = lastOpened;
		this.description = description;
		this.shortDescription = shortDescription;
		this.comments = comments;
		this.collaborators = collaborators;
		this.roles = roles;
		this.startRoles = startRoles;
		this.location = location;
		this.nodes = nodes;
		this.links = links;
	}
	
	
	// Getter- and Setter functions for all variables
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	public LocalDateTime getLastOpened() {
		return lastOpened;
	}

	public void setLastOpened(LocalDateTime lastOpened) {
		this.lastOpened = lastOpened;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public List<String> getComments() {
		return comments;
	}


	public void setComments(List<String> comments) {
		this.comments = comments;
	}


	public List<String> getCollaborators() {
		return collaborators;
	}


	public void setCollaborators(List<String> collaborators) {
		this.collaborators = collaborators;
	}


	public List<String> getRoles() {
		return roles;
	}


	public void setRoles(List<String> roles) {
		this.roles = roles;
	}


	public long getStartRoles() {
		return startRoles;
	}


	public void setStartRoles(long startRoles) {
		this.startRoles = startRoles;
	}


	public List<Node> getNodes() {
		return nodes;
	}


	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}


	public List<Link> getLinks() {
		return links;
	}


	public void setLinks(List<Link> links) {
		this.links = links;
	}


	// Function for finding the hashCode determined by id
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	
	// Function for comparing
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Graph other = (Graph) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
