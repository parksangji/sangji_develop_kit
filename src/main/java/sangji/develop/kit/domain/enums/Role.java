package sangji.develop.kit.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "guest"),
    USER("ROLE_USER", "user"),
    ADMIN("ROLE_ADMIN", "admin");

    private final String key;
    private final String title;
}
