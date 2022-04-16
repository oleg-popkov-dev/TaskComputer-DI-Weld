package comp;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args) {

        // Создаем контейнер вручную
        Weld weld = new Weld();

        // Стартуем контейнер
        WeldContainer container = weld.initialize(); // будем пытаться найти файл beans.xml и считать оттуда

        // Получаем из контейнера объекты - для проверки
//        IMonitor monitor = container.select(IMonitor.class).get();
//        IComputer computer = container.select(IComputer.class).get();
        IComputer comp1 = container.select(Computer.class).get();
        IComputer comp2 = container.select(ComputerNew.class).get();

        System.out.println("comp1.getMouse() = " + comp1.getMonitor());
        System.out.println("comp2.getMouse() = " + comp2.getMonitor());


        container.shutdown(); // закрываем контейнер

    }
}
