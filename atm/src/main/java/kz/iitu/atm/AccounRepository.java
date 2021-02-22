package kz.iitu.atm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccounRepository extends JpaRepository<User,Long> {
    List<User> getAllByBalance(Long balance);
    User getById(Long id);
}
