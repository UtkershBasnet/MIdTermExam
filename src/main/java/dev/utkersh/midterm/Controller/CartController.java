package dev.utkersh.midterm.Controller;

import dev.utkersh.midterm.Models.Cart;
import dev.utkersh.midterm.Services.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CartController {
    public CartService cs;
    public CartController(CartService cs){
        this.cs = cs;
    }
    @GetMapping("/cart")
    public Cart[] getCart(){
        return cs.getCart();
    }

    @GetMapping("/cart/{id}")
    public Cart getSingleProduct(@PathVariable("id")Long id) {
        return cs.getSingleProduct(id);
    }
}


