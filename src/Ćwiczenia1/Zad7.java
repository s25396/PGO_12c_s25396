package Ćwiczenia1;
import java.util.Scanner;
public class Zad7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        boolean k=false;
        int i,j;
        for(k=true;;){
            int n=sc.nextInt();
            if(n>=5){
                if(n%2!=0){
                    for(i=1;i<=5;i++)
                    {
                        for(j=1;j<=5;j++)
                        {
                            if(j==1||j==5||i==j)
                            {
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();

                    }
                    break;
                }
                else {
                    System.out.println("Spróbuj jeszcze raz!");
                }
            }
            else{
                System.out.println("Spróbuj jeszcze raz!");
            }

        }}
}
