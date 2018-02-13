package de.deltatrees.deltapnp.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TestController {

    @RequestMapping(path = "/test")
    public String getString() {
        return "Hello World!";
    }

}
