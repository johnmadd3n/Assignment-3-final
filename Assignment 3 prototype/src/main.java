import java.util.Optional;
import java.util.Scanner;

public class main {
    public static class Main {

    private void go() {
        int integer1 = 5;
        double double1 = 10.0;
        RecordA<Integer> recordA = new RecordA<>(integer1);
        RecordB<Double> recordB = new RecordB<>(double1);
        RecordC recordC = new RecordC();
        Scanner Keybrdscan = new Scanner(System.in);
        String menu = """
                1.RecordA 
                2.RecordB
                3.RecordC
                >/140""";
        while (true) {
            System.out.print(menu);

            char menuOp = Keybrdscan.nextLine().charAt(0);
            switch (menuOp) {
                case '1' -> {
                    System.out.println(recordA.methodA());
                    recordA.methodB();
                    InterfaceL.methodC();
                }
                case '2' -> {
                    System.out.println(recordB.methodA());
                    recordB.methodB();
                    InterfaceL.methodC();
                }
                case '3' -> {
                    printOptional(recordC.optional1());
                    printOptional(recordC.optional2());
                }
                case '9' -> {
                    System.out.println("goodbye");
                    System.exit(0);
                }

                default -> System.out.println("invalid response");
            }

        }


    }

        private void printOptional(Optional<Integer> optional) {
            System.out.println(optional);
            System.out.println(optional.orElse(-1));
            System.out.println();

        }

        public static void main (String[]args){
            new Main().go();
        }


    }
}
