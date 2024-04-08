import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте пользователь!");
        numbuku();
    }
    public static void numbuku(){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> spisok=new ArrayList<>();
        System.out.println("Введите ряд положительных чисел: ");
        int q= scanner.nextInt();
        for (int i=0; q>0;i++){
                spisok.add(q);
            q= scanner.nextInt();
        }
        System.out.println(spisok);
        spisok.sort(Comparator.naturalOrder());
        System.out.println(spisok);
    } private static double mediana(ArrayList<Integer> nums) {
        nums.sort(Comparator.naturalOrder());
        int len = nums.size();
        if(len %2 == 1)
            return nums.get(len/2);
        else
        {
            int a = nums.get(len/2);
            int b = nums.get(len/2 - 1);
            return (a+b) / 2.0;
        }
    }
}
