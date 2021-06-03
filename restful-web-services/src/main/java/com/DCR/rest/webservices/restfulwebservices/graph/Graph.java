package com.DCR.rest.webservices.restfulwebservices.graph;

import java.util.Date;
import java.util.List;


public class Graph {
	public enum Location {
		LOCAL,
		SHARED
	};
	
	// private long graphID;
	//private String username;
	//private long creatorID;
	//private String description;
	//private Date creationDate;
	//private Date lastOpened;
	//private List collaborators;
	//private List graphRelationData;
	//private List changeLog;
	
	private long id;
	private Location location;
	private String name;
	private String description;
	private String shortDescription;
	private List<String> comments;
	private List<String> collaborators;
	private List<String> roles;
	private long startRoles;
	private List<String> nodes;
	
	protected Graph() {
		
	}
			
	
	//public Graph(long graphID, String username, long creatorID, String description, Date creationDate, Date lastOpened, List collaborators, List graphRelationData, List changeLog) {
	public Graph(long id, String name, String description, String shortDescription, List<String> comments, 
			List<String> collaborators, List<String> roles, long startRoles, List<String> nodes, Location location) {	
		super();
		//this.graphID = graphID;
		//this.username = username;
		//this.creatorID = creatorID;
		//this.description = description;
		//this.creationDate = creationDate;
		//this.lastOpened = lastOpened;
		//this.collaborators = collaborators;
		//this.graphRelationData = graphRelationData;
		//this.changeLog = changeLog;
		this.id = id;
		this.name = name;
		this.description = description;
		this.shortDescription = shortDescription;
		this.comments = comments;
		this.collaborators = collaborators;
		this.roles = roles;
		this.startRoles = startRoles;
		this.nodes = nodes;
		this.location = location;
	}
	
	
	//public long getGraphID() {
	//	return graphID;
	//}

	//public void setGraphID(long graphID) {
	//	this.graphID = graphID;
	//}

	//public long getCreatorID() {
	//	return creatorID;
	//}

	//public void setCreatorID(long creatorID) {
	//	this.creatorID = creatorID;
	//}

	//public Date getCreationDate() {
	//	return creationDate;
	//}

	//public void setCreationDate(Date creationDate) {
	//	this.creationDate = creationDate;
	//}

	//public Date getLastOpened() {
	//	return lastOpened;
	//}

	//public void setLastOpened(Date lastOpened) {
	//	this.lastOpened = lastOpened;
	//}

	//public List getCollaborators() {
	//	return collaborators;
	//}

	//public void setCollaborators(List collaborators) {
	//	this.collaborators = collaborators;
	//}

	//public List getGraphRelationData() {
	//	return graphRelationData;
	//}

	//public void setGraphRelationData(List graphRelationData) {
	//	this.graphRelationData = graphRelationData;
	//}

	//public List getChangeLog() {
	//	return changeLog;
	//}

	//public void setChangeLog(List changeLog) {
	//	this.changeLog = changeLog;
	//}

	//public String getUsername() {
	//	return username;
	//}
	//public void setUsername(String username) {
	//	this.username = username;
	//}
	//public String getDescription() {
	//	return description;
	//}
	//public void setDescription(String description) {
	//	this.description = description;
	//}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public List<String> getNodes() {
		return nodes;
	}


	public void setNodes(List<String> nodes) {
		this.nodes = nodes;
	}


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
