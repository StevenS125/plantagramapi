package com.plantagram.plantagramapi.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    private Integer id;
    private String name;
    private String albumtitle;
    private String albumdesc;
    private String datestarted;
    private String imgurl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbumtitle() {
        return albumtitle;
    }

    public void setAlbumtitle(String albumtitle) {
        this.albumtitle = albumtitle;
    }

    public String getAlbumdesc() {
        return albumdesc;
    }

    public void setAlbumdesc(String albumdesc) {
        this.albumdesc = albumdesc;
    }

    public String getDatestarted() {
        return datestarted;
    }

    public void setDatestarted(String datestarted) {
        this.datestarted = datestarted;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Album() {
    }

    public Album(Integer id, String name, String albumtitle, String albumdesc, String datestarted, String imgurl) {
        this.id = id;
        this.name = name;
        this.albumtitle = albumtitle;
        this.albumdesc = albumdesc;
        this.datestarted = datestarted;
        this.imgurl = imgurl;
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
