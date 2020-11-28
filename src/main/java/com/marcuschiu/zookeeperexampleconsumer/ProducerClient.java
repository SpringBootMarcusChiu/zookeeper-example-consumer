package com.marcuschiu.zookeeperexampleconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@Configuration
@RestController
public class ProducerClient {

    @Autowired
    private TheClient theClient;

    @FeignClient(name = "ZookeeperExampleProducer")
    interface TheClient {

        @RequestMapping(path = "/", method = RequestMethod.GET)
        @ResponseBody
        String test();
    }

    @GetMapping("/")
    public String callProducer() {
        return "producer return `" + theClient.test() + "`";
    }
}