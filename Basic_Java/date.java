import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

/**
 * date
 */
public class date {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df1 = new SimpleDateFormat("dd/MMM/yyyy");
        SimpleDateFormat dfDay = new SimpleDateFormat("dd");
        SimpleDateFormat dfMonth = new SimpleDateFormat("MM");
        SimpleDateFormat dfYear = new SimpleDateFormat("yyyy");



        System.out.print("Nhap ngay thang nam:  ");
        String s = sc.nextLine();
        
        Date date = null;

        try {
            date = df.parse(s);
        } catch (ParseException e) {
            System.out.println(e);
        }

        System.out.println(date);
        System.out.println(df.format(date));
        System.out.println(df1.format(date));

        System.out.println(dfDay.format(date));
        System.out.println(dfMonth.format(date));
        System.out.println(dfYear.format(date));



        Date dNow = new Date();
        System.out.println(dNow); // current


    }

}