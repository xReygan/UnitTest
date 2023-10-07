package seminar_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static seminar_6.TwoNumericLists.*;

class TwoNumericListsTest {
    @Test
    // Проверка корректной инициализации класса
    void initListTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> list3 = Arrays.asList();
        List<Integer> list4 = Arrays.asList(17);
        new TwoNumericLists(list1, list2);
        new TwoNumericLists(list3, list4);

        // // Проверка значений списков
        Assertions.assertEquals(list1, List.of(1, 2, 3, 4, 5, 6));
        Assertions.assertEquals(list3, List.of());
        Assertions.assertEquals(list4, List.of(17));
    }

    @Test
    // Проверка средних значений списков
    void getAverageListTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList();
        List<Integer> list3 = Arrays.asList(17);

        // Проверка среднго значения списка размером больше одного
        Assertions.assertEquals(3.5, getAverageList(list1));

        // Проверка среднго значения пустого списка
        Assertions.assertEquals(0, getAverageList(list2));

        // Проверка среднго значения списка с размером в один элемент
        Assertions.assertEquals(17, getAverageList(list3));
    }

    @Test
    // Проверка сообщений при сравнении средних значений двух списков
    void comparingAveragesTwoListsTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        // Проверка сообщения когда среднее значение второго списка больше первого
        Assertions.assertEquals(comparingAveragesTwoLists (list1, list2), "Второй список имеет большее среднее значение");

        // Проверка сообщения когда среднее значение первого списка больше второго
        Assertions.assertEquals(comparingAveragesTwoLists (list2, list1), "Первый список имеет большее среднее значение");

        // Проверка сообщения когда средние значения списков равны
        Assertions.assertEquals(comparingAveragesTwoLists (list2, list2), "Средние значения равны");
    }
}