package masterIL.exemple.book.web.controller;

import masterIL.exemple.book.dao.IBookDAO;
import masterIL.exemple.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private IBookDAO dao;

    @GetMapping(value="/Books")
    public List<Book> getBooks() {
        return dao.findAll();
    }

    @GetMapping(value="/Books/{id}")
    public Book getBook(@PathVariable int id) {
        return  dao.findById(id);
    }

    @PostMapping(value="/Books")
    public void addBook(@RequestBody Book b) {
        dao.save(b);
    }

    @PutMapping(value="/Books/{id}")
    public void updateBook(@RequestBody Book newBook, @PathVariable int id) { dao.update(newBook, id); }

    @DeleteMapping(value="/Books/{id}")
    public void deleteBook(@PathVariable int id) { dao.delete(id); }
}
