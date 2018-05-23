package ua.logos.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserStatus {

    ACTIVE("ACTIVE"), ACTIVATION_PENDING("WAIT ACTIVATION"), NOT_ACTIVE("NOT ACTIVE");

    private String status;

}
