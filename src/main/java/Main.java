import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();
        int ourRadius;
        ourRadius = r2 + r3;
        if(r1 >= ourRadius){
            System.out.println("YES");
        }
        if(r1 < ourRadius){
            System.out.println("NO");
        }

    }
}
