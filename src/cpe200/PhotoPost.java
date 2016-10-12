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
        super(u);
        this.filename = null;
        this.caption = null;
    }

    public PhotoPost(String u, String f, String c) {
        super(u);
        setFilename(f);
        setCaption(c);
        super.PC(1);
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
    this.filename = filename;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
    this.caption = caption;
    }

    private boolean isValidateFile(String f) {
        // only allow JPEG and PNG file
    if(f.matches(".jpg" ) || f.matches(".png")){
        return true;
    }
        return false;
    }

    @Override
    public void display() {
        System.out.println(super.username + " (posted: " + super.timestamp + ")");
        System.out.println("[ " + getFilename() + " ]");
        System.out.println("Caption: " + getCaption());
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
