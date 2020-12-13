package com.kafka.library.producer.model;

public class LibraryEvent {

	private Integer id;
	private Book book;
	private Integer libraryEventId;
	private LibraryEventType libraryEventType;

	public LibraryEvent() {
	}

	public LibraryEvent(Integer id, Book book) {
		super();
		this.id = id;
		this.book = book;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Integer getLibraryEventId() {
		return libraryEventId;
	}

	public void setLibraryEventId(Integer libraryEventId) {
		this.libraryEventId = libraryEventId;
	}

	public LibraryEventType getLibraryEventType() {
		return libraryEventType;
	}
	
	public void setLibraryEventType(LibraryEventType libraryEventType) {
		this.libraryEventType = libraryEventType;
	}
}
