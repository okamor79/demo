package ua.logos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.logos.entity.enums.UserRole;
import ua.logos.entity.enums.UserStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor
public class User extends BaseEntity {

    private String email;

    private String password;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    @Enumerated(EnumType.ORDINAL)
    private UserRole role;

    private String token;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @Column(name = "profile_image_url", length = 500)
    private String profileImageURL;

}
