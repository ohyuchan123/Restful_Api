package com.sentilab;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(value = "/api/test", method = RequestMethod.GET) //Get 방식의 메소드로 호출하겠다는 이야기
    @ResponseStatus(value = HttpStatus.OK) //정상적으로 결과를 주겠다.
    public String getApiTest() {
        return "{\"result\":\"ok\"}";
    }

    @RequestMapping(value = "/api/test2", method = RequestMethod.POST) //Get 방식의 메소드로 호출하겠다는 이야기
    @ResponseStatus(value = HttpStatus.OK) //정상적으로 결과를 주겠다.
    public String getApiTest2() {
        return "{\"result\":\"yuchan1\"}";
    }

    //http://localhost:8080/api/test
}
