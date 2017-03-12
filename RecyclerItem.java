package com.doramram.ex1;

public class RecyclerItem {

    private String title;
    private String message;

    public RecyclerItem(String message, String title) {
        this.message = message;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
