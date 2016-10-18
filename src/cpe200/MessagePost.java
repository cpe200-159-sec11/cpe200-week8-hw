package cpe200;

public class MessagePost extends Post {
    private String message;

    public MessagePost() {
        super();
        this.message = null;
    }

    public MessagePost(String u) {
        super.username = u;
    }

    public MessagePost(String u, String m) {
        super.username = u;
        this.message = m;
    }

    @Override
    public void display() {
        System.out.print(super.username + " (Posted: " + super.timestamp + ")\n");
        System.out.print("Message: " + this.message + "\n");
        System.out.print(super.likes + " people like this.\n");
        if(super.comments.size() == 0)
        {
            System.out.print("  No comments." + "\n");
        }
        for(int i = 0 ; i<super.comments.size() ; i++)
        {
            System.out.print("  " +super.comments.get(i)+"\n");
        }


    }

    @Override
    public String toString() {
        return null;
    }
}
