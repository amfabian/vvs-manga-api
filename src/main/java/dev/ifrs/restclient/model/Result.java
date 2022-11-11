package dev.ifrs.restclient.model;

public class Result {
    private long mal_id;
    private String url;
    private String title;
    private boolean publishing;
    private String type;
    private long chapters;
    private long volumes;
    private String image_url;
    public long getMal_id() {
        return mal_id;
    }
    public void setMal_id(long mal_id) {
        this.mal_id = mal_id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isPublishing() {
        return publishing;
    }
    public void setPublishing(boolean publishing) {
        this.publishing = publishing;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public long getChapters() {
        return chapters;
    }
    public void setChapters(long chapters) {
        this.chapters = chapters;
    }
    public long getVolumes() {
        return volumes;
    }
    public void setVolumes(long volumes) {
        this.volumes = volumes;
    }
    public String getImage_url() {
        return image_url;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
    
}
