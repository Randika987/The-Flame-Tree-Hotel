package project.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hotel.Model.users;

public interface authRepository extends JpaRepository<users, Integer> {
    users findByUsername(String username);

}
