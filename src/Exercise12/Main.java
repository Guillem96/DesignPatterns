package Exercise12;

public class Main {

    public static void main(String[] args) {
        NutririonFacts nf = new NutririonFacts.Builder(20, 20)
                                .calories(20)
                                .sodium(10)
                                .carbohydrate(200)
                                .build();

    }
}
