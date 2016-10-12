package cpe200;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    protected String username;                  //who post ?
    protected LocalDateTime timestamp;          //Parameter for collect timestamp !!!
    protected int likes;                        //Parameter for count like !!
    protected ArrayList<String> comments;       //Correct comment!!!
    protected int PhotoPost;                    //Checking their are post photos?

    public void PC (int c){                        //checking post type.
        this.PhotoPost = c;
    }
    public Post() {                             //default username.
        this("anonymous");
    }

    public Post(String u) {
    username = u;                                 //set username.
    timestamp = LocalDateTime.now();             //This method for get date current.
    comments = new ArrayList<String>();
    }

    public boolean addComment(String c) {
       if(isValidateComment(c)){
        comments.add(c) ;
           return true;}

        return false;
    }

    public void addlike() {
    this.likes++;                                        //increment like.
    }

    public boolean removeComment(String c) {            //Try to remove comments.!!!!
        for(int i = 0 ; i < comments.size() ; i++){
            if(c == comments.get(i)){
                comments.remove(i);
            }
        }
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

    public void display() {                             //Don in normal post.
        System.out.printf(username + " ");
        System.out.println("(" + timestamp + ")");
        System.out.println(likes + " people like this.");
       for(int i=0 ; i < comments.size(); i++) {
           System.out.println("\t" + comments.get(i));
       }
    }



    @Override
    public String toString() {
        return null;
    }


}



