package com.plantagram.plantagramapi.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    private Integer id;
    private String username;
    private String albumname;
    private String posttitle;
    private String postdesc;
    private String postdate;
    private String postimgurl;


    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getalbumname() {
        return albumname;
    }

    public void setalbumname(String albumname) {
        this.albumname = albumname;
    }

    public String getposttitle() {
        return posttitle;
    }

    public void setposttitle(String posttitle) {
        this.posttitle = posttitle;
    }

    public String getpostdesc() {
        return postdesc;
    }

    public void setpostdesc(String postdesc) {
        this.postdesc = postdesc;
    }

    public String getpostdate() {
        return postdate;
    }

    public void setpostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getpostimgurl() {
        return postimgurl;
    }

    public void setpostimgurl(String postimgurl) {
        this.postimgurl = postimgurl;
    }

    public Post () {}

    public Post(Integer id, String username, String albumname, String posttitle, String postdesc, String postdate, String postimgurl) {
        this.id = id;
        this.username = username;
        this.albumname = albumname;
        this.posttitle = posttitle;
        this.postdesc = postdesc;
        this.postdate = postdate;
        this.postimgurl = postimgurl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
}

