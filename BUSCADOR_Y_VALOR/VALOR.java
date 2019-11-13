import java.util.Scanner;
public class VALOR{
    public static void main (String[]args){
        Scanner Sc=new Scanner(System.in);
        long num;
        String numcon;
        System.out.println("\nINTRODUCE UN NUMERO");
        num=Sc.nextInt();
        numcon=""+num;
        char[] letra= new char[numcon.length()]; 
        System.out.println("\nLOS VALORES DE LAS POCISIONES SON:");
        for(int x=0;x<numcon.length();x++){
            letra[x]=numcon.charAt(x);
            if (letra[x]!='0'){
            System.out.print("\n"+letra[x]);
                  for(int i=(numcon.length()-1);i>x;i--)
                  {
                      System.out.print("0");
                  }  
                }
                }
        }
        }
