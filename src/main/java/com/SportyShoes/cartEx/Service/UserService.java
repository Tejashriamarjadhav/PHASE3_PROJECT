package com.SportyShoes.cartEx.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.SportyShoes.cartEx.Model.User;
import com.SportyShoes.cartEx.dao.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
