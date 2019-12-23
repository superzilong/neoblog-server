package me.zilong.simpleblog.repository;

import me.zilong.simpleblog.models.ERole;
import me.zilong.simpleblog.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
