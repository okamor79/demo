package ua.logos.mapper;

import ua.logos.dto.UserDTO;
import ua.logos.entity.User;
import ua.logos.entity.enums.UserRole;

public interface UserMapper {

    static User userDTOToUser(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRole(UserRole.ROLE_USER);
        return user;
    };
}
