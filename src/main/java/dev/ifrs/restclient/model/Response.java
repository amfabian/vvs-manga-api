package dev.ifrs.restclient.model;

import java.util.List;

public class Response {
    private List <Result> data;
    
    
    
    public List<Result> getData() {
        return data;
    }
    public void setData(List<Result> data) {
        this.data = data;
    }
    
}
