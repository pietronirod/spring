package br.com.pietroniro.assignment1;

import java.util.List;

public class ShoppingCart {
    private int id;
    private List<Item> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", items=" + items +
                '}';
    }
}
