package com.DCR.rest.webservices.restfulwebservices.graph;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphJpaRepository extends JpaRepository<Graph, Long> {

	List<Graph> findByGraphname(String username);
}
