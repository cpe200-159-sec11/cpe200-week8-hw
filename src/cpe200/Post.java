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
        if(isValidateUsername(u)) {
            this.username = u;
        }

        }


    public boolean addComment(String c) {
        if(isValidateComment(c)){
            comments.add(c);
            return true;
        }
        else return false;
    }

    public void addlike() {
        this.likes++;
    }

    public boolean removeComment(String c)
    {
        if (comments.remove(c))
        {
            return true;
        }
        else return false;

    }

    public ArrayList<String> getComments() {

        return comments;
    }

    private boolean isValidateUsername(String u) {

        return (u==null || u.equalsIgnoreCase(""))?false:true;
    }

    protected boolean isValidateComment(String c) {

        return (c==null || c.equalsIgnoreCase(""))?false:true;
    }

    public void display() {
        System.out.print(this.username + " posted: " + this.timestamp +"\n");
        System.out.print(this.likes + " people like this. \n");

        System.out.print(toString());
    }

    @Override
    public String toString() {

        String o  = "\t";
        for(int i =0;i<comments.size();i++)
        {
            o = o + comments.get(i)+"\n\t";
        }
        return o;
    }


}
