package cpe200;

public class MessagePost extends Post {
    private String message;

    public MessagePost() {
        super();
        this.message = null;
    }

    public MessagePost(String u) {
        this.message = u;
    }

    public MessagePost(String u, String m) {
        super.username = u;
        this.message = m;
    }

    @Override
    public void display() {
        System.out.println(super.username +" (posted: " + this.timestamp + ")");
        System.out.println("Message : "+this.message);
        System.out.println(super.likes + " people like this.");
        if(super.comments.size() == 0)
        {
            System.out.println("\tNo comments");
        }else {
            for (int i = 0; i < super.comments.size(); i++) {
                System.out.println("\t" + super.comments.get(i));
            }
            System.out.print("\n");
        }
    }

    @Override
    public String toString() {
        return super.username;
    }
}
