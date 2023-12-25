package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 컨트롤러를 JSON 을 반환하는 컨트롤로 만들어줌.
// JSON은 "JavaScript Object Notation"의 약자,\
// 데이터를 효과적으로 표현하고 전달하기 위한 경량의 데이터 형식입니다.
// 이것은 사람이 읽고 쓰기 쉽고, 기계가 해석하고 생성하기도 용이한 형식을 가지고 있습니다.
// RESTful API에서는 주로 이러한 JSON 형식을 사용하여 정보를 주고받습니다.
// Java Spring의 @RestController는 이러한 JSON 형식으로 데이터를 반환할 수 있도록 도와주는 역할을 합니다.
// 클라이언트에서 요청이 오면 해당 컨트롤러는 데이터를 JSON 형식으로 만들어서 응답으로 보내줍니다.
public class HelloController {

    @GetMapping("/hello")
    // HTTP 메스드 GET 의 요청을 받을수 있는 api 를 만들어줍니다.
    public String hell() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
