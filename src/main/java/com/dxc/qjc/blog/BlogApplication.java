package com.dxc.qjc.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
public class BlogApplication {
    private static String port;

    @Value("${server.port}")
    public void getPort(String p){
        port = p;
    }

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(BlogApplication.class, args);
        String host = InetAddress.getLocalHost().getHostAddress();
        log.info("\nAPI文档：http://localhost:"+port+"/doc.html" +
                "\nAPI文档：http://"+host+":"+port+"/doc.html");
    }
}
