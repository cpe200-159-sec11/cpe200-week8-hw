package cpe200;

public class TestPost1 {

    public static void main(String [] args) {

        // Test simple post p1
        Post p1 = new Post("Andy");
        p1.addlike();
        p1.addComment("Hello andy.");
        p1.addComment("Nice to meed you!");
        p1.addComment("Give me a call");
        p1.addlike();
        p1.display();

        System.out.println();

        // Test simple post p2
        Post p2 = new Post();
        p2.addlike();
        p2.addComment("Hi.");
        p2.addComment("Who might you be?");
        p2.display();

        // Create two news feed
        NewsFeed f1 = new NewsFeed("Technology");
        NewsFeed f2 = new NewsFeed("Travel");

        // Add post to f1
        f1.addPost(new MessagePost("Andrew Dalton (Engadget)",
                "Facebook at Work officially launches as 'Workplace'"));
        f1.addPost(new PhotoPost("Steven Musil (CNET)","note7.jpg",
                "Samsung calls for halt to sales, exchanges of Galaxy Note 7"));
        f1.addPost(new MessagePost("(Reuters)",
                "Self-driving car with passengers to be tested on UK streets"));

        // display news feed before comments
        f1.displayFeed();
        f1.getPost(1).display();
        f1.getPost(2).display();
        f1.getPost(3).display();

        f1.getPost(1).addComment("facebook for work!!! seriously!!!"); f1.getPost(1).addlike();
        f1.getPost(1).addComment("My company doesn't allow to use facebook 5555.");

        f1.getPost(2).addlike();
        f1.getPost(2).addComment("Waiting for iPhone8"); f1.getPost(2).addlike();
        f1.getPost(2).addComment("Galaxy S7 Edge is good enough for me.");
        f1.getPost(2).addComment("Gonna try chinese brand smartphone now. OnePlus3 hooray");
        f1.getPost(2).addComment(""); f1.getPost(2).addlike();
        f1.getPost(2).addComment("Huewei P9 rules!!!"); f1.getPost(2).addlike();

        // display a photo post
        f1.getPost(2).display();

        f1.getPost(3).addlike(); f1.getPost(3).addlike(); f1.getPost(3).addlike();
        // display news feed after adding comments
        f1.displayFeed();
        f1.getPost(1).display();
        f1.getPost(2).display();
        f1.getPost(3).display();

        // Add post to f2 news feed
        f2.addPost(new PhotoPost("Mike Gerrard (BBC)","cherokee.png",
                "A 600-mile walk to a singing river"));
        f2.addPost(new MessagePost("Fanny Potkin","In search of Burma's wizards-saints"));
        f2.addPost(new PhotoPost("Lindsey Galloway","museum.png",
                "The UK city that's actually affordable"));
        f2.addPost(new MessagePost("Husna Haq","India's biryani wars"));
        f2.addPost(new MessagePost("Kate Springer","Hong Kong's urban explorer"));

        // display news feed before adding comments
        f2.displayFeed();
        f2.getPost(1).display();
        f2.getPost(2).display();
        f2.getPost(3).display();
        f2.getPost(4).display();
        f2.getPost(5).display();

        f2.getPost(4).addlike(); f2.getPost(2).addlike();
        f2.getPost(1).addComment("really like walkabout along the river");
        f2.getPost(3).addComment("India is the best."); f2.getPost(3).addlike();
        f2.getPost(5).addComment("Eat and travel"); f2.getPost(5).addlike();

        // display news feed after adding comments
        f2.displayFeed();
        f2.getPost(1).display();
        f2.getPost(2).display();
        f2.getPost(3).display();
        f2.getPost(4).display();
        f2.getPost(5).display();
    }
}
