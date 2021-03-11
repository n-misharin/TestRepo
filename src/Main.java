import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        for(int i = 0; i < line.length(); i++){
            if ('0' <= line.charAt(i) && line.charAt(i) <= '9'){
                String currentSymbol = line.charAt(i) + "";
                if (set1.contains(currentSymbol)){
                    set2.add(currentSymbol);
                }else{
                    set1.add(currentSymbol);
                }
            }
        }

        if (set2.isEmpty()){
            System.out.println("NO");
        }else{
            for(String elem: set2){
                System.out.print(elem + "");
            }
        }
    }
}

