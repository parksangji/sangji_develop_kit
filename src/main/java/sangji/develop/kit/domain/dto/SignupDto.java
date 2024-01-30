package sangji.develop.kit.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import sangji.develop.kit.domain.entity.User;
import sangji.develop.kit.domain.enums.Role;

@Getter
public class SignupDto {

    @NotBlank(message = "이름을 입력해주세요.")
    private String name;
    @NotBlank(message = "이메일 주소를 입력해주세요.")
    @Email(message = "올바른 형식의 이메일 주소를 입력해주세요.")
    private String email;
    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String password;


    public User toEntity(String encPwd) {
        return User.builder()
                .name(name)
                .email(email)
                .password(encPwd)
                .role(Role.USER)
                .build();
    }
}
