public class Lasagna {

    public Lasagna(){
    }

    public int expectedMinutesInOven(){
        int expected = 40;
        return expected;
    }

    public int remainingMinutesInOven(int running){
        int remaining;

        remaining = expectedMinutesInOven() - running;
        return remaining;
    }

    public int preparationTimeInMinutes(int layers){
        int total;
        total = 2*layers;

        return total;
    }

    public int totalTimeInMinutes(int layers, int oven){
        int minutes;
        minutes = preparationTimeInMinutes(layers) + oven;

        return minutes;
    }
}
