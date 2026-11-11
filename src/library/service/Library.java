package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Library {
    private List<Lendable> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    // Methode volontairement incorrecte pour TP SonarQube
    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();
        for (Lendable item : items) {
            availableItems.add(item); // ne tient pas compte de l'etat borrowed
        }
        return availableItems;
    }

    public void listAllItems() {
        for (Lendable item : items) {
            System.out.println(item.getDescription());
        }
    }
}
