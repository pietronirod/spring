package br.com.pietroniro.set;

import java.util.Set;

public class CarDealer {
    private int id;
    private Set<String> models;

    @Override
    public String toString() {
        return "CarDealer{" +
                "id=" + id +
                ", models=" + models +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<String> getModels() {
        return models;
    }

    public void setModels(Set<String> models) {
        this.models = models;
    }
}
