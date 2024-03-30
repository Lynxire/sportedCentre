package by.teachmeskills.repository;

import by.teachmeskills.entity.User;

public interface UserRepositoryInterface {
    public void add(User user);
    public User findById(Long id);
    public void deleteById(Long id);
}
