package com.proyecto.Booking.service;

import com.proyecto.Booking.persistence.entities.Book;
import com.proyecto.Booking.persistence.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book save(Book book){
        return bookRepository.save(book);
    }
    public List<Book> findAll(){
        return  bookRepository.findAll();
    }
}