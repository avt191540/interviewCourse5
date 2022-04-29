public class Main {
    public static void main(String[] args) {

        try {
            checkString();
        }catch(NullPointerException | IllegalArgumentException e) {
            System.out.println("Data error");
        }finally {
            System.out.println("Check is done");
        }

    }

    private static void checkString() {
    }
}