import logistic.AirLogistics;
import logistic.Logistics;
import logistic.RoadLogistics;

/**
 * Фабричный метод — это порождающий паттерн проектирования,
 * который решает проблему создания различных продуктов,
 * без указания конкретных классов продуктов.
 * Фабричный метод задаёт метод,
 * который следует использовать вместо вызова оператора new для создания объектов-продуктов.
 * Подклассы могут переопределить этот метод, чтобы изменять тип создаваемых продуктов.
 *
 * Применимость:
 * Паттерн можно часто встретить в любом Java-коде, где требуется гибкость при создании продуктов.
 *
 * Признаки применения паттерна:
 * Фабричный метод можно определить по создающим методам,
 * которые возвращают объекты продуктов через абстрактные типы или интерфейсы.
 * Это позволяет переопределять типы создаваемых продуктов в подклассах.
 *
 * Пример: Производство кросс-платформенных элементов GUI
 * В этом примере в роли продуктов выступают кнопки, а в роли создателя — диалог.
 * Разным типам диалогов соответствуют свои собственные типы элементов.
 * Поэтому для каждого типа диалога мы создаём свой подкласс и переопределяем в нём фабричный метод.
 * Каждый конкретный диалог будет порождать те кнопки, которые к нему подходят.
 * При этом базовый код диалогов не сломается, так как он работает с продуктами только через их общий интерфейс.
 */
public class Main {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.deliveryCargo();

        logistics = new AirLogistics();
        logistics.deliveryCargo();

    }
}
