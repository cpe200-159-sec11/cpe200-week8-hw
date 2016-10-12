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
    }

    public PhotoPost(String u, String f, String c) {
        super(u);
        if(isValidateFile(f)) {
            filename = f;
            caption = c;
            super.Photo =1;
        }
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        if(isValidateFile(filename)) {
            this.filename = filename;
        }
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    private boolean isValidateFile(String f) {
        // only allow JPEG and PNG file
        String JPG="([A-Za-z0-9]+)(.jpg)";
        String PNG="([A-Za-z0-9]+)(.png)";
        if(f.matches(JPG)||f.matches(PNG))
        {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void display() {
        //System.out.println("[ " + filename + " ]");
        //System.out.printf("Caption: " + caption);
        System.out.println(super.username +" (posted: " + this.timestamp + ")");
        System.out.println("[ "+this.filename+" ]");
        System.out.println("Caption : "+this.caption);
        System.out.println(super.likes + " people like this.");
        if(super.comments.size() == 0)
        {
            System.out.println("\tNo comments");
        }else
        {
            for(int i=0;i<super.comments.size();i++)
            {
                System.out.println("\t"+super.comments.get(i));
            }
            System.out.print("\n");
        }
    }

    @Override
    public String toString() {
        return null;
    }

}
