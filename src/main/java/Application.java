import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Application {
    // TODO 구현 진행
    public static void main(String[] args) {
        OutputView.printApplicationMenu();

        final int selectedApplicationMenu = InputView.inputApplicationMenu();

        // selectedApplicationMenu, 1, 2 일 때

        final List<Table> tables = TableRepository.tables();
        OutputView.printTables(tables);

        final int tableNumber = InputView.inputTableNumber();

        // selectedApplicationMenu, 1 일 때

        final List<Menu> menus = MenuRepository.menus();
        OutputView.printMenus(menus);

        final int selectedOrderMenu = InputView.inputOrderMenu();

        final int orderMenuCount = InputView.inputOrderMenuCount();
    }
}
