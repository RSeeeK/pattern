import editor.ImageEditor;
import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;
import shapes.Rectangle;

import java.awt.*;

/**
 * Компоновщик — это структурный паттерн, который позволяет создавать дерево объектов
 * и работать с ним так же, как и с единичным объектом.
 * Компоновщик давно стал синонимом всех задач, связанных с построением дерева объектов.
 * Все операции компоновщика основаны на рекурсии и «суммировании» результатов на ветвях дерева.
 *
 * Применимость: Паттерн Компоновщик встречается в любых задачах, которые связаны с построением дерева.
 * Самый простой пример — составные элементы GUI, которые тоже можно рассматривать как дерево.
 *
 * Признаки применения паттерна: Если из объектов строится древовидная структура,
 * и со всеми объектами дерева, как и с самим деревом работают через общий интерфейс.
 *
 * Пример: Простые и составные графические фигуры
 * Этот пример показывает как можно работать со сложными геометрическими фигурами,
 * составленными из простых так, как будто они сами являются простыми.
 */
public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

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
