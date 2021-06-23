package com.DCR.rest.webservices.restfulwebservices.services;

// Imports
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.DCR.rest.webservices.restfulwebservices.graph.*;

// GraphServicelocal class, it is declared as a service
@Service
public class GraphServiceLocal {

	// Defining private variables
	private static List<Graph> graphsLocal = new ArrayList<Graph>();		
	private static long idCounter = 0;	
	
	// Defining the static list of local graphs
	static {
		
		List mockupNodesGraph0 = new ArrayList<Node>();
		mockupNodesGraph0.add(new Node("white","0",true,"Work","-194 -204.75")); 
		mockupNodesGraph0.add(new Node("white","02",false,"Take a nap","119 -161.75"));
		mockupNodesGraph0.add(new Node("white","03",true,"Get a snack","-101.5508899086422 164.37284749040788"));
		mockupNodesGraph0.add(new Node("white","04",false,"Take a nap","-211.10000610351562 -71.75"));
		mockupNodesGraph0.add(new Node("white","05",false,"Maybe work","221.89999389648438 95.25"));
		mockupNodesGraph0.add(new Node("white","06",false,"Take another nap","50.899993896484375 -63.75"));

		List mockupLinksGraph0 = new ArrayList<Link>();
		mockupLinksGraph0.add(new Link("0","","r",-1,"02","Block","l"));
		mockupLinksGraph0.add(new Link("02","","r",-2,"03","BackwardCircleFork","l"));
		mockupLinksGraph0.add(new Link("03","","r",-3,"04","PlusCircle","l"));
		mockupLinksGraph0.add(new Link("03","","r",-4,"05","BackSlash","l"));
		mockupLinksGraph0.add(new Link("03","","r",-5,"06","PlusCircle","l"));

		graphsLocal.add(new Graph(0, // id
		        "SEA", // name
		        LocalDateTime.of(2021,06,18,19,31), // creationDate
				LocalDateTime.now(), // lastOpened
		        "Working", // description
		        "Working", // shortDescription
		        new ArrayList(), // comments
		        new ArrayList(), // collaborators
		        new ArrayList(), // roles
		        0, // startRoles
		        mockupNodesGraph0, // nodes
		        mockupLinksGraph0, // links
		        Graph.Location.LOCAL)); // location
		
		List mockupNodesGraph1 = new ArrayList<Node>();
		mockupNodesGraph1.add(new Node("Blue","0",false,"Mads","-282 -86")); 
		mockupNodesGraph1.add(new Node("white","02",false,"Jonas","56 97"));
		mockupNodesGraph1.add(new Node("blue","022",true,"Bence1997","169 -79"));
		mockupNodesGraph1.add(new Node("red","03",false,"Emil","-69 -217"));
		mockupNodesGraph1.add(new Node("white","04",false,"idk","254 -247"));
		mockupNodesGraph1.add(new Node("white","042",true,"New Node","74.296875 -164.75"));
		mockupNodesGraph1.add(new Node("red","032",true,"Emil","65 5"));
		mockupNodesGraph1.add(new Node("green","0222",true,"Bence","100 -303"));
		mockupNodesGraph1.add(new Node("white","05",false,"New Node","-217 -287.75"));

		List mockupLinksGraph1 = new ArrayList<Link>();
		mockupLinksGraph1.add(new Link("0","","r",-1,"022","BackSlash","l"));
		mockupLinksGraph1.add(new Link("0","","r",-2,"02","PlusCircle","l"));
		mockupLinksGraph1.add(new Link("0","","r",-3,"03","BackSlash","l"));
		mockupLinksGraph1.add(new Link("03","","r",-4,"04","BackSlash","l"));
		mockupLinksGraph1.add(new Link("042","","r",-5,"04","BackSlash","l"));
		mockupLinksGraph1.add(new Link("032","","r",-6,"022","BackSlash","l"));

		graphsLocal.add(new Graph(1, // id
		        "Tasks", // name
		        LocalDateTime.of(2020,06,18,19,31), // creationDate
				LocalDateTime.of(2021,05,17,9,31), // lastOpened
		        "Graph for task development", // description
		        "Graph for task development", // shortDescription
		        new ArrayList(), // comments
		        new ArrayList(), // collaborators
		        new ArrayList(), // roles
		        0, // startRoles
		        mockupNodesGraph1, // nodes
		        mockupLinksGraph1, // links
		        Graph.Location.LOCAL)); // location
		
		List mockupNodesGraph2 = new ArrayList<Node>();
		mockupNodesGraph2.add(new Node("white","0",true,"Work","-194 -204.75")); 
		mockupNodesGraph2.add(new Node("white","02",false,"Take a nap","119 -161.75"));
		mockupNodesGraph2.add(new Node("white","03",true,"Get a snack","-101.5508899086422 164.37284749040788"));
		mockupNodesGraph2.add(new Node("white","04",false,"Take a nap","-211.10000610351562 -71.75"));
		mockupNodesGraph2.add(new Node("white","05",false,"Maybe work","221.89999389648438 95.25"));
		mockupNodesGraph2.add(new Node("white","06",false,"Take another nap","50.899993896484375 -63.75"));

		List mockupLinksGraph2 = new ArrayList<Link>();
		mockupLinksGraph2.add(new Link("0","","r",-1,"02","Block","l"));
		mockupLinksGraph2.add(new Link("02","","r",-2,"03","BackwardCircleFork","l"));
		mockupLinksGraph2.add(new Link("03","","r",-3,"04","PlusCircle","l"));
		mockupLinksGraph2.add(new Link("03","","r",-4,"05","BackSlash","l"));
		mockupLinksGraph2.add(new Link("03","","r",-5,"06","PlusCircle","l"));

		graphsLocal.add(new Graph(2, // id
		        "New graph", // name
		        LocalDateTime.of(2021,04,13,22,14), // creationDate
		        LocalDateTime.of(2021,05,25,13,22), // lastOpened
		        "Creating a new graph", // description
		        "Creating a new graph", // shortDescription
		        new ArrayList(), // comments
		        new ArrayList(), // collaborators
		        new ArrayList(), // roles
		        0, // startRoles
		        mockupNodesGraph2, // nodes
		        mockupLinksGraph2, // links
		        Graph.Location.LOCAL)); // location
		
		List mockupNodesGraph3 = new ArrayList<Node>();
		mockupNodesGraph3.add(new Node("Blue","0",false,"Mads","-282 -86")); 
		mockupNodesGraph3.add(new Node("white","02",false,"Jonas","56 97"));
		mockupNodesGraph3.add(new Node("blue","022",true,"Bence1997","169 -79"));
		mockupNodesGraph3.add(new Node("red","03",false,"Emil","-69 -217"));
		mockupNodesGraph3.add(new Node("white","04",false,"idk","254 -247"));
		mockupNodesGraph3.add(new Node("white","042",true,"New Node","74.296875 -164.75"));
		mockupNodesGraph3.add(new Node("red","032",true,"Emil","65 5"));
		mockupNodesGraph3.add(new Node("green","0222",true,"Bence","100 -303"));
		mockupNodesGraph3.add(new Node("white","05",false,"New Node","-217 -287.75"));
		
		/*Too long list
		List mockupLinksGraph3 = new ArrayList<Link>();
		mockupLinksGraph3.add(new Link("0","","r",-1,"022","BackSlash","l"));
		mockupLinksGraph3.add(new Link("0","","r",-2,"02","PlusCircle","l"));
		mockupLinksGraph3.add(new Link("0","","r",-3,"03","BackSlash","l"));
		mockupLinksGraph3.add(new Link("03","","r",-4,"04","BackSlash","l"));
		mockupLinksGraph3.add(new Link("042","","r",-5,"04","BackSlash","l"));
		mockupLinksGraph3.add(new Link("032","","r",-6,"022","BackSlash","l"));
		
		graphsLocal.add(new Graph(3, // id
		        "Thesis", // name
		        LocalDateTime.of(2020,06,18,19,31), // creationDate
				LocalDateTime.of(2021,05,17,9,31), // lastOpened
		        "DCR Graph for my thesis", // description
		        "DCR Graph for my thesis", // shortDescription
		        new ArrayList(), // comments
		        new ArrayList(), // collaborators
		        new ArrayList(), // roles
		        0, // startRoles
		        mockupNodesGraph3, // nodes
		        mockupLinksGraph3, // links
		        Graph.Location.LOCAL)); // location
		
		List mockupNodesGraph4 = new ArrayList<Node>();
		mockupNodesGraph4.add(new Node("white","0",true,"Work","-194 -204.75")); 
		mockupNodesGraph4.add(new Node("white","02",false,"Take a nap","119 -161.75"));
		mockupNodesGraph4.add(new Node("white","03",true,"Get a snack","-101.5508899086422 164.37284749040788"));
		mockupNodesGraph4.add(new Node("white","04",false,"Take a nap","-211.10000610351562 -71.75"));
		mockupNodesGraph4.add(new Node("white","05",false,"Maybe work","221.89999389648438 95.25"));
		mockupNodesGraph4.add(new Node("white","06",false,"Take another nap","50.899993896484375 -63.75"));

		List mockupLinksGraph4 = new ArrayList<Link>();
		mockupLinksGraph4.add(new Link("0","","r",-1,"02","Block","l"));
		mockupLinksGraph4.add(new Link("02","","r",-2,"03","BackwardCircleFork","l"));
		mockupLinksGraph4.add(new Link("03","","r",-3,"04","PlusCircle","l"));
		mockupLinksGraph4.add(new Link("03","","r",-4,"05","BackSlash","l"));
		mockupLinksGraph4.add(new Link("03","","r",-5,"06","PlusCircle","l"));

		
		graphsLocal.add(new Graph(4, // id
		        "Workflow", // name
		        LocalDateTime.of(2020,03,17,19,31), // creationDate
				LocalDateTime.of(2021,05,17,9,31), // lastOpened
		        "Graph defining workflow", // description
		        "Graph defining workflow", // shortDescription
		        new ArrayList(), // comments
		        new ArrayList(), // collaborators
		        new ArrayList(), // roles
		        0, // startRoles
		        mockupNodesGraph4, // nodes
		        mockupLinksGraph4, // links
		        Graph.Location.LOCAL)); // location
		
		List mockupNodesGraph5 = new ArrayList<Node>();
		mockupNodesGraph5.add(new Node("Blue","0",false,"Mads","-282 -86")); 
		mockupNodesGraph5.add(new Node("white","02",false,"Jonas","56 97"));
		mockupNodesGraph5.add(new Node("blue","022",true,"Bence1997","169 -79"));
		mockupNodesGraph5.add(new Node("red","03",false,"Emil","-69 -217"));
		mockupNodesGraph5.add(new Node("white","04",false,"idk","254 -247"));
		mockupNodesGraph5.add(new Node("white","042",true,"New Node","74.296875 -164.75"));
		mockupNodesGraph5.add(new Node("red","032",true,"Emil","65 5"));
		mockupNodesGraph5.add(new Node("green","0222",true,"Bence","100 -303"));
		mockupNodesGraph5.add(new Node("white","05",false,"New Node","-217 -287.75"));

		List mockupLinksGraph5 = new ArrayList<Link>();
		mockupLinksGraph5.add(new Link("0","","r",-1,"022","BackSlash","l"));
		mockupLinksGraph5.add(new Link("0","","r",-2,"02","PlusCircle","l"));
		mockupLinksGraph5.add(new Link("0","","r",-3,"03","BackSlash","l"));
		mockupLinksGraph5.add(new Link("03","","r",-4,"04","BackSlash","l"));
		mockupLinksGraph5.add(new Link("042","","r",-5,"04","BackSlash","l"));
		mockupLinksGraph5.add(new Link("032","","r",-6,"022","BackSlash","l"));

		graphsLocal.add(new Graph(4, // id
		        "Design", // name
		        LocalDateTime.of(2021,03,17,21,47), // creationDate
		        LocalDateTime.of(2021,05,20,01,31), // lastOpened
		        "Graph looking at design", // description
		        "Graph looking at design", // shortDescription
		        new ArrayList(), // comments
		        new ArrayList(), // collaborators
		        new ArrayList(), // roles
		        0, // startRoles
		        mockupNodesGraph5, // nodes
		        mockupLinksGraph5, // links
		        Graph.Location.LOCAL)); // location*/
		

		List mockupNodesGraph6 = new ArrayList<Node>();
		mockupNodesGraph6.add(new Node("grey","0",false,"Exclusion","-219.5 -185.75")); 
		mockupNodesGraph6.add(new Node("grey","03",false,"Response","-217.5 -117.75"));
		mockupNodesGraph6.add(new Node("grey","04",true,"Inclusion","-215.5 -54.75"));
		mockupNodesGraph6.add(new Node("grey","05",false,"Spawn","-213.5 23.25"));
		mockupNodesGraph6.add(new Node("grey","052",true,"Milestone","-219.5 71.25"));

		mockupNodesGraph6.add(new Node("white","02",false,"Exclusion","21.5 -185.75"));
		mockupNodesGraph6.add(new Node("white","022",false,"Response","23.5 -117.75"));
		mockupNodesGraph6.add(new Node("white","023",true,"Inclusion","25.5 -54.75"));
		mockupNodesGraph6.add(new Node("white","024",false,"Spawn","39.5 23.25"));
		mockupNodesGraph6.add(new Node("white","0242",true,"Milestone","21.5 71.25"));
	
		
		List mockupLinksGraph6 = new ArrayList<Link>();
		mockupLinksGraph6.add(new Link("0","","r",-1,"02","BackSlash","l"));
		mockupLinksGraph6.add(new Link("03","Circle","r",-2,"022","OpenTriangle","l"));
		mockupLinksGraph6.add(new Link("04","","r",-3,"023","PlusCircle","l"));
		mockupLinksGraph6.add(new Link("05","","r",-4,"024","Block","l"));
		mockupLinksGraph6.add(new Link("052","","r",-5,"0242","Diamond","l"));
			
			graphsLocal.add(new Graph(3, // id
			        "Arrows Edited", // name
			        LocalDateTime.of(2021,06,21,20,48), // creationDate
			        LocalDateTime.of(2021,06,21,20,48), // lastOpened
			        "Working", // description
			        "Working", // shortDescription
			        new ArrayList(), // comments
			        new ArrayList(), // collaborators
			        new ArrayList(), // roles
			        0, // startRoles
			        mockupNodesGraph6, // nodes
			        mockupLinksGraph6, // links
			        Graph.Location.LOCAL)); // location
	}
	
	// Function for finding all local graphs
	public List<Graph> findAll() {
		return graphsLocal;
	}
		
	// Function for saving a graph to the database
	public Graph save (Graph graph) {
		if(graph.getId()==-1) {
			graph.setId(++idCounter);
			graphsLocal.add(graph);
		}else {
			deleteById(graph.getId());
			graphsLocal.add(graph);
		}
		return graph;
	}
		
		
	// Function for deleting a graph by its ID
	public Graph deleteById (long id) {
		Graph graph = findById(id);
		if(graph==null) {
			return null;
		}
		if(graphsLocal.remove(graph)) {
			return graph;
		}
		return null;
	}

	// Function for finding a graph by its id
	public Graph findById(long id) {
		for (Graph graph:graphsLocal) {
			if(graph.getId() == id) {
				return graph;
			}
		}
		return null;
	}
	
}