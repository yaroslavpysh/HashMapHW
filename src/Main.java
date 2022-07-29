import java.util.*;

public class Main {
    public static void main(String[] args) {
        DellOdd dell = new DellOdd();
        System.out.println("2) Создать мапу с типами значений String, List<Integer>. Посчитать количество повторяющихся значений");
        dell.repValue();
        System.out.println("Создать мапу <String, Integer>. Удалить из мапы все записи с нечетными значениями");
        dell.delete();
    }
}






