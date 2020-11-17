package com.kafka.library.producer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.library.producer.model.LibraryEvent;

@RestController
public class LibraryController {
	
	@PostMapping("/v1/libraries")
	public ResponseEntity<LibraryEvent> create(@RequestBody LibraryEvent libraryEvent) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
	}

}
