package com.DCR.rest.webservices.restfulwebservices.graph;

import java.util.Date;
import java.util.List;

public class Graph {
	
	private long graphID;
	private String username;
	private long creatorID;
	private String description;
	private Date creationDate;
	private Date lastOpened;
	private List collaborators;
	private List graphRelationData;
	private List changeLog;
	
	protected Graph() {
		
	}
			
	
	public Graph(long graphID, String username, long creatorID, String description, Date creationDate, Date lastOpened, List collaborators, List graphRelationData, List changeLog) {
		super();
		this.graphID = graphID;
		this.username = username;
		this.creatorID = creatorID;
		this.description = description;
		this.creationDate = creationDate;
		this.lastOpened = lastOpened;
		this.collaborators = collaborators;
		this.graphRelationData = graphRelationData;
		this.changeLog = changeLog;
	}
	
	
	public long getGraphID() {
		return graphID;
	}

	public void setGraphID(long graphID) {
		this.graphID = graphID;
	}

	public long getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(long creatorID) {
		this.creatorID = creatorID;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastOpened() {
		return lastOpened;
	}

	public void setLastOpened(Date lastOpened) {
		this.lastOpened = lastOpened;
	}

	public List getCollaborators() {
		return collaborators;
	}

	public void setCollaborators(List collaborators) {
		this.collaborators = collaborators;
	}

	public List getGraphRelationData() {
		return graphRelationData;
	}

	public void setGraphRelationData(List graphRelationData) {
		this.graphRelationData = graphRelationData;
	}

	public List getChangeLog() {
		return changeLog;
	}

	public void setChangeLog(List changeLog) {
		this.changeLog = changeLog;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (graphID ^ (graphID >>> 32));
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
		Graph other = (Graph) obj;
		if (graphID != other.graphID)
			return false;
		return true;
	}
}
