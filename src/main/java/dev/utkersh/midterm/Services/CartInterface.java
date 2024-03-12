package dev.utkersh.midterm.Services;

import dev.utkersh.midterm.Models.Cart;

public interface CartInterface {
    Cart[] getCart();
    Cart getSingleProduct(Long id);
}
