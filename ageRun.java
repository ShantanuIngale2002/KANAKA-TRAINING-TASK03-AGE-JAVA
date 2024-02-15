package Task04AGE1202;
import java.util.Scanner;

import Task04AGE1202.AGEtemplate.ageTemp.AgeCalculator;
public class ageRun {
    public static void main(String[] args) {
        AgeCalculator obj1 = new AgeCalculator();
        AgeCalculator obj2 = new AgeCalculator();
        AgeCalculator obj = new AgeCalculator();

        // obj1.setYear(2002);
        // obj1.setMonth(07);
        // obj1.setDate(26);

        // obj2.setYear(2024);
        // obj2.setMonth(02);
        // obj2.setDate(13);

        // obj.calculateAge(obj1, obj2);

        // System.out.println(obj.getDate()+" "+obj.getMonth()+" "+obj.getYear());
        
        int year,month,date;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n\n+++++  HELLO DEAR VISITER WELCOME TO AGE CALCULATOR MENU +++++\nEnter the Birth Date and Required Date to calculate Age or Differece.\n");

            System.out.print("Enter the Year  for Obj1 : ");
            year=sc.nextInt();
            obj1.setYear(year);

            System.out.print("Enter the Month for Obj1 : ");
            month=sc.nextInt();
            while(!obj1.setMonth(month)){
                System.out.print("Invalid Month, Enter the Valid Month for Obj1 : ");
                month=sc.nextInt();
            }

            System.out.print("Enter the Date  for Obj1 : ");
            date=sc.nextInt();
            while(obj1.setDate(date)!=1){
                if(date==-1){
                    System.out.print("Its not leap year hence 29 feb in invalid, Enter the Valid Date in Feb for Obj1 : ");
                    month=sc.nextInt();
                    continue;
                }
                if(date==-2){
                    System.out.print("Invalid Date for Feb, Enter the Valid Date in Feb for Obj1 : ");
                    month=sc.nextInt();
                    continue;
                }
                if(date==-3){
                    System.out.print("31st in invalid for this month, Enter the Valid Date for Obj1 : ");
                    month=sc.nextInt();
                    continue;
                }
                if(date==-4){
                    System.out.print("31st in invalid for this month, Enter the Valid Date for Obj1 : ");
                    month=sc.nextInt();
                    continue;
                }
            }


            System.out.print("\nEnter the Year  for Obj2 : ");
            year=sc.nextInt();
            while(year<obj1.getYear()){
                System.out.print("The Year should be >= birth year, Enter the valid Year for Obj2 : ");
                year=sc.nextInt();
            }
            obj2.setYear(year);

            System.out.print("Enter the Month for Obj2 : ");
            month=sc.nextInt();
            while(!obj2.setMonth(month)){
                System.out.print("Invalid Month, Enter the Valid Month for Obj1 : ");
                month=sc.nextInt();
            }

            System.out.print("Enter the Date  for Obj2 : ");
            date=sc.nextInt();
            while(obj2.setDate(date)!=1){
                if(date==-1){
                    System.out.print("Its not leap year hence 29 feb in invalid, Enter the Valid Date in Feb for Obj1 : ");
                    month=sc.nextInt();
                    continue;
                }
                if(date==-2){
                    System.out.print("Invalid Date for Feb, Enter the Valid Date in Feb for Obj1 : ");
                    month=sc.nextInt();
                    continue;
                }
                if(date==-3){
                    System.out.print("31st in invalid for this month, Enter the Valid Date for Obj1 : ");
                    month=sc.nextInt();
                    continue;
                }
                if(date==-4){
                    System.out.print("31st in invalid for this month, Enter the Valid Date for Obj1 : ");
                    month=sc.nextInt();
                    continue;
                }
            }


            System.out.println("\nThe DATES stated are >>");
            System.out.println("OBJ 1 (D/M/Y) : "+obj1.getDate()+" / "+obj1.getMonth()+" / "+obj1.getYear());
            System.out.println("OBJ 2 (D/M/Y) : "+obj2.getDate()+" / "+obj2.getMonth()+" / "+obj2.getYear());

            obj.calculateAge(obj1, obj2);
            System.out.print("The Age / Difference becomes :  "+obj.getYear()+" Years   "+obj.getMonth()+" Months   "+obj.getDate()+" Days.");
        }
    }
}
