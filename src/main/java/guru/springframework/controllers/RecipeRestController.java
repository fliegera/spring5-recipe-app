package guru.springframework.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;

@RestController
public class RecipeRestController {

	private final RecipeService recipeService;

	public RecipeRestController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/rest/recipe")
	public ResponseEntity<Recipe> addRecipe(@RequestBody Recipe recipe) {

		Recipe createRecipe = recipeService.createRecipe(recipe);

		ResponseEntity<Recipe> response = new ResponseEntity<>(createRecipe, HttpStatus.CREATED);

		return response;

	}
}
