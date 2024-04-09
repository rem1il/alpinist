import alpinist.Alpinist;
import climbinggroup.ClimbingGroup;
import mountain.Mountain;

public class Main {
    public static void main(String[] args) {
        // Создаем альпинистов
        Alpinist alpinist1 = new Alpinist("Иван", 30, "Москва");
        Alpinist alpinist2 = new Alpinist("Алексей", 25, "Санкт-Петербург");
        Alpinist alpinist3 = new Alpinist("Елена", 28, "Воронеж");

        // Создаем горы
        Mountain mountain1 = new Mountain("Эльбрус", "Россия", 5642);
        Mountain mountain2 = new Mountain("Монблан", "Франция", 4808);
        Mountain mountain3 = new Mountain("Джомолунгма", "Непал", 8848);

        // Создаем группы для восхождения
        ClimbingGroup group1 = new ClimbingGroup(false, mountain1); // Набор закрыт
        ClimbingGroup group2 = new ClimbingGroup(true, mountain2); // Набор открыт
        ClimbingGroup group3 = new ClimbingGroup(true, mountain3); // Набор открыт

        // Добавляем альпинистов в группу 1 (набор закрыт)
        group1.addAlpinist(alpinist1);
        group1.addAlpinist(alpinist2);
        group1.addAlpinist(alpinist3);

        // Добавляем альпинистов в группы 2 и 3 (набор открыт)
        group2.addAlpinist(alpinist1);
        group3.addAlpinist(alpinist2);
    }
}
