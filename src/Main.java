public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

// Здесь нас немного запутали. Можно было сократить: удалить строку 4, а значение (10_000) вписать сразу
// в строку 5 в скобки вместо (price). И менять значения как нам надо.
// Если мы переменную price в строках 4 и 5 переименуем в cost программа также будет работать.