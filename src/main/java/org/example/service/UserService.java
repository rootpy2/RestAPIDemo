package org.example.service;

import org.example.dao.UserRepo;
import org.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getUserById(Long id) {
        boolean exists = userRepo.exists(id);

        if (!exists) {
            return null;
        }
        return userRepo.findOne(id);
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User editUser(User user) {
        boolean exists = userRepo.exists(user.getId());
        if (!exists) {
            return null;
        }
        userRepo.delete(user.getId());

        return userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.delete(id);
    }
}
