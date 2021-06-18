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
		List mockupLinks = new ArrayList<Link>();
		mockupLinks.add(new Link()); 
		List mockupNodes = new ArrayList<Node>();
		mockupNodes.add(new Node("Beta"));
		mockupNodes.add(new Node("Alpha"));
		graphsShared.add(new Graph(0, 
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
		graphsShared.add(new Graph(1, 
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
		graphsShared.add(new Graph(2, 
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