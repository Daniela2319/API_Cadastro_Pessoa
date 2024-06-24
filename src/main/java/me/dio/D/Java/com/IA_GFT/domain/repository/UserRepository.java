package me.dio.D.Java.com.IA_GFT.domain.repository;

import me.dio.D.Java.com.IA_GFT.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
