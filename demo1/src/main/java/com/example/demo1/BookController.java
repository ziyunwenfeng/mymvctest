package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Controller;
=======
>>>>>>> a774816ec15a20abd1c6380fb7413586f31f2717
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
@Controller
@RequestMapping("/book")
=======
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
>>>>>>> a774816ec15a20abd1c6380fb7413586f31f2717
public class BookController{
	@Autowired
	BookRepository bookRepository;
	public BookController(BookRepository bookRepository){
		this.bookRepository = bookRepository;
	}
<<<<<<< HEAD
	@RequestMapping(value = "/books/{reader}", method = RequestMethod.GET)
	public String getBook(@PathVariable("reader") String reader,Model model){
		List<Book> list = bookRepository.findByReader(reader);
		if(list!=null)
			model.addAttribute("books",list);
		return "book";
=======
	@RequestMapping(value = "/{reader}", method = RequestMethod.GET)
	public String getBook(@PathVariable("reader") String reader,Model model){
		List<Book> list = bookRepository.findByReader(reader);
		if(!list.isEmpty()){
			System.out.println("not empty");
			System.out.println(list.toString());
			model.addAttribute("books",list);
		}else{
			System.out.println("empty");
		}
		return "books";
>>>>>>> a774816ec15a20abd1c6380fb7413586f31f2717
	}
}
