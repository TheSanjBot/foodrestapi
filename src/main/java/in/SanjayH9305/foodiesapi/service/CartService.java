package in.SanjayH9305.foodiesapi.service;

import in.SanjayH9305.foodiesapi.io.CartRequest;
import in.SanjayH9305.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
