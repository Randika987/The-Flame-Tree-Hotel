package project.hotel.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hotel.Model.maintenance;

public interface maintenanceRepository extends JpaRepository<maintenance, Integer> {
    Optional<maintenance> findByTicket(String ticket);

    Optional<maintenance> findByGuestRequestId(String guestRequestId);

    java.util.List<maintenance> findByStatusIgnoreCase(String status);
}
