package masterIL.exemple.book.dao;

import masterIL.exemple.book.model.Book;

import java.util.List;

public interface IBookDAO {

    public List<Book> findAll();

    public Book findById(int id);

    public void save(Book l);

    public void update(Book newBook, int id);

    void delete(int id);
}
