package com.Books.repository;

import org.springframework.data.repository.CrudRepository;
import com.Books.model.Books;
//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{

}