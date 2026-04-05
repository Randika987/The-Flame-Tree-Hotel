package project.hotel.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hotel.Model.inventoryApprovalNotification;

public interface inventoryApprovalNotificationRepository extends JpaRepository<inventoryApprovalNotification, Integer> {
    List<inventoryApprovalNotification> findByNotificationStatusOrderByApprovedAtDesc(String notificationStatus);

    Optional<inventoryApprovalNotification> findFirstByInventoryIdAndNotificationStatusOrderByIdDesc(int inventoryId,
            String notificationStatus);
}