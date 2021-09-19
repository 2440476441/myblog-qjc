package com.dxc.qjc.blog.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 权计超
 * @EnableSwaggerBootstrapUI   swagger页面优化 使用时账密验证
 * @EnableSwagger2  开启swagger
 * swagger.enable 项目动态启用swagger
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
@ConditionalOnProperty(name = "swagger.enable", havingValue = "true")
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        //可以通过此方式添加全局header
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        List<Parameter> heads = new ArrayList<Parameter>();
        parameterBuilder.name("token")
                .description("访问令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        heads.add(parameterBuilder.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .genericModelSubstitutes(Response.class)
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dxc.qjc.blog.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(heads);
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("我的博客API文档")
                .description("接口测试使用")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}