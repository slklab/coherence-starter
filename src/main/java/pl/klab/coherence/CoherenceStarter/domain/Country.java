package pl.klab.coherence.CoherenceStarter.domain;

import java.io.Serializable;

public class Country implements Serializable, Comparable {
    private String code;
    private String name;
    private String capital;

    public Country() {
    }

    public Country(String code, String name, String capital) {
        this.code = code;
        this.name = name;
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public int compareTo(Object o) {
        Country other = (Country) o;
        return name.compareTo(other.name);
    }

    public String toString() {
        return "Country (code = " + code +
                ", name = " + name +
                ", capital = " + capital +
                ")";
    }
}
