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

    }

    public PhotoPost(String u, String f, String c) {

    }

    public String getFilename() {
        return null;
    }

    public void setFilename(String filename) {

    }

    public String getCaption() {
        return null;
    }

    public void setCaption(String caption) {

    }

    private boolean isValidateFile(String f) {
        // only allow JPEG and PNG file

        return false;
    }

    @Override
    public void display() {

    }

    @Override
    public String toString() {
        return null;
    }

}
