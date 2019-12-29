package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TableTest {

    @Test
    void initTable() {
        Table table = new Table(1);

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

    @Test
    void countSameChickens() {
        Table table = new Table(2);

        table.orderMenu(MenuRepository.findByMenuNumber(1), 10);

        assertThat(table.countChickens()).isEqualTo(10);
    }

    @Test
    void countDifferentChickens() {
        Table table = new Table(2);

        table.orderMenu(MenuRepository.findByMenuNumber(1), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(1), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(2), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(3), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(4), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(2), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(3), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(4), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(5), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(6), 1);

        assertThat(table.countChickens()).isEqualTo(10);
    }

    @Test
    void countDifferentChickens2() {
        Table table = new Table(2);

        table.orderMenu(MenuRepository.findByMenuNumber(1), 1);
        table.orderMenu(MenuRepository.findByMenuNumber(21), 1);

        assertThat(table.countChickens()).isEqualTo(1);
    }
}