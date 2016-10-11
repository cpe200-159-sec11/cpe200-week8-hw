package cpe200;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    protected String username;
    protected LocalDateTime timestamp;
    protected int likes;
    protected ArrayList<String> comments;

    public Post() {
        this("anonymous");
    }

    public Post(String u) {

    }

    public boolean addComment(String c) {

        return false;
    }

    public void addlike() {

    }

    public boolean removeComment(String c) {
        return false;
    }

    public ArrayList<String> getComments() {

        return null;
    }

    private boolean isValidateUsername(String u) {

        return false;
    }

    protected boolean isValidateComment(String c) {
        return (c==null || c.equalsIgnoreCase(""))?false:true;
    }

    public void display() {

    }

    @Override
    public String toString() {
        return null;
    }


}
