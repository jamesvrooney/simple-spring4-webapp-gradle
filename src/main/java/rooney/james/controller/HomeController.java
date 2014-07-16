package rooney.james.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayHome(Model model) {
		model.addAttribute("name", "Jackson Brown, here I am!");

		return "/home";
	}
}
