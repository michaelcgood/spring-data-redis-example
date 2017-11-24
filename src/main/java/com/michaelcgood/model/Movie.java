package com.michaelcgood.model;

import java.io.Serializable;

public class Movie implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    public Movie(String id, String name){
        this.id=id;
        this.name=name;
        
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Movie{" + "id=" +id + '\''  + ", name =" + name + "}";
    }

}
