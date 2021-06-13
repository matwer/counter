package com.shad.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/matwer")
@Controller
public class HomeController {
	@RequestMapping("")
    public String index(HttpSession session){
		Integer count = null;
		
		if (session.getAttribute("count") == null) {
        	session.setAttribute("count", 0);
		}
		
		count = (Integer) session.getAttribute("count");
		count++;
		session.setAttribute("count", count);
        return "index.jsp";
    }

	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("count") == null) {
        	session.setAttribute("count", 0);
		}
		return "counter.jsp";
	}
}