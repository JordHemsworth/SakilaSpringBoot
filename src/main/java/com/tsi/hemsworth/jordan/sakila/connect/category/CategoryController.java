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

    //Stops server running
    @PostMapping("/Add_New_Category")
    public @ResponseBody String addNewCategory(@RequestParam String name){
        Category category = new Category(name);
        categoryRepository.save(category);
        return "saved";
    }

    @GetMapping("/Get_Category_By_Name")
    public @ResponseBody
    Iterable<Category>getCatByName(@RequestParam String name) {
        return categoryRepository.getCatByName(name);
    }

    // Retrieve the category by id
    @GetMapping("/Get_Category_By_Id")
    public @ResponseBody
    Category getCatById(@RequestParam int catId) {
        return categoryRepository.getCatById(catId);
    }

    // Edit the category by id
    @PatchMapping("/Edit_Category_By_Id")
    public @ResponseBody
    void editCatById(@RequestParam int catId, @RequestBody CategoryDTO data) {

            Category existingCategory = categoryRepository.getCatById(catId);

            existingCategory.setName(data.getName());
            categoryRepository.save(existingCategory);
        }
    }


