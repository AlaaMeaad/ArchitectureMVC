package com.example.architecturemvc.pojo;
//////////////////////////////////////// model /////////////////////////
public class MoiveModel {

    String name;
    String data ;
    String description;

    public MoiveModel(String name, String data, String description, int id) {
        this.name = name;
        this.data = data;
        this.description = description;
        this.id = id;
    }

    int id ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
