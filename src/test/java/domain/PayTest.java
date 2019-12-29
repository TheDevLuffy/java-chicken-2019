package domain;

import domain.exception.CannotPayEmptyTableException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PayTest {

    @Test
    void payThrowExceptionWhenEmptyTable() {
        assertThrows(CannotPayEmptyTableException.class, () -> new Pay(new Table(1)));
    }

    @Test
    void payConstructSuccessful() {
        Table table = new Table(1);

        table.orderMenu(MenuRepository.findByMenuNumber(1), 1);

        assertDoesNotThrow(() -> new Pay(table));
    }

    @Test
    void discountSame10Chickens() {
        Table table = new Table(1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 10);

        Pay pay = new Pay(table);

        assertThat(pay.payByBaeminPay()).isEqualTo(150_000);
    }

    @Test
    void discountDifferent10Chickens() {
        Table table = new Table(1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 5);
        table.orderMenu(MenuRepository.findByMenuNumber(5), 5);

        Pay pay = new Pay(table);

        assertThat(pay.payByBaeminPay()).isEqualTo(155_000); // 16_000 * 5 + 17_000 * 5 - 10_000 = 80_000 + 85_000 - 10_000 = 155_000
    }

    @Test
    void discountDifferent10ChickensPayCash() {
        Table table = new Table(1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 5);
        table.orderMenu(MenuRepository.findByMenuNumber(5), 5);

        Pay pay = new Pay(table);

        assertThat(pay.payByCash()).isEqualTo(147_250);
    }

    @Test
    void discount10MenusNotAllChickens() {
        Table table = new Table(1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 9); // 16_000 * 9
        table.orderMenu(MenuRepository.findByMenuNumber(21), 1); // 1_000

        Pay pay = new Pay(table);

        assertThat(pay.payByBaeminPay()).isEqualTo(145_000);
    }

    @Test
    void discount10MenusNotAllChickensPayCash() {
        Table table = new Table(1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 9); // 16_000 * 9
        table.orderMenu(MenuRepository.findByMenuNumber(21), 1); // 1_000

        Pay pay = new Pay(table);

        assertThat(pay.payByCash()).isEqualTo(137_750);
    }

    @Test
    void discountOnceWhen11Chickens() {
        Table table = new Table(1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 10); // 16_000 * 10
        table.orderMenu(MenuRepository.findByMenuNumber(2), 1); // 16_000

        Pay pay = new Pay(table);

        assertThat(pay.payByBaeminPay()).isEqualTo(166_000);
    }

    @Test
    void discount11ChickensPayCash() {
        Table table = new Table(1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 10); // 16_000 * 10
        table.orderMenu(MenuRepository.findByMenuNumber(2), 1); // 16_000

        Pay pay = new Pay(table);

        assertThat(pay.payByCash()).isEqualTo(157_700);
    }
}