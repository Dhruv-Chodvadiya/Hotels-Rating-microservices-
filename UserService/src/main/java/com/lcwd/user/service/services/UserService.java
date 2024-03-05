package com.lcwd.user.service.services;
import com.lcwd.user.service.entities.User;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String userId);
}
