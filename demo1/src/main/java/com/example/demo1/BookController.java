package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class BookController{
	@Autowired
	BookRepository bookRepository;
	public BookController(BookRepository bookRepository){
		this.bookRepository = bookRepository;
	}
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
	}
}
