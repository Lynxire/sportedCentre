package by.teachmeskills.service;

import by.teachmeskills.entity.User;
import by.teachmeskills.repository.impl.UserRepositoryImpl;
import by.teachmeskills.repository.UserRepositoryInterface;

public class UserService {
    public void add(User user){
        UserRepositoryInterface userRepository = new UserRepositoryImpl();
        userRepository.add(user);
    }

    public User findById(Long id){
        UserRepositoryInterface userRepository = new UserRepositoryImpl();
        return userRepository.findById(id);
    }
}
