package com.kafka.library.producer.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Book {

	@NotNull
	private Integer id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String autor;

	public Book(Integer id, String name, String autor) {
		super();
		this.id = id;
		this.name = name;
		this.autor = autor;
	}

	public Book() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
