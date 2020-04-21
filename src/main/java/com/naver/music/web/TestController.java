package com.naver.music.web;

import com.naver.music.vo.MemberVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public String test(){
        MemberVO memberVO = new MemberVO();
        new MemberVO("d","d");

        return "Hello world";
    }
}
