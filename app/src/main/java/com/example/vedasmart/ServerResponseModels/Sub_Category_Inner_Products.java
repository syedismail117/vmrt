package com.example.vedasmart.ServerResponseModels;

import java.util.ArrayList;

public class Sub_Category_Inner_Products {

    int response;
    String message;
    ArrayList<Info> Info;

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<com.example.vedasmart.ServerResponseModels.Info> getInfo() {
        return Info;
    }

    public void setInfo(ArrayList<com.example.vedasmart.ServerResponseModels.Info> info) {
        Info = info;
    }
}
