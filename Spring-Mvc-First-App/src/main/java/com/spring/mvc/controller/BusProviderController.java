package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.Service.BusProviderService;
import com.spring.mvc.entities.BusProviders;

@Controller
public class BusProviderController {
	@Autowired
	public BusProviderService busProviderService;

	@GetMapping(value = { "/","/reg"})
	public String loadBusForm(Model model) {
		System.err.println("*** loadBusForm() ***");
		model.addAttribute("busModel", new BusProviders());
		return "busForm";
	}

	@PostMapping("/busAdd")
	public String handleSubmitBtn(@ModelAttribute("busModel") BusProviders bus, Model model) {
		System.err.println("*** handleSubmitBtn() bus ***"+bus);
		int id=63;
		
		bus.setBusproviderId(id++);
		boolean save = busProviderService.save(bus);
		System.err.println("*** handleSubmitBtn() save ***"+save);
		// Sending Data from Controller to UI
		String succMsg = "Registration completed successfully..!!";
		model.addAttribute("msg", succMsg);

		// Returning Logical View Name
		return "busForm";
	}
}
