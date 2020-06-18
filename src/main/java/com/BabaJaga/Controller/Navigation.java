package com.BabaJaga.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Navigation {

	
	@GetMapping("/about")
	public String toAbout() {
		return "about";
	}
	
	@GetMapping("/blog")
	public String toBlog() {
		return "blog";
	}
	
	@GetMapping("/contact")
	public String toContact() {
		return "contact";
	}
	
	@GetMapping("/faq")
	public String toFaq() {
		return "faq";
	}
	
	@GetMapping("/gallery")
	public String toGallery() {
		return "gallery";
	}
	
	@GetMapping("/index")
	public String toIndex() {
		return "index";
	}
	
	@GetMapping("/services")
	public String toServices() {
		return "services";
	}
	
	@GetMapping("/testimonials")
	public String toTestimonials() {
		return "testimonials";
	}
	
	@GetMapping("/why-choose-us")
	public String toWhyChoseUs() {
		return "why-choose-us";
	}
	
	@GetMapping("/single")
	public String toSingle() {
	return "single";
	}
}
