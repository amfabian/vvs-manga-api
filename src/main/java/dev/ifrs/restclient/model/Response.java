package dev.ifrs.restclient.model;

import java.util.List;

public class Response {
    private String request_hash;
    private List <Result> results;
    
    public String getRequest_hash() {
        return request_hash;
    }
    public void setRequest_hash(String request_hash) {
        this.request_hash = request_hash;
    }
    public List<Result> getResults() {
        return results;
    }
    public void setResults(List<Result> results) {
        this.results = results;
    }
    
}
