package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private ArrayList<ForumUser> forumUsers;

    public Forum() {

        this.forumUsers = new ArrayList<ForumUser>();
    }
    public List<ForumUser> getForumUsers() {

        return forumUsers;
    }

    public void addForumUser(ForumUser forumUser) {

        this.forumUsers.add(forumUser);
    }
}
