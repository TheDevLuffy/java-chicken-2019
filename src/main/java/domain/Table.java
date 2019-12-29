package domain;

import domain.exception.AlreadyOccupiedTableException;

public class Table {
    private final int number;
    private boolean occupied;

    public Table(final int number) {
        this.number = number;
        this.occupied = false;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
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
}
