package com.DCR.rest.webservices.restfulwebservices.graph;

// Imports
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

// GraphServicelocal class, it is declared as a service
@Service
public class GraphServiceLocal {

	// Defining private variables
	private static List<Graph> graphsLocal = new ArrayList<Graph>();		
	private static long idCounter = 0;	
	
	// Defining the static list of local graphs
	static {
		List mockupLinks = new ArrayList<Link>();
		mockupLinks.add(new Link()); 
		List mockupNodes = new ArrayList<Node>();
		mockupNodes.add(new Node("Beta"));
		mockupNodes.add(new Node("Alpha"));
		graphsLocal.add(new Graph(0, 
				"Lorem ipsum dolor sit amet",
				LocalDate.of(2021, 05, 05), 
				LocalDateTime.now(), 
				"desciption",
				"Vestibulum iaculis enim, consectetur adipiscing elit. Aenean porttitor.",
				new ArrayList(), 
				new ArrayList(), 
				new ArrayList(), 
				1,
				mockupLinks,
				mockupNodes,
				Graph.Location.LOCAL));
		graphsLocal.add(new Graph(1, 
				"Praesent a velit",
				LocalDate.of(2021, 01, 01),
				LocalDateTime.now(), 
				"desciption", 
				"Sed volutpat venenatis sollicitudin. Sed bibendum, massa non ultrices pharetra.",
				new ArrayList(),
				new ArrayList(),
				new ArrayList(),
				1,
				mockupLinks,
				mockupNodes,
				Graph.Location.LOCAL));
		graphsLocal.add(new Graph(2, 
				"Cras ultricies sem", 
				LocalDate.of(2021, 03, 03), 
				LocalDateTime.now(), 
				"desciption", 
				"Nunc faucibus nunc et est placerat vestibulum. Donec tempus bibendum.", 
				new ArrayList(), 
				new ArrayList(), 
				new ArrayList(), 
				1,
				mockupLinks, 
				mockupNodes,
				Graph.Location.LOCAL));
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
