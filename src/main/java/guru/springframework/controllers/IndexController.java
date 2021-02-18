package guru.springframework.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

	private final CategoryRepository categoryRepository;
	private final UnitOfMeasureRepository unitOfMeasureRepository;

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage() {
		Optional<Category> category = categoryRepository.findByDescription("American");

		Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Teaspoon");

		System.out.println("Cat ID is " + category.get().getId());
		System.out.println("Uom ID is " + uom.get().getId());

		return "index";
	}

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
}
