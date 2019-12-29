package domain;

import domain.exception.AlreadyOccupiedTableException;

import java.util.HashMap;
import java.util.Map;

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

    public void occupiedByGuest() {
        if (this.occupied) {
            throw new AlreadyOccupiedTableException("이미 손님이 있는 테이블 입니다.");
        }
        this.occupied = true;
    }

    public Integer orderMenu(final Menu menu, final Integer count) {
        if (orders.containsKey(menu)) {
            return countAfterPut(menu, count + orders.get(menu));
        }
        return countAfterPut(menu, count);
    }

    private Integer countAfterPut(final Menu menu, final Integer count) {
        orders.put(menu, count);
        return orders.get(menu);
    }

    public Integer getMenuCount(final Menu menu) {
        return orders.get(menu);
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
