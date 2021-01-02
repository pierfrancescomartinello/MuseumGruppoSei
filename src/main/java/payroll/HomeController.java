package payroll;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller // <1>
@RequestMapping("/") // <2>	
public class HomeController {

	@GetMapping("")
	public String index() {
		return "index.html"; // <3>
	}

}