package com.bisteam.backend.dto;

import java.util.List;

public class AskResponse {
    private String answer;
    private List<String> sources;
    public AskResponse(String answer, List<String> sources) {
        this.answer = answer;
        this.sources = sources;
    }
    public String getAnswer() { return answer; }
    public List<String> getSources() { return sources; }
}