package com.lms.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
