package cpe200;

public class MessagePost extends Post {                         //super == Post class!!!
     private String message;

    public MessagePost() {
        super();
        this.message = null;

    }

    public MessagePost(String u) {
        super(u);
        this.message = null;

    }

    public MessagePost(String u, String m) {
        super(u);
        this.message = m;

    }

    @Override
    public void display() {
        System.out.println(super.username + " (posted: " + super.timestamp + ")");
        System.out.println("Message: " + message);
        System.out.println(super.likes + " people like this.");

            if (super.comments.isEmpty()) {
                System.out.println("\t no comments.");
            } else {
                for (int j = 0; j < super.comments.size(); j++) {
                    System.out.println("\t" + super.comments.get(j));
                }
                 System.out.printf("\n");
            }

    }

    @Override
    public String toString() {
        return null;
    }
}
