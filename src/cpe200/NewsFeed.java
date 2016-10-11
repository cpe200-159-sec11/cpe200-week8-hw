package cpe200;

import java.util.ArrayList;


public class NewsFeed {
    private String feedname;
    private ArrayList<Post> posts;

    public NewsFeed(String name) {
        feedname = name;
        posts = new ArrayList<Post>();
    }

    public void addPost(Post post) {

    }

    public void deletePost(Post post) {

    }

    public Post getPost(int i) {
        return null;
    }

    public void displayFeed() {

        System.out.println("\n******** News Topic: " + feedname + " ********\n");

    }
}
