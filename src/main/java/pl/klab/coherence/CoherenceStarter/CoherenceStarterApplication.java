package pl.klab.coherence.CoherenceStarter;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.klab.coherence.CoherenceStarter.domain.Country;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CoherenceStarterApplication {

	@Autowired
	CountryCache cache;

	@PostConstruct
	public void init() {
		cache.put("RUS", new Country("RUS", "Russia", "Moscow"));
	}

	public static void main(String[] args) {
		SpringApplication.run(CoherenceStarterApplication.class, args);
	}
}
