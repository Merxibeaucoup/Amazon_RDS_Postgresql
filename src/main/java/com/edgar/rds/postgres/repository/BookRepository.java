package com.edgar.rds.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.rds.postgres.models.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
