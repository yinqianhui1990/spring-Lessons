package com.test.mv.advice;

import com.test.mv.model.Response;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/1/7.
 */
@ControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice {
    public boolean supports(MethodParameter methodParameter, Class aClass) {
       return aClass.equals(MappingJackson2HttpMessageConverter.class);

    }

    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        String requestPath = serverHttpRequest.getURI().getPath();
        if (requestPath.contains("/swagger") || requestPath.contains("/v2/api-docs")) {
            return body;
        }
        Response res;
        if (body instanceof Response){
            return body;
        }else {
            res = new Response(body);
        }
        return res;
    }

}
