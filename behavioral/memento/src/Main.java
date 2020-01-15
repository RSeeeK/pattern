import editor.Editor;
import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;
import shapes.Rectangle;

import java.awt.Color;

/**
 * Снимок — это поведенческий паттерн, позволяющий делать снимки внутреннего состояния объектов,
 * а затем восстанавливать их.
 * При этом Снимок не раскрывает подробностей реализации объектов,
 * и клиент не имеет доступа к защищённой информации объекта.
 *
 * Применимость: Снимок на Java чаще всего реализуют с помощью сериализации. Но это не единственный,
 * да и не самый эффективный метод сохранения состояния объектов во время выполнения программы.
 *
 * Пример: Отмена в редакторе фигур
 * В данном графическом редакторе мы можем менять цвет и позицию фигур.
 * Пользователь может отменять или повторять действия, используя горячие клавиши.
 * Механизм отмены построен при помощи паттерна Снимок и Команды. Перед совершением команды,
 * редактор сохраняет в истории снимок своего состояния. Если нужно отменить команду,
 * редактор берет последнюю запись из истории и восстанавливает состояние из снимка.
 * Для последующей отмены берется команда дальше из истории.
 * Отмененные команды хранятся в истории пока пользователь не совершит какое-то действие.
 * Это нужно, чтобы иметь возможность повторять отменённые команды.
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
