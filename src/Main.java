public class Main {
    public static void main(String[] args) {
        Oblast[] oblasts=Oblast.values();

        for (Oblast oblast : oblasts) {
            System.out.println(oblast.toString());
        }
    }
}