package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.services.RecipeService;

@Controller
public class RecipeController {

	private final RecipeService service;

	public RecipeController(RecipeService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/recipe/show/{id}")
	public String showById(@PathVariable Long id, Model model) {

		model.addAttribute("recipe", service.findById(id));
		return "/recipe/show";
	}
}
