public class Main {
    public static void main(String[] args) {

        System.out.println("Lasagna making!");

        Lasagna lasagna = new Lasagna();

        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(1, 30));
    }
}