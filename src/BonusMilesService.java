public class BonusMilesService {
    public int calculate(int cost) {
        int miles_cost = 20;
        int miles;
        miles = cost / miles_cost;
        return (miles);
    }
}