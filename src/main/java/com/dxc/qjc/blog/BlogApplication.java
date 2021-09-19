package com.dxc.qjc.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);

//        ("API文档：http://localhost:8080/doc.html?cache=1&lang=zh");
        log.debug("哈哈哈");
        log.error("哈哈哈");
        log.warn("警告");
    }
}
