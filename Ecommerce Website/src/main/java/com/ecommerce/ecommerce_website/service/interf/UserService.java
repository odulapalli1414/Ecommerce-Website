package com.ecommerce.ecommerce_website.service.interf;

import com.ecommerce.ecommerce_website.dto.UserDto;
import com.ecommerce.ecommerce_website.entity.User;
import com.ecommerce.ecommerce_website.dto.LoginRequest;
import com.ecommerce.ecommerce_website.dto.Response;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
