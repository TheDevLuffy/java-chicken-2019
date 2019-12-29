package domain;

import domain.exception.AlreadyOccupiedTableException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TableTest {

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
}