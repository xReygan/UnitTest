// Создайте программу на Java, которая принимает два списка чисел и выполняет следующие действия:
// a. Рассчитывает среднее значение каждого списка.
// b. Сравнивает эти средние значения и выводит соответствующее сообщение:
// - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
// - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
// - ""Средние значения равны"", если средние значения списков равны.
// Важно: Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования.
// Используйте JUnit (для Java) для написания тестов, которые проверяют правильность работы программы.
// Тесты должны учитывать различные сценарии использования вашего приложения. Используйте Checkstyle (для Java) для
// проверки качества кода. Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.
// *Формат и требования к сдаче: * Отчет о выполнении этого задания должен включать в себя следующие элементы:
// - Код программы - Код тестов - Отчет pylint/Checkstyle - Отчет о покрытии тестами
// - Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии.

package seminar_6;

import java.util.List;

public class TwoNumericLists {

    private List<Integer> list1;
    private List<Integer> list2;

    public TwoNumericLists(List<Integer> list1, List<Integer> list2) {
    this.list1 = list1;
    this.list2 = list2;
    }

    public static float getAverageList(List<Integer> list) {
        if (list.isEmpty()) {return 0;}
        float sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum / list.size();
    }

    public static String comparingAveragesTwoLists (List<Integer> list1, List<Integer> list2) {
        float average1 = getAverageList(list1);
        float average2 = getAverageList(list2);
        String comparison;
        if (average1 > average2) {
            comparison = "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            comparison = "Второй список имеет большее среднее значение";
        } else {
            comparison = "Средние значения равны";
        }
        return comparison;
    }
}
