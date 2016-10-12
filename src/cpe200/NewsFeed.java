package cpe200;

import java.util.ArrayList;

public class NewsFeed{

    private String feedname;
    private ArrayList<Post> posts;

    public NewsFeed(String name) {
        feedname = name;
        posts = new ArrayList<Post>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void deletePost(Post post) {

    }
   // public int num =0;
    public Post getPost(int i) {
       // num++;
        //System.out.println("getpost #" + num);
        return posts.get(i-1);

    }

    public void displayFeed() {

        System.out.println("\n******** News Topic: " + feedname + " ********\n");
        for(int i = 0; i <posts.size(); i++) {
            posts.get(i).display();
        }

    }
}