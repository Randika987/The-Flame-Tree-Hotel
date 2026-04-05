package project.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hotel.Model.inventory;

import java.util.Optional;

public interface inventoryRepository extends JpaRepository<inventory, Integer> {
    Optional<inventory> findByItem(String item);
}
