package Task1;

public class Main {
    public static void main(String[] args) {
        Operationable operationEven = (x) -> {
            return x%2==0;
        };
        Operationable operationOdd = (x) -> {
            return x%2!=0;
        };
        RangeOperation rangeOperation = (x, a, b) -> {
            return x>=a&&x<=b;
        };
        MultiplicityChecker multiplicityChecker = (x, a) -> {
            return x%a==0;
        };

        System.out.println("Is 3 even? : " + operationEven.check(3));
        System.out.println("Is 5 odd? : " + operationOdd.check(5));
        System.out.println("Is 7 in range between 3 and 9? : " + rangeOperation.check(7,3,9));
        System.out.println("Is 8 a multiple of 4? : " + multiplicityChecker.check(8,4));


    }
}

@FunctionalInterface
interface Operationable {
    boolean check(int i);
}

@FunctionalInterface
interface RangeOperation {
    boolean check (int i, int x, int y);
}

@FunctionalInterface
interface  MultiplicityChecker {
    boolean check (int i, int a);
}
