package com.sanix.RecipeApp.controllers;

import com.sanix.RecipeApp.domain.Category;
import com.sanix.RecipeApp.domain.UnitOfMeasure;
import com.sanix.RecipeApp.repositories.CategoryRepository;
import com.sanix.RecipeApp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional=categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Pint");

        System.out.println("Cat Id is: "+categoryOptional.get().getId());
        System.out.println("Unit Id is: "+unitOfMeasureOptional.get().getId());
        return "index";
    }

}
