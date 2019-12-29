package domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Table {
    private final int number;
    private boolean occupied;
    private Map<Menu, Integer> orders;

    public Table(final int number) {
        this.number = number;
        initTable();
    }

    public void initTable() {
        this.occupied = false;
        this.orders = new HashMap<>();
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public Integer orderMenu(final Menu menu, final Integer count) {
        occupiedByGuest();
        if (orders.containsKey(menu)) {
            return countAfterPut(menu, count + orders.get(menu));
        }
        return countAfterPut(menu, count);
    }

    private void occupiedByGuest() {
        if (!this.occupied) {
            this.occupied = true;
        }
    }

    private Integer countAfterPut(final Menu menu, final Integer count) {
        orders.put(menu, count);
        return orders.get(menu);
    }

    public Integer getMenuCount(final Menu menu) {
        return orders.get(menu);
    }

    public int countChickens() {
        return orders.keySet()
                .stream()
                .filter(Menu::isChicken)
                .map(this::getMenuCount)
                .reduce(0, Integer::sum);
    }

    public Set<Menu> totalOrders() {
        return orders.keySet();
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
