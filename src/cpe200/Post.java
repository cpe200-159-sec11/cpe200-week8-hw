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
        if(isValidateUsername(u)) {
            this.username = u;
        }else
        {
            this.username = "anonymous";
        }
        this.timestamp = LocalDateTime.now();
        this.likes =0;
        comments = new ArrayList<String>();
    }

    public boolean addComment(String c) {
        if(isValidateComment(c)) {
            comments.add(c);
            return true;
        }else {
            return false;
        }
    }

    public void addlike() {
        this.likes++;
    }

    public boolean removeComment(String c) {
        for(int i=0;i<comments.size();i++)
        {
            if(c == comments.get(i))
            {
                comments.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getComments() {
        return null;
    }

    private boolean isValidateUsername(String u) {
        return (u==null||u.equalsIgnoreCase(""))?false:true;
    }

    protected boolean isValidateComment(String c) {
        return (c==null || c.equalsIgnoreCase(""))?false:true;
    }

    public void display() {
        System.out.println(username + " (posted: " + timestamp + ")");
        System.out.println(likes + " people like this.");
        for(int i=0;i<comments.size();i++)
        {
            System.out.println("\t" + comments.get(i));
        }
    }

    @Override
    public String toString() {
        return null;
    }


}
