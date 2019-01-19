package hello;


import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping(value="/arm", produces="application/json")
    public Object parseArmCode(@RequestParam(value="code", defaultValue="World") String armcode) {
        System.out.println(armcode + "received!");
        return Collections.singletonMap("response", armcode);
    }
}