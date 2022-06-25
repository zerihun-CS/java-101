import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);


        System.out.print("do you have criminal record  ans:yes/no");
        String criminal_input = scan.next();

        boolean has_criminal_record = criminal_input.equalsIgnoreCase("no");
        System.out.println("please insert the amount you saved ");
        int saving_input = scan.nextInt();
        boolean has_good_saving = saving_input > 10_000;
        System.out.print("please insert your credit score input  ");
        float credit_score_input = scan.nextFloat();
        boolean has_credit = credit_score_input >0.7;

        if(has_criminal_record && (has_credit || has_good_saving) ){
            String percentageValue = NumberFormat.getPercentInstance().format(credit_score_input);
            if (saving_input >100_000)
                System.out.println("you can get a loan up to"+saving_input*4);
            else
                System.out.println("you can get a loan up to"+saving_input*2);

            System.out.println("your credit score is "+percentageValue);
        }






    }
}