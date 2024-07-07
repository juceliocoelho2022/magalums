package devJucelio.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import devJucelio.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
