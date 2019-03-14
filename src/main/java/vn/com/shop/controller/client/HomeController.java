package vn.com.shop.controller.client;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Transactional
@Controller
@RequestMapping(value="client")
public class HomeController {

	@RequestMapping(value="/trang-chu", method=RequestMethod.GET)
	public String hello() {
		return "homePage";
	}
}
