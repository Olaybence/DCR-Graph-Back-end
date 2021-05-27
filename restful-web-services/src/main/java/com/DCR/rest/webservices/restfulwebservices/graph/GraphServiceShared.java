package com.DCR.rest.webservices.restfulwebservices.graph;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class GraphServiceShared {

	private static List<Graph> graphsShared = new ArrayList<Graph>();
			
	private static int idCounter = 0;	
	
	static {
		graphsShared.add(new Graph(0, "Sed vel ultrices", "desciption", "Mauris elit metus, posuere quis nisi a, sodales ornare odio.", new ArrayList(), new ArrayList(), new ArrayList(), 1, new ArrayList()));
		graphsShared.add(new Graph(1, "Etiam turpis nibh, pellentesque", "desciption", "Nunc faucibus nunc et est placerat vestibulum. Donec tempus bibendum.", new ArrayList(), new ArrayList(), new ArrayList(), 1, new ArrayList()));
		graphsShared.add(new Graph(2, "Maecenas et pellentesque nunc", "desciption", "Etiam aliquet, sem non finibus imperdiet, sapien elit suscipit urna.", new ArrayList(), new ArrayList(), new ArrayList(), 1, new ArrayList()));
	}
		
	public List<Graph> findAll() {
		return graphsShared;
	}
		
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

	public Graph findById(long id) {
		for (Graph graph:graphsShared) {
			if(graph.getId() == id) {
				return graph;
			}
		}
		return null;
	}
	
}