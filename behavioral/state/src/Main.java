import ui.Player;
import ui.UI;

/**
 * Состояние — это поведенческий паттерн,
 * позволяющий динамически изменять поведение объекта при смене его состояния.
 * Поведения, зависящие от состояния, переезжают в отдельные классы.
 * Первоначальный класс хранит ссылку на один из таких объектов-состояний и делегирует ему работу.
 *
 * Применимость:
 * Паттерн Состояние часто используют в Java
 * для превращения в объекты громоздких стейт-машин, построенных на операторах switch.
 *
 * Признаки применения паттерна:
 * Методы класса делегируют работу одному вложенному объекту.
 *
 * Пример: Аудиоплеер
 * Основной класс плеера меняет своё поведение в зависимости от того,
 * в каком состоянии находится проигрывание.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
