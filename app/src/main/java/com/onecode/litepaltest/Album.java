package com.onecode.litepaltest;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Album extends LitePalSupport {
    @Column(unique = true, defaultValue = "unknown")  //限制名称不可重复
    private String name;

    @Column(ignore = true)
    private float price;

    private byte[] cover;

    private Date releaseDate;

    private List<Song> songs = new ArrayList<Song>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
