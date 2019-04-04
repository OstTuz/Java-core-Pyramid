import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int dodanok = 2;
        int start = 0;
        int end = 1;
        while (true)
        {
            System.out.println(str.substring(start,end));

            start = end;
            end = end + dodanok;
            dodanok++;

            if (str.length()<=end)
            {
                System.out.println(str.substring(start));
                break;
            }
        }


    }
}
