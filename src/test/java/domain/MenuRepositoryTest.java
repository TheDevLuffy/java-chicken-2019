package domain;

import domain.exception.NotFoundMenuException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuRepositoryTest {

    @Test
    void findByMenuNumberSuccessfully() {
        assertDoesNotThrow(() -> MenuRepository.findByMenuNumber(1));
    }

    @Test
    void findByMenuNumberThrowNotFoundMenuException() {
        assertThrows(NotFoundMenuException.class, () -> MenuRepository.findByMenuNumber(1_000_000));
    }
}