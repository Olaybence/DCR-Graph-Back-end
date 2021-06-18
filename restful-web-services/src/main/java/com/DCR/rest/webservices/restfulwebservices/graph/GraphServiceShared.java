package com.DCR.rest.webservices.restfulwebservices.graph;

// Imports
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

//GraphServiceShared class, it is declared as a service
@Service
public class GraphServiceShared {

	// Defining private variables
	private static List<Graph> graphsShared = new ArrayList<Graph>();
	private static long idCounter = 0;	
	
	// Defining the static list of shared graphs
	static {
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

		graphsShared.add(new Graph(0, // id
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

		graphsShared.add(new Graph(1, // id
		        "Group 3 ", // name
		        LocalDateTime.of(2020,03,17,19,31), // creationDate
				LocalDateTime.of(2021,05,17,9,31), // lastOpened
		        "Group 3 planning DCR graph", // description
		        "Group 3 planning DCR graph", // shortDescription
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

		graphsShared.add(new Graph(2, // id
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

		List mockupLinksGraph3 = new ArrayList<Link>();
		mockupLinksGraph3.add(new Link("0","","r",-1,"022","BackSlash","l"));
		mockupLinksGraph3.add(new Link("0","","r",-2,"02","PlusCircle","l"));
		mockupLinksGraph3.add(new Link("0","","r",-3,"03","BackSlash","l"));
		mockupLinksGraph3.add(new Link("03","","r",-4,"04","BackSlash","l"));
		mockupLinksGraph3.add(new Link("042","","r",-5,"04","BackSlash","l"));
		mockupLinksGraph3.add(new Link("032","","r",-6,"022","BackSlash","l"));
		
		graphsShared.add(new Graph(3, // id
		        "Obstacles", // name
		        LocalDateTime.of(2020,06,18,19,31), // creationDate
				LocalDateTime.of(2021,05,17,9,31), // lastOpened
		        "Graph for obstacles", // description
		        "Graph for obstacles", // shortDescription
		        new ArrayList(), // comments
		        new ArrayList(), // collaborators
		        new ArrayList(), // roles
		        0, // startRoles
		        mockupNodesGraph3, // nodes
		        mockupLinksGraph3, // links
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

		graphsShared.add(new Graph(4, // id
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

		graphsShared.add(new Graph(5, // id
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
	}
		
	// Function for finding all shared graphs
	public List<Graph> findAll() {
		return graphsShared;
	}
		
	// Function for saving a shared graph
	public Graph save (Graph graph) {
		if(graph.getId()==-1) {
			graph.setId(++idCounter);
			graphsShared.add(graph);
		}else {
			deleteById(graph.getId());
			graphsShared.add(graph);
		}
		return graph;
	}
		
		
	// Function for deleting a graph by id
	public Graph deleteById (long id) {
		Graph graph = findById(id);
		if(graph==null) {
			return null;
		}
		if(graphsShared.remove(graph)) {
			return graph;
		}
		return null;
	}

	// Function for finding a graph by id
	public Graph findById(long id) {
		for (Graph graph:graphsShared) {
			if(graph.getId() == id) {
				return graph;
			}
		}
		return null;
	}
	
}