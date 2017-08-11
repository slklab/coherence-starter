package pl.klab.coherence.CoherenceStarter;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import org.springframework.stereotype.Component;
import pl.klab.coherence.CoherenceStarter.domain.Country;

import java.util.Set;

@Component
public class CountryCache {

    NamedCache cache = CacheFactory.getCache("countries");

    public void put(Object key, Object value) {
        cache.put(key, value);
    }

    public Set<Country> getAll() {
       return cache.entrySet();
    }

}
