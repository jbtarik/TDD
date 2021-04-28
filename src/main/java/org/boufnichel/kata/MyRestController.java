package org.boufnichel.kata;
import org.boufnichel.kata.model.Total;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bag")
@SpringBootApplication
public class MyRestController {
//problem avec le # dans lurl tout ce qui est apres # est ignoré
    @GetMapping("{bagdesc}")
    public Total getBagPrice(@PathVariable String bagdesc){
        Bag bag=new Bag(bagdesc);
        return new Total(bag.calculate());
    }
    @GetMapping("")
    public Total getBagPrice2(@RequestParam(name = "bagdesc") String bagdesc){
        Bag bag=new Bag(bagdesc);
        return new Total(bag.calculate());
    }

    public static void main(String[] args) {
        SpringApplication.run(MyRestController.class, args);
    }
}
