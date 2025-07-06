package com.library.repository;

import java.util.*;
public class BookRepository
{
    public List<String> findAll()
    {
        List<String> books = new ArrayList<>();
        books.add("Spring Boot 3");
        books.add("Java 8");
        books.add("MySql");
        return books;
    }
}