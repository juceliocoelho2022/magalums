package devJucelio.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import devJucelio.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
