package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String name;
    private final char sex;
    private final LocalDate birthday;
    private int posts;

    public ForumUser(final int ID, final String name, final char sex, final LocalDate birthday) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.posts = 0;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }
}
