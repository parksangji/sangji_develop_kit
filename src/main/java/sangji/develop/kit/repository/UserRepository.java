package sangji.develop.kit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sangji.develop.kit.domain.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);
    Optional<User> findByEmail(String email);
    Boolean existsUserByEmail(String email);
}
