package com.DCR.rest.webservices.restfulwebservices.graph;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class GraphHardcodedService {

	private static List<Graph> graphs = new ArrayList();
			
	private static int idCounter = 0;	
	
	static {
		graphs.add(new Graph(++idCounter, "username1", 1, "desciption", new Date(), new Date(), new ArrayList(), new ArrayList(), new ArrayList()));
		graphs.add(new Graph(++idCounter, "username1", 1, "desciption", new Date(), new Date(), new ArrayList(), new ArrayList(), new ArrayList()));
		graphs.add(new Graph(++idCounter, "username1", 1, "desciption", new Date(), new Date(), new ArrayList(), new ArrayList(), new ArrayList()));
	}
		
	public List<Graph> findAll() {
		return graphs;
	}
		
	public Graph save (Graph graph) {
		if(graph.getGraphID()==-1) {
			graph.setGraphID(++idCounter);
			graphs.add(graph);
		}else {
			deleteById(graph.getGraphID());
			graphs.add(graph);
		}
		return graph;
	}
		
		
	public Graph deleteById (long id) {
		Graph graph = findById(id);
		if(graph==null) {
			return null;
		}
		if(graphs.remove(graph)) {
			return graph;
		}
		return null;
	}

	public Graph findById(long id) {
		for (Graph graph:graphs) {
			if(graph.getGraphID() == id) {
				return graph;
			}
		}
		return null;
	}
}
