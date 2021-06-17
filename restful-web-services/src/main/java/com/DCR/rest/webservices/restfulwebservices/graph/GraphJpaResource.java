package com.DCR.rest.webservices.restfulwebservices.graph;

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


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class GraphJpaResource {

	@Autowired
	private GraphServiceLocal graphService;
	@Autowired
	private GraphServiceShared graphServiceShared;
		
	
	@Autowired
	private GraphJpaRepository graphJpaRepository;
	
	@GetMapping("/jpa/local")
	public List<Graph> getAllLocalGraphs() {
		return graphService.findAll();
	}
	
	@GetMapping("/jpa/shared")
	public List<Graph> getAllSharedGraphs() {
		return graphServiceShared.findAll();
	}
	
	
	@GetMapping("/jpa/local/{id}")
	public Graph getLocalGraph(@PathVariable long id) {
		return graphJpaRepository.findById(id).get();
		//return graphService.findById(id);
	}
	
	
	@GetMapping("/jpa/shared/{id}")
	public Graph getSharedGraph(@PathVariable long id) {
		return graphJpaRepository.findById(id).get();
		//return graphServiceShared.findById(id);
	}
	
	
	@PostMapping("/jpa/local/{id}")
	public ResponseEntity<Void> createdGraphPostLocal(@RequestBody Graph graph) {
		//Graph createdGraph = graphService.save(graph);
		Graph createdGraph = graphJpaRepository.save(graph);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdGraph.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PostMapping("/jpa/shared/{id}")
	public ResponseEntity<Void> createdGraphPostShared(@RequestBody Graph graph) {
		//Graph createdGraph = graphService.save(graph);
		Graph createdGraph = graphJpaRepository.save(graph);
		System.out.println(graph);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdGraph.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/jpa/local")
	public ResponseEntity<Graph> updateGraphPut(@RequestBody Graph graph) {
		//Graph graphUpdated = graphService.save(graph);
		Graph graphUpdated = graphJpaRepository.save(graph);

		return new ResponseEntity<Graph>(graph, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/jpa/edit/local/{graphID}")
	public ResponseEntity<Void> deleteGraph(@PathVariable String location, @PathVariable long graphID) {
		//Graph graph = graphService.deleteById(graphID);
		graphJpaRepository.deleteById(graphID);
		return ResponseEntity.noContent().build();
		//if(graph!=null) {
		//	return ResponseEntity.noContent().build();
		//}
		//return ResponseEntity.notFound().build();
	}
	
	
	//
	//
	//The following are placeholder functions
	//
	//
	@GetMapping("/select")
	public List<Graph> getAllGraphs() {
		return graphService.findAll();
	}
	
		
	@GetMapping("/edit/{location}/{graphID}")
	public Graph getGraph(@PathVariable String location, @PathVariable long graphID) {
		return graphService.findById(graphID);
	}
		
		
	@PutMapping("/edit/{location}/{graphID}")
	public ResponseEntity<Graph> updateGraphOld(@PathVariable String location, @PathVariable long graphID, @RequestBody Graph graph) {
		Graph graphUpdated = graphService.save(graph);
		return new ResponseEntity<Graph>(graph, HttpStatus.OK);
	}
		
	@PostMapping("/select")
	public ResponseEntity<Void> updateGraphOld(@RequestBody Graph graph) {
		Graph createdGraph = graphService.save(graph);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{graphID}").buildAndExpand(createdGraph.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
		
		
}
