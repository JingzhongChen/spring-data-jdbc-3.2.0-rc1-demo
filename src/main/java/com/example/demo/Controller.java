package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Chen Hongzhou
 * @Date: 2023/11/7 13:39
 * @Description:
 */
@RestController
public class Controller {
    private final ApplicationService applicationService;

    public Controller(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/test")
    public String test() {
        return this.applicationService.test();
    }
}
