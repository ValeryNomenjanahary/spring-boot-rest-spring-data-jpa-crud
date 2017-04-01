package mg.nomenjanahary.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mg.nomenjanahary.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

}
