package project.hotel.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hotel.Model.guest;

public interface guestRepository extends JpaRepository<guest, Integer> {
    Optional<guest> findByRequestId(String requestId);

    java.util.List<guest> findByStatusIgnoreCase(String status);
}
