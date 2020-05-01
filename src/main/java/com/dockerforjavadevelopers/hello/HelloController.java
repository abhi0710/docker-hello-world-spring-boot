package com.dockerforjavadevelopers.hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class.getName());

    @Autowired
    private RestTemplate template;

    @RequestMapping("/")
    public String index() {
        System.out.println("In ");
        System.out.flush();
        System.out.println(template.getForEntity("https://www.google.com/", String.class).getBody());
        return "Hello World\n";
    }

}
