package cpe200;

public class MessagePost extends Post {
    private String message;

    public MessagePost() {
        super();
        this.message = null;
    }

    public MessagePost(String u) {
        super();
        super.username = u;

    }

    public MessagePost(String u, String m) {
        super();
        super.username = u;
        this.message = m;
    }

    @Override
    public void display() {
        String o = this.toString()+"\nMessage: "+ this.message + "\n" + super.likes +" people like this.";
        System.out.println(o);
        if (super.comments.isEmpty())
        {
            System.out.print("\tNo comments.");
        }
        else {
            for (int i = 0; i < super.comments.size(); i++)
                System.out.println("\t" + super.comments.get(i));
        }
        System.out.println();

    }

    @Override
    public String toString() {
        return super.username + "(postes: "+super.timestamp+")";
    }
}
