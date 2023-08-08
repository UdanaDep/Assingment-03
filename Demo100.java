import java.util.Scanner;

public class Demo100 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //DEFINE A LABES AS "myLabelName"  FOR BREAK
        myLabelName:
        {
        
        System.out.print("Enter Your Name -: ");
        String name=scanner.nextLine();

       //VALIDATE NAME INPUT :REJECT EMPTY STRINGS 
        if (name.length()==0 || name.substring(0,1).equals(" "))
        {System.out.print("\u001B[31mInvalid Name...Try again");
        break myLabelName;  }
       
       
        System.out.print("Enter Your Age -: ");
        int age=scanner.nextInt();
        scanner.nextLine();

       //VALIDATE AGE LIMI BETWEEN 10 -18
        if (age<10 || age >18)
        {System.out.print("\u001B[31mInvalid Age...Try again");
       break myLabelName;}
        
        System.out.print("Enter 1st subject -: ");
        String Sub1=scanner.nextLine();

        //IGNORE ALL SUBJECT INPUTS EXCEPT "SE-1"
        if(!Sub1.substring(0,3).equalsIgnoreCase("SE-")){ System.out.println("\u001B[31mInvalid Subject..Try Again");
        break myLabelName;}
      
        System.out.print("Enter Your Marks 1 -: ");
        double Mark1=scanner.nextDouble();
        scanner.nextLine();
        

       //IGNORE MARKS LESS THAN 0 AND MORE THAN 100
        if(Mark1>100 || Mark1<0){System.out.println("\u001B[31mInvalid Marks..try Again");
               break myLabelName;}

        System.out.print("Enter 2nd subject -: ");
        String Sub2=scanner.nextLine();
        if(!Sub2.substring(0,3).equalsIgnoreCase("SE-")){ System.out.println("\u001B[31mInvalid Subject..Try Again");
        break myLabelName;}

         System.out.print("Enter Your Marks 2  -: ");
        double Mark2=scanner.nextDouble();
        scanner.nextLine();
        

        if(Mark2>100 || Mark2<0){System.out.println("\u001B[31mInvalid Marks..try Again");
               break myLabelName;}

        System.out.print("Enter 3rd subject -: ");
        String Sub3=scanner.nextLine();
        if(!Sub3.substring(0,3).equalsIgnoreCase("SE-")){ System.out.println("\u001B[31mInvalid Subject..Try Again");
        break myLabelName;}

       System.out.print("Enter Your Marks 3 -: ");
        double Mark3=scanner.nextDouble();
        scanner.nextLine();
        

        if(Mark3>100 || Mark3<0){System.out.println("\u001B[31mInvalid Marks..try Again");
               break myLabelName;}

       //TOTAL MARKS AND AVG.MARKS AND AVG GRADE
        double Total=(Mark1+Mark2+Mark3);
        double AvgMarks=(Total)/3;
        String avgGrade;
         if( AvgMarks>=75){avgGrade="\u001B[32m"+"CREDIT PASS"+"\u001B[0m";}
        else if(AvgMarks>=55 && AvgMarks<75){avgGrade="\u001B[34m"+" PASS "+"\u001B[0m";}
        else{avgGrade="\u001B[31m"+" FAIL "+"\u001B[0m";}

       //EVERY SUBJECTS'S GRADE VALIDATION AND COLOR ADDED to string
        String gradeColor="";

        String Grade1;
        if( Mark1>=75){Grade1="\u001B[32m"+"CREDIT PASS"+"\u001B[0m";}
        else if(Mark1>=55 && Mark1<75){Grade1="\u001B[34m"+" PASS "+"\u001B[0m";}
        else{Grade1="\u001B[31m"+" FAIL "+"\u001B[0m";}

        String Grade2;
        if( Mark2>=75){Grade2="\u001B[32m"+"CREDIT PASS"+"\u001B[0m";}
        else if(Mark2>=55 && Mark2<75){Grade2="\u001B[34m"+" PASS "+"\u001B[0m";}
        else{Grade2="\u001B[31m"+" FAIL "+"\u001B[0m";}

        String Grade3;
        if( Mark3>=75){Grade3="\u001B[32m"+"CREDIT PASS"+"\u001B[0m";}
        else if(Mark3>=55 && Mark1<75){Grade3="\u001B[34m"+" PASS "+"\u001B[0m";}
        else{Grade3="\u001B[31m"+" FAIL "+"\u001B[0m";}
 
        //CHECKING INTEGER PART OF SUBJECT'S NAME FOR ZERO PADDING
        int subIndex1=Integer.valueOf(Sub1.substring(3,Sub1.length()));
        
        int subIndex2=Integer.valueOf(Sub2.substring(3,Sub2.length()));
        
        int subIndex3=Integer.valueOf(Sub3.substring(3,Sub3.length()));
        

       //PRINT ALL DETAILS

        System.out.printf("NAME : %3$s%2$s%1$s%4$s %n",name.toUpperCase(),"\u001B[34m","\033[0;1m","\u001B[0m");
        System.out.printf("AGE :  %s years old %n",age);
        System.out.printf("STATUS : %s %n",avgGrade,"%");
        System.out.printf("TOTAL : %.2f",Total);
        System.out.printf("      AVERAGE : %.2f%s %n",AvgMarks,"%");

        System.out.println("\u001B[33m+--------------+-------+-----------+\u001B[0m");
        System.out.printf("%4$s|%5$s%1$-26s%4$s|%5$s%2$-19s%4$s|%5$s%3$-23s%4$s|%5$s%n","\033[0;1mSUBJECT\033[0;0m","\033[0;1mMARKS\033[0;0m","\033[0;1mSTATUS\033[0;0m","\u001B[33m","\u001B[0m");
        System.out.println("\u001B[33m+--------------+-------+-----------+\u001B[0m");
        System.out.printf("%4$s|%5$sSE-%1$03d%6$8s%4$s|%5$s%2$-7.2f%4$s|%5$s%3$-20s%4$s|%5$s%n",subIndex1,Mark1,Grade1,"\u001B[33m","\u001B[0m","");
        System.out.println("\u001B[33m+--------------+-------+-----------+\u001B[0m");
        System.out.printf("%4$s|%5$sSE-%1$03d%6$8s%4$s|%5$s%2$-7.2f%4$s|%5$s%3$-20s%4$s|%5$s%n",subIndex2,Mark2,Grade2,"\u001B[33m","\u001B[0m","");
        System.out.println("\u001B[33m+--------------+-------+-----------+\u001B[0m");
        System.out.printf("%4$s|%5$sSE-%1$03d%6$8s%4$s|%5$s%2$-7.2f%4$s|%5$s%3$-20s%4$s|%5$s%n",subIndex3,Mark3,Grade3,"\u001B[33m","\u001B[0m","");
        System.out.println("\u001B[33m+--------------+-------+-----------+\u001B[0m");



        

        }
  
        

        
    }
    
}
