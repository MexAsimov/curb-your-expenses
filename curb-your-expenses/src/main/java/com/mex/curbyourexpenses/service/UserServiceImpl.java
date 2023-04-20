package com.mex.curbyourexpenses.service;

import com.mex.curbyourexpenses.model.AppUser;
import com.mex.curbyourexpenses.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public AppUser saveUser(AppUser user) {
        return userRepository.save(user);
    }
}
