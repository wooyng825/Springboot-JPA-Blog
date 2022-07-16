package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 스프링이 com.cos.blog 패키지 이하를 스캔 ▶ 모든 파일을 new하지는 않음
// 특정 어노테이션(주석)이 붙어있는 클래스 파일들을 new하여[IoC] 스프링 컨테이너에 관리

public class BlogControllerTest {
	
	// http://localhost:8080/test/hello
	@GetMapping("test/hello")
	public String Hello() {
		return "<h1>hello spring boot</h1>";
	}
}
