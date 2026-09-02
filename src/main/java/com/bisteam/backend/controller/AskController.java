package com.bisteam.backend.controller;

import com.bisteam.backend.dto.AskRequest;
import com.bisteam.backend.dto.AskResponse;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class AskController {

    @PostMapping("/ask")
    public AskResponse ask(@RequestBody AskRequest request) {
        // TODO tomorrow: call AI service at /ai/ask
        return new AskResponse("Temporary BIS response", new ArrayList<>());
    }
}