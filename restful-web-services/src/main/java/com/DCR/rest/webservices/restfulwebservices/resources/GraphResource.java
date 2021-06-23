package com.DCR.rest.webservices.restfulwebservices.resources;

// Imports
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.DCR.rest.webservices.restfulwebservices.graph.Graph;
import com.DCR.rest.webservices.restfulwebservices.services.GraphServiceLocal;
import com.DCR.rest.webservices.restfulwebservices.services.GraphServiceShared;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

//Defining the CrossOrigin for datatransfers
//Declaring the public class GraphJpaResource as a restcontroller
@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class GraphResource {

	// Defining private variables and declaring them as autowired
	@Autowired
	private GraphServiceLocal graphService;
	@Autowired
	private GraphServiceShared graphServiceShared;
		
	// The following functions communicates with the frontend for datatransfer
	
	// Function for finding all local graphs
	@GetMapping("/local")
	public List<Graph> getAllLocalGraphs() {
		return graphService.findAll();
	}
	
	// Function for finding all shared graphs
	@GetMapping("/shared")
	public List<Graph> getAllSharedGraphs() {
		return graphServiceShared.findAll();
	}
	
	// Function for finding a local graph by id
	@GetMapping("/local/{id}")
	public Graph getLocalGraph(@PathVariable long id) {
		return graphService.findById(id);
	}
	
	// Function for finding a shared graph by id
	@GetMapping("/shared/{id}")
	public Graph getSharedGraph(@PathVariable long id) {
		return graphServiceShared.findById(id);
	}
	
	// Function for updating a local graph
	@PostMapping("/local/{id}")
	public ResponseEntity<Void> updateGraphPostLocal(@RequestBody Graph graph) {
		Graph createdGraph = graphService.save(graph);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(createdGraph.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	// Function for updating a shared graph
	@PostMapping("/shared/{id}")
	public ResponseEntity<Void> updateGraphPostShared(@RequestBody Graph graph) {
		Graph createdGraph = graphService.save(graph);
		System.out.println(graph);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(createdGraph.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	// Function for creating a new graph which will be stored locally
	@PutMapping("/local")
	public ResponseEntity<Graph> updateGraphPut(@RequestBody Graph graph) {
		Graph graphUpdated = graphService.save(graph);
		return new ResponseEntity<Graph>(graph, HttpStatus.OK);
	}
	
	// Function for deleting a graph which is stored locally
	@DeleteMapping("/edit/local/{graphID}")
	public ResponseEntity<Void> deleteGraph(@PathVariable String location, @PathVariable long graphID) {
		Graph graph = graphService.deleteById(graphID);
		if(graph!=null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}	
}
