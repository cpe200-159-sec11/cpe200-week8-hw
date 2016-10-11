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
        this.posts.add(post);
    }

    public void deletePost(Post post) {
        for(int i=0;i<this.posts.size();i++)
        {
            if(post ==this.posts.get(i))
            {
                this.posts.remove(i);
            }
        }
    }

    public Post getPost(int i) {

        return this.posts.get(i-1);
    }

    public void displayFeed() {

        System.out.println("\n******** News Topic: " + feedname + " ********\n");
      //  System.out.println(this.posts.get(1));

    }
}
