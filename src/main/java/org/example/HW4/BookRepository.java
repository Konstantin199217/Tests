package org.example.HW4;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
