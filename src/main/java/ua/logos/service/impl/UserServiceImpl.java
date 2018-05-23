package ua.logos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.logos.entity.User;
import ua.logos.entity.enums.UserRole;
import ua.logos.entity.enums.UserStatus;
import ua.logos.mail.Mail;
import ua.logos.repository.UserRepository;
import ua.logos.service.EmailService;
import ua.logos.service.UserService;
import ua.logos.service.utils.RandomToken;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;
    @Autowired private EmailService emailService;

    @Override
    public void verifyUser(String token, String id) {
        int userID = Integer.valueOf(id);
        User user = userRepository.getOne(userID);
        if (user.getToken().equals(token)) {
            user.setStatus(UserStatus.ACTIVE);
            user.setToken(null);
            userRepository.save(user);
        }
    }

    @Override
    public void saveUser(User user) {
        String token = RandomToken.generateToken(50);
        user.setStatus(UserStatus.ACTIVATION_PENDING);
        user.setToken(token);
        userRepository.save(user);
        Mail mail = new Mail();
        mail.setTo(user.getEmail());
        mail.setSubject("You are successfuly register");
        mail.setMessage("Please verify your account follow link:" + "http://localhost:8080/user/verify?token=" + token + "&id=" + user.getId());
//        emailService.sendMessage(mail);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByID(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
