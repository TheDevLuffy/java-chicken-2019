package domain;

import domain.exception.AlreadyOccupiedTableException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TableTest {

    @Test
    void initTable() {
        Table table = new Table(1);

        table.occupiedByGuest();
        table.orderMenu(MenuRepository.findByMenuNumber(1), 1);

        table.initTable();

        assertThat(table.isOccupied()).isEqualTo(false);
    }

    @Test
    void checkTabledOccupied() {
        Table table = new Table(1);
        assertThat(table.isOccupied()).isEqualTo(false);
    }

    @Test
    void changeTableOccupiedStatusWhenFalse() {
        Table table = new Table(1);
        table.occupiedByGuest();
        assertThat(table.isOccupied()).isEqualTo(true);
    }

    @Test
    void changeTableOccupiedWhenAlreadyOccupied() {
        Table table = new Table(1);
        table.occupiedByGuest();

        assertThrows(AlreadyOccupiedTableException.class, table::occupiedByGuest);
    }

    @Test
    void addMenuToSpecificTable() {
        Table table = new Table(2);

        table.orderMenu(MenuRepository.findByMenuNumber(1), 1);

        assertThat(table.getMenuCount(MenuRepository.findByMenuNumber(1))).isEqualTo(1);
    }

    @Test
    void addAlreadyExistMenuToSpecificTable() {
        Table table = new Table(2);

        table.orderMenu(MenuRepository.findByMenuNumber(1), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 4);

        assertThat(table.getMenuCount(MenuRepository.findByMenuNumber(1))).isEqualTo(5);
    }
}