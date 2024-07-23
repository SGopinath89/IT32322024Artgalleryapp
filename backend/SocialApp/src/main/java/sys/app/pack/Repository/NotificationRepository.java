package sys.app.pack.Repository;

import java.util.List;

import javax.management.Notification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByTo_Id(Long userId);
}
