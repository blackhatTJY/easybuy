package com.awsl.easybuy.controller;

import com.awsl.easybuy.bean.Product;
import com.awsl.easybuy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tjy
 */
@Controller
public class ProductController {

@Autowired
private ProductService productService;


    @RequestMapping("/view")

    public String view(Integer id, Model model){
        Product obj = productService.load(id);
        model.addAttribute("obj",obj);
        return "view";
    }
}
