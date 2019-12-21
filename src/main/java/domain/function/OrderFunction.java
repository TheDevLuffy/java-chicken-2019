/*
 * @(#)OrderFunction.java       0.3 2019.12.21
 *
 * Copyright (c) 2019 lxxjn0
 */

package domain.function;

import domain.Menu;
import domain.Table;
import view.InputView;
import view.OutputView;

import java.util.List;

public class OrderFunction extends Function {
    private final List<Menu> menus;
    public OrderFunction(List<Table> tables, List<Menu> menus) {
        super(tables);
        this.menus = menus;
    }

    @Override
    public void operateFunction() {
        OutputView.printTables(tables);
        final int tableNumber = InputView.inputTableNumber();

        OutputView.printMenus(menus);

        final int menuNumber = InputView.inputMenuNumber();

    }
}
