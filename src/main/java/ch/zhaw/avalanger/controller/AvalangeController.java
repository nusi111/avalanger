package ch.zhaw.avalanger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avalange")
public class AvalangeController {

    @GetMapping("/{country}")
    public String getAllAvalanges(@PathVariable String country,
                                    @RequestParam(required = false) String state
    ) {
        return "No avalanges found for country: "+country+ ", state: "+ state;
    }
}