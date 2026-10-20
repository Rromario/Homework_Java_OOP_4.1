public class BonusMilesService {
    public int calculate(int cost) {
        int milesCosts = 20;
        int miles = cost / milesCosts;
        return (miles);
    }
}