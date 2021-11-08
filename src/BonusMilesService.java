public class BonusMilesService {
    public int calculate(int cost) {
        int bonusRate = 20;
        int bonusCount = cost / bonusRate;
        return bonusCount;
    }
}
