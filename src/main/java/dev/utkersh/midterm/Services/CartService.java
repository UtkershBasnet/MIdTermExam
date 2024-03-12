package dev.utkersh.midterm.Services;

import dev.utkersh.midterm.CartDTO.FakeStoreCartDTO;
import dev.utkersh.midterm.Models.Cart;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CartService implements CartInterface {
    private final RestTemplate restTemplate = new RestTemplate();
    @Override
    public Cart[] getCart(){
        ResponseEntity<Cart[]> response =
                restTemplate.getForEntity(
                        "https://fakestoreapi.com/carts",
                        Cart[].class);
        Cart[] allProducts = response.getBody();
        return allProducts;
    }
   @Override
    public Cart getSingleProduct(Long id) {
        FakeStoreCartDTO fakeStoreCartDTO = restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+id,
                FakeStoreCartDTO.class
        );
        Cart ct = new Cart();
        ct.setId(fakeStoreCartDTO.getId());
        ct.setUserId(fakeStoreCartDTO.getUserId());
        ct.setDate(fakeStoreCartDTO.getDate());
        ct.setProducts(fakeStoreCartDTO.getProducts());
        return ct;
    }

}
