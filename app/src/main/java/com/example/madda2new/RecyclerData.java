package com.example.madda2new;

public class RecyclerData {
    // string for displaying.
    // title and description.
    private String title;
    private String description;
    private Integer courseImage;


    // constructor for our title and description.
    public RecyclerData(String title, String description, Integer courseImage) {
        this.title = title;
        this.description = description;
        this.courseImage = courseImage;
    }

    // creating getter and setter methods.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(Integer courseImage) {
        this.courseImage = courseImage;
    }
}

