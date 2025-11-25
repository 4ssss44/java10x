package dev.java10x.GimmeSpoilers.controller;
import dev.java10x.GimmeSpoilers.service.SpoilerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GimmeSpoilerController {

    private final SpoilerService spoilerService;

    public GimmeSpoilerController(SpoilerService spoilerService) {
        this.spoilerService = spoilerService;
    }

    @GetMapping("/gimmeSpoiler")
    public String gimmeSpoiler(@RequestParam String item) throws Exception {
        return spoilerService.getSpoiler(item);
    }

}
