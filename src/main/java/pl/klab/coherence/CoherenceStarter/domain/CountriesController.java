package pl.klab.coherence.CoherenceStarter.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.klab.coherence.CoherenceStarter.CountryCache;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CountriesController {

    @Autowired
    public CountryCache cache;

    @RequestMapping("/countries")
    public List<Country> getCountries() {
        return cache.getAll().stream().collect(Collectors.toList());
    }

}
