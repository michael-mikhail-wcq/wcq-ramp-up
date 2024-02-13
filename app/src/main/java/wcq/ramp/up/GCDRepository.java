package wcq.ramp.up;

import org.springframework.data.jpa.repository.JpaRepository;
import wcq.ramp.up.model.GCDModel;

public interface GCDRepository extends JpaRepository<GCDModel, Long> {
}
