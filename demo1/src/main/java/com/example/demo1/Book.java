package com.example.demo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
<<<<<<< HEAD
=======
	private String name;
	private String reader;
	private String isbn;
	private String title;
	private String author;
	private String description;
>>>>>>> a774816ec15a20abd1c6380fb7413586f31f2717
	public String getReader() {
		return reader;
	}
	public void setReader(String reader) {
		this.reader = reader;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
<<<<<<< HEAD
	private String name;
	private String reader;
	private String isbn;
	private String title;
	private String author;
	private String description;
=======
	
>>>>>>> a774816ec15a20abd1c6380fb7413586f31f2717
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
<<<<<<< HEAD
=======
	@Override
	public String toString(){
		return "book "+id+" name "+name+"  title "+title+" description "+description+" reader "+reader;
	}
>>>>>>> a774816ec15a20abd1c6380fb7413586f31f2717
}
