package br.com.alura.mcv.mudi;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("nome", "Mundo");
        return "hello";
    }
}
