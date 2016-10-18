package cpe200;

public class PhotoPost extends Post {
    private String filename;
    private String caption;

    public PhotoPost() {
        super();
        this.filename = null;
        this.caption = null;
    }

    public PhotoPost(String u) {
        super();
        super.username = u;
    }

    public PhotoPost(String u, String f, String c) {
        super();
        super.username = u;
        this.filename = f;
        this.caption = c;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;

    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;

    }

    private boolean isValidateFile(String f) {
        // only allow JPEG and PNG file
        if(f.contains(".jpg") || f.contains(".png"))
        {
            return true;
        }
        else
        return false;
    }

    @Override
    public void display() {
        System.out.print(super.username + " (Posted: " + super.timestamp + ")\n");
        System.out.print(this.filename + "\n");
        System.out.print("Caption: " + this.caption + "\n");
        System.out.print(super.likes + " people like this.\n");
        for(int i = 0 ; i<super.comments.size() ; i++)
        {
            System.out.print(super.comments.get(i)+"\n");
        }

    }

    @Override
    public String toString() {
        return null;
    }

}
