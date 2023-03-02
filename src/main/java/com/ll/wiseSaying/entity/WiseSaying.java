package com.ll.wiseSaying.entity;

public class WiseSaying {
    private long id;
    private String authorName;
    private String content;

    public WiseSaying(long id, String authorName, String content){
        this.id = id;
        this.authorName = authorName;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getContent() {
        return content;
    }
}
