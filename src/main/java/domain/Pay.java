package domain;

import domain.exception.CannotPayEmptyTableException;

public class Pay {

    private final Table table;

    public Pay(final Table table) {
        if (!table.isOccupied()) {
            throw new CannotPayEmptyTableException("빈 테이블은 계산할 수 없습니다.");
        }
        this.table = table;
    }

    public int payByBaeminPay() {
        int totalPrice = table.totalOrders()
                .stream()
                .map(menu -> menu.totalPrice(table.getMenuCount(menu)))
                .reduce(0, Integer::sum);
        int discountPrice = 10_000 * (table.countChickens() / 10);
        return totalPrice - discountPrice;
    }

    public double payByCash() {
        return payByBaeminPay() * 0.95;
    }
}
