package com.groupeisi.achatenlignems.repository;
import java.util.Optional;
import com.groupeisi.achatenlignems.entities.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
    Optional<UserAccount> findByEmailAndPassword(String email, String password);
}