package com.test.mv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2018/11/7.
 */
@EnableWebMvc
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    //这段也可不写
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.test.mv.action")) // 注意修改此处的包名
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口列表 v1.1.0") // 任意，请稍微规范点
                .description("接口测试") // 任意，请稍微规范点
                .termsOfServiceUrl("http://localhost:8088/swagger-ui.html") // 将“url”换成自己的ip:port
                .contact(new Contact("yinqianhui","123","123")) // 无所谓（这里是作者的别称）
                .version("1.1.0")
                .build();
    }
}
/*---------------------
        作者：一个有点理想的猿
        来源：CSDN
        原文：https://blog.csdn.net/BlackMambaProgrammer/article/details/72354007
        版权声明：本文为博主原创文章，转载请附上博文链接！*/
