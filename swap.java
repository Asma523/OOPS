import java.util.Scanner;
class swap {
    public static void main(String[]args){
        Scanner b =new Scanner(System.in);
        System.out.println("Enter Two digit number:");
        int c= b.nextInt();
        int last=c%10;
        int first=c/10;
        System.out.println("Swapped digit is:"+(last*10+first));      }
}
