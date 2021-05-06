import java.util.stream.IntStream;

class One {

    static void printRange() {
        IntStream
            .range(1, 10)
            .forEach(System.out::println);

        System.out.println();
    }

    static void skipValues(){
        IntStream
            .range(1,10)
            .skip(5)    //Skip first five values. (1 to 5. Include 5 also)
            .forEach(x -> System.out.println(x));

        System.out.println();
    }

    static void getSum(){
        int total = IntStream
            .range(1,10)
            .sum();

        System.out.println(total);
        System.out.println();

    }

    public static void main(String[] args) {
        One.printRange();
        One.skipValues();
        One.getSum();
    }
}