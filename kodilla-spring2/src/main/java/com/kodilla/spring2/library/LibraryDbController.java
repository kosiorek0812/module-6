package com.kodilla.spring2.library;

import org.springframework.stereotype.Repository;


public final class LibraryDbController {

    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }
}