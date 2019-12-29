package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MenuTest {

    private Menu menu;

    @BeforeEach
    void setUp() {
        menu = new Menu(1, "후라이드", Category.CHICKEN, 16_000);
    }

    @Test
    void compareMenuNumberIsEqual() {
        assertThat(menu.isSameNumber(1)).isEqualTo(true);
    }

    @Test
    void compareMenuNumberIsNotEqual() {
        assertThat(menu.isSameNumber(2)).isEqualTo(false);
    }
}