package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {
    private String name;                                        // [6]
    private String realName;                                    // [7]
    private List<ForumPost> posts = new ArrayList<>();          // [8]
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {            // [10]
        //name visible on forum
        this.name = name;                                        // [11]
        //real name of the user
        this.realName = realName;                                // [12]
    }
    public void addPost(String author, String postBody) {       // [14]
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }                                                           // [15]

    public void addComment(ForumPost thePost, String author, String commentBody) {   // [16]
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }                                                           // [17]

    public int getPostsQuantity() {                             // [18]
        // return 100 temporarily
        return posts.size();                                          // [19]
    }                                                           // [20]

    public int getCommentsQuantity() {                          // [21]
        // return 100 temporarily
        return comments.size();                                             // [22]
    }                                                           // [23]

    public ForumPost getPost(int postNumber) {                  // [24]
        // returning null means that the operation was unsuccessful
        if (postNumber >= 0 && postNumber < posts.size()) {
            return posts.get(postNumber);
        }
        return null;                                             // [25]
    }                                                           // [26]

    public ForumComment getComment(int commentNumber) {         // [27]
        // returning null means that the operation was unsuccessful
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;                                             // [28]
    }                                                           // [29]

    public boolean removePost(ForumPost thePost) {              // [30]
        // return true temporarily
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
        return result;                                           // [31]
    }                                                           // [32]

    public boolean removeComment(ForumComment theComment) {     // [33]
        // return true temporarily
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;                                             // [34]
    }                                                           // [35]

    public String getName() {                                   // [36]
        return name;                                             // [37]
    }                                                           // [38]

    public String getRealName() {                               // [39]
        return realName;                                         // [40]
    }
}
