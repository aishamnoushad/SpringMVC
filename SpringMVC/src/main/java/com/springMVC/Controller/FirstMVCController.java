package com.springMVC.Controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springMVC.Model.Message;

@Controller
public class FirstMVCController {
	@GetMapping("/firstpage")
	public String handler(Model model) {
		Message message =new Message();
		message.setMessage("Hi Ammus ! , This is your first mvc application");
		message.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("message", message);
		return "message";
	}
}
