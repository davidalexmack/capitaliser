package com.example.capitalism.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class capitalismController {
    @GetMapping("/capitalism")
    public String magic(@RequestParam(name="word", required=false, defaultValue="   ") String word, Model model) {
        model.addAttribute("inputWord", word);
        model.addAttribute("upperWord", encodeFunction(word));
        return "capitalism";
    }

    private String encodeFunction(String word) {
        return "✨ " + word.toUpperCase() + " ✨";
    }
}
