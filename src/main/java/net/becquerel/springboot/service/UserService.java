package net.becquerel.springboot.service;

import net.becquerel.springboot.model.User;
import net.becquerel.springboot.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
