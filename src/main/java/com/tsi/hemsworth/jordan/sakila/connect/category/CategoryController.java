package com.tsi.hemsworth.jordan.sakila.connect.category;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Sakila")
public class CategoryController {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/All_Categories")
    public @ResponseBody
    Iterable<Category>getAllCategories(){
        return categoryRepository.findAll();
    }

    @PostMapping("/Add_New_Category")
    public @ResponseBody String addNewCategory(@RequestParam String name){
        Category category = new Category(name);
        categoryRepository.save(category);
        return "saved";
    }


}
