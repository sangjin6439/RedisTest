package com.example.redistest.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class RedisController {

    private final RedisService service;

}
