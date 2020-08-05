package com.example.myapplication.VideoPlayer.models;

public class PlayItem {

    private String title;
    private String videoPath;

    public PlayItem() {
    }

    public PlayItem(String title, String videoPath) {
        this.videoPath = videoPath;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }
}
