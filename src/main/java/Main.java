import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("vamos identificar se o número é positivo ou negativo");
    System.out.println("");
    System.out.println("digite um numero inteiro ");
    double numero = sc.nextDouble();
   
if( numero>0) {
    System.out.println("o numero é positivo");
}
    
  if(numero<0){
    System.out.println("o numero e negativo");
  }  









   
  
  sc.close();
  }

}