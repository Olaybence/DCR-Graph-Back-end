package com.DCR.rest.webservices.restfulwebservices.resources;

/*
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

// Defining the CrossOrigin for datatransfers
// Declaring the public class GraphJpaResource as a restcontroller
@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class GraphJpaResource {

	// Defining private variables and declaring them as autowired
	
	@Autowired
	private GraphServiceLocal graphServiceLocal;
	@Autowired
	private GraphServiceShared graphServiceShared;	

	//@Autowired
	//private GraphJpaRepository graphJpaRepository;
	
	// The following functions communicates with the frontend for datatransfer
	
	// Function for finding all local graphs on jpa
	@GetMapping("/jpa/local")
	public List<Graph> getAllLocalGraphs() {
		return graphServiceLocal.findAll();
	}
	
	// Function for finding all shared graphs on jpa
	@GetMapping("/jpa/shared")
	public List<Graph> getAllSharedGraphs() {
		return graphServiceShared.findAll();
	}
	
	// Function for finding a local graph by id on jpa
	@GetMapping("/jpa/local/{id}")
	public Graph getLocalGraph(@PathVariable long id) {
		return graphJpaRepository.findById(id).get();
		return graphServiceLocal.
	}
	
	// Function for finding a shared graph by id on jpa
	@GetMapping("/jpa/shared/{id}")
	public Graph getSharedGraph(@PathVariable long id) {
		return graphJpaRepository.findById(id).get();
	}
	
	// Function for updating a local graph on jpa
	@PostMapping("/jpa/local/{id}")
	public ResponseEntity<Void> createdGraphPostLocal(@RequestBody Graph graph) {
		Graph createdGraph = graphJpaRepository.save(graph);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(createdGraph.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	// Function for updating a shared graph
	@PostMapping("/jpa/shared/{id}")
	public ResponseEntity<Void> createdGraphPostShared(@RequestBody Graph graph) {
		Graph createdGraph = graphJpaRepository.save(graph);
		System.out.println(graph);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(createdGraph.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	// Function for creating a new graph which will be stored locally on jpa
	@PutMapping("/jpa/local")
	public ResponseEntity<Graph> updateGraphPut(@RequestBody Graph graph) {
		Graph graphUpdated = graphJpaRepository.save(graph);
		return new ResponseEntity<Graph>(graph, HttpStatus.OK);
	}
	
	// Function for deleting a graph which is stored locally on jpa
	@DeleteMapping("/jpa/edit/local/{graphID}")
	public ResponseEntity<Void> deleteGraph(@PathVariable String location, @PathVariable long graphID) {
		graphJpaRepository.deleteById(graphID);
		return ResponseEntity.noContent().build();
	}
			
}	*/	
