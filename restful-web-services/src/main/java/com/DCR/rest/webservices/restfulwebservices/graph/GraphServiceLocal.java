package com.DCR.rest.webservices.restfulwebservices.graph;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class GraphServiceLocal {

	private static List<Graph> graphsLocal = new ArrayList<Graph>();
			
	private static int idCounter = 0;	
	
	static {
		graphsLocal.add(new Graph(0, "Lorem ipsum dolor sit amet", "desciption", "Vestibulum iaculis enim, consectetur adipiscing elit. Aenean porttitor.", new ArrayList(), new ArrayList(), new ArrayList(), 1, new ArrayList()));
		graphsLocal.add(new Graph(1, "Praesent a velit", "desciption", "Sed volutpat venenatis sollicitudin. Sed bibendum, massa non ultrices pharetra.", new ArrayList(), new ArrayList(), new ArrayList(), 1, new ArrayList()));
		graphsLocal.add(new Graph(2, "Cras ultricies sem", "desciption", "Nunc faucibus nunc et est placerat vestibulum. Donec tempus bibendum.", new ArrayList(), new ArrayList(), new ArrayList(), 1, new ArrayList()));
	}
		
	public List<Graph> findAll() {
		return graphsLocal;
	}
		
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

	public Graph findById(long id) {
		for (Graph graph:graphsLocal) {
			if(graph.getId() == id) {
				return graph;
			}
		}
		return null;
	}
	
}
