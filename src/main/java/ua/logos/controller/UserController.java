package ua.logos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.logos.cloudinary.CloudinaryService;
import ua.logos.dto.UserDTO;
import ua.logos.entity.User;
import ua.logos.mapper.UserMapper;
import ua.logos.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CloudinaryService cloudinaryService;

    @GetMapping("/register")
    public String showUserReg(Model model) {
        model.addAttribute("userModel", new UserDTO());
        return "user/register";
    }

    @PostMapping("/register")
    public String registerUser(
            @ModelAttribute UserDTO userDTO
    ) {
        userService.saveUser(UserMapper.userDTOToUser(userDTO));
        return "redirect:/";
    }

    @GetMapping("/verify")
    public String verifyAccount(
            @RequestParam("token") String token,
            @RequestParam("id") String userID
    ) {
        userService.verifyUser(token, userID);
        return "redirect:/";
    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        model.addAttribute("users", userService.findAllUsers());
        return "user/users";
    }

    @GetMapping("/profile/{userID}")
    public String showProfile(@PathVariable int userID, Model model) {
        model.addAttribute("userModel", userService.findByID(userID));
        return "user/user";
    }

    @GetMapping("/{userID}/image")
    public String showAuploadImage(@PathVariable int userID, Model model) {
        model.addAttribute("userID", userID);
        return "user/upload";
    }

    @PostMapping("/image/upload")
    public String uplodImage(
            @RequestParam("userID") String userIDStr,
            @RequestParam("profileImage") MultipartFile file
    ) {
        String imageURL = cloudinaryService.uploadFile(file,"");
        User user = userService.findByID(Integer.valueOf(userIDStr));
        user.setProfileImageURL(imageURL);
        userService.updateUser(user);

        return "redirect:/user/profile/" + userIDStr;
    }

}
