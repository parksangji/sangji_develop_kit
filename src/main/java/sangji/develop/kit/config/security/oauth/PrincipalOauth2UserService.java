package sangji.develop.kit.config.security.oauth;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sangji.develop.kit.config.security.oauth.dto.SessionUser;
import sangji.develop.kit.domain.entity.Users;
import sangji.develop.kit.repository.UserRepository;

@Service
@AllArgsConstructor
public class PrincipalOauth2UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Users principal = userRepository.findByEmail(email).orElseThrow(() -> {
            return new UsernameNotFoundException("해당 사용자를 찾을 수 없습니다.");
        });
        return new SessionUser(principal);
    }
}
