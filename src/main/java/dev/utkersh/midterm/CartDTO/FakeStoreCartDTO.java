package dev.utkersh.midterm.CartDTO;

import dev.utkersh.midterm.Models.products;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class FakeStoreCartDTO {
    int id;
    int userId;
    String date;
    products[] products;
}
