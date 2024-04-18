package by.teachmeskills.repository.hibbernate;

import by.teachmeskills.entity.User;

public interface UserRepositoryInterface {
    public void add(User user);
    public User findById(Long id);
    public void deleteById(Long id);
}
