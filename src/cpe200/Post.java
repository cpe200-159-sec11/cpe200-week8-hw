package cpe200;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    protected String username;
    protected LocalDateTime timestamp = LocalDateTime.now();
    protected int likes;
    protected ArrayList<String> comments = new ArrayList<>();

    public Post() {
        this("anonymous");
    }

    public Post(String u) {
        if(isValidateUsername(u))
        {
            this.username = u;
        }
        else
        {

        }
    }

    public boolean addComment(String c) {
        if(isValidateComment(c)) {
            this.comments.add(c);
            return true;
        }
        else return false;
    }

    public void addlike() {
    this.likes++;
    }

    public boolean removeComment(String c) {
        if(this.comments.contains(c))
        {
            this.comments.remove(c);
            return true;
        }
        else
        {
            return false;
        }

    }

    public ArrayList<String> getComments() {
        return this.comments;
    }

    private boolean isValidateUsername(String u) {
    if(u == null || u.equalsIgnoreCase("")) {
        return false;
    }
    else return true;
    }

    protected boolean isValidateComment(String c) {
        return (c==null || c.equalsIgnoreCase(""))?false:true;
    }

    public void display() {
        System.out.print(this.username + " (Posted: " + this.timestamp + ")\n");
        System.out.print(this.likes + " people like this.\n");
        for(int i = 0 ; i<this.comments.size() ; i++)
        {
            System.out.print("  " + this.comments.get(i)+"\n");
        }


    }

    @Override
    public String toString() {
        return null;
    }


}
