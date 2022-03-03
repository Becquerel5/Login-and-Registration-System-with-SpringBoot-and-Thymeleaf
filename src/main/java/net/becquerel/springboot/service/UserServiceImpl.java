package net.becquerel.springboot.service;

import net.becquerel.springboot.model.Role;
import net.becquerel.springboot.model.User;
import net.becquerel.springboot.repository.UserRepository;
import net.becquerel.springboot.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
       User user = new User(
               registrationDto.getFirstName(),
               registrationDto.getFirstName(),
               registrationDto.getEmail(),
               registrationDto.getPassword(),
               Arrays.asList(new Role("ROLE_USER")));
       return userRepository.save(user);
    }
}
