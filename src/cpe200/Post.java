package cpe200;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Post {
    protected String username;
    protected LocalDateTime timestamp = LocalDateTime.now();
    protected int likes;
    protected ArrayList<String> comments = new ArrayList<String>();

    public Post() {
        this("anonymous");
    }

    public Post(String u) {
        if(isValidateUsername(u)) {
            this.username = u;
        }
    }

    public boolean addComment(String c) {
        if(isValidateComment(c)) {
            this.comments.add(c);
            return true;
        }
        else return false;
    }

    public void addlike() {
        this.likes++;
    }

    public boolean removeComment(String c) {
        if(comments.contains(c)) {
            comments.remove(c);
            return true;
        }
        return false;
    }

    public ArrayList<String> getComments() {
        return this.comments;
    }

    private boolean isValidateUsername(String u) {
       /* if(u==null) {
            return false;
        }
        String nameREGEX = "[A-z,0-9]";
        String nonREGEX = "[-,_,/,@,#,&]";
        Pattern patternAz = Pattern.compile(nameREGEX);
        Matcher mAz = patternAz.matcher(u);
        Pattern patternsim = Pattern.compile(nonREGEX); //dont really need this
        Matcher mSim = patternsim.matcher(u);
        char c = u.charAt(0);
        if(mAz.find() && u.length()>=4 && !(mSim.find())) {
            if(c >= '0' && c <= '9')
            {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }*/
       return true;
    }

    protected boolean isValidateComment(String c) {
        return (c==null || c.equalsIgnoreCase(""))?false:true;
    }

    public void display() {
        String o = this.toString();
        System.out.println(o);
        for(int i=0; i<comments.size(); i++) {
            System.out.println("\t"+this.comments.get(i));
        }

    }

    @Override
    public String toString() {
        return  this.username+" (posted: "+this.timestamp+")\n"+this.likes+" people like this.";
    }


}
