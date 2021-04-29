package org.boufnichel.kata.controllers;
import org.boufnichel.kata.model.Total;
import org.boufnichel.kata.services.BagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bag")

public class BagController {
//problem avec le # dans lurl tout ce qui est apres # est ignoré
    @Autowired
    BagService bagService;

    @GetMapping("{bagdesc}")
    public Total getBagPrice(@PathVariable String bagdesc){
        return  bagService.getBagPrice(bagdesc);
    }

    @GetMapping("")
    public Total getBagPrice2(@RequestParam(name = "bagdesc") String bagdesc){
        return  bagService.getBagPrice(bagdesc);
    }

}
