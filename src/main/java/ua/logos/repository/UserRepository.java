package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.logos.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
