package by.teachmeskills.service;

import by.teachmeskills.entity.User;
import by.teachmeskills.repository.impl.UserRepositoryImpl;
import by.teachmeskills.repository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepositoryInterface userRepositoryInterface;

    @Autowired
    public UserService(UserRepositoryInterface userRepositoryInterface) {
        this.userRepositoryInterface = userRepositoryInterface;
    }

    public void add(User user) {
        userRepositoryInterface.add(user);
    }

    public User findById(Long id) {
        return userRepositoryInterface.findById(id);
    }
}
