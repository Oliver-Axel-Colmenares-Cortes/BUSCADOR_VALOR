import java.util.Scanner;
public class BUSCADOR{
    public static void main (String[]args)
    {
      char letra;
      int num;
      Scanner Sc=new Scanner(System.in);
      Scanner Nm=new Scanner(System.in);
      System.out.println("Introduce cuantas palabras deseas guardar");
      num=Nm.nextInt();
      String[] palab= new String[num]; 
      for(int i=0;i<num;i++){
      System.out.println("Introduce la palabra "+(i+1));
      palab[i]=(Sc.nextLine()).toUpperCase();
    }
    System.out.println("Introduce la letra");
    letra=(Sc.nextLine().toUpperCase()).charAt(0);
    System.out.println("LAS PALABRAS QUE EMPIEZAN CON "+letra+" SON:");
    for(int j=0;j<num;j++)
    {
    if (palab[j].charAt(0)==letra){
        System.out.println("°"+palab[j]);
    }
    }
        
}
}