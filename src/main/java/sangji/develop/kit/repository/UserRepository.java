package sangji.develop.kit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sangji.develop.kit.domain.entity.Users;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByEmailAndPassword(String email, String password);
    Optional<Users> findByEmail(String email);
    Boolean existsUserByEmail(String email);
}
