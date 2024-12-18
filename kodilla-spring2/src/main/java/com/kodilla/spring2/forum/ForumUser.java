package com.kodilla.spring2.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User {
    private final String username;

    public ForumUser() {
        this.username = "John Smith";
    }
    @Override
    public String getUsername() {
        return username;
    }

}
