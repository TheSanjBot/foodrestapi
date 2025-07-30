package in.SanjayH9305.foodiesapi.service;

import in.SanjayH9305.foodiesapi.io.UserRequest;
import in.SanjayH9305.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
