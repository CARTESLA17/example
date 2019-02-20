package co.com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
	
	@GetMapping(value = "/getHello")
    public @ResponseBody String getHello() {
        return "Esta arriba la aplicacion!";
    }

}
