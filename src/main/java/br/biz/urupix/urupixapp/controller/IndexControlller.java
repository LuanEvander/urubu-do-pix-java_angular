package br.biz.urupix.urupixapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControlller {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
