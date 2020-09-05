package javaapplication1;

import java.util.Scanner;
import java.lang.Math;
public class JavaApplication1 {

    public static void main(String[] args) {
        questao01();
        questao02();
        questao03();
        questao04();
        questao05();
        questao06();
  }
  public static void questao01(){
     float troco;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Informe o valor pago:");
     float precoPago = teclado.nextFloat();
     System.out.println("Informe o valor do produto: ");
     float precoProduto = teclado.nextFloat();
     troco= precoPago - precoProduto;
     System.out.println("Este é p troco: " +troco);
   }
  public static void questao02(){
    float a,b,c;
    float xUm, xDois;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escreva o valor de 'A'");
    a = teclado.nextFloat();
    System.out.println("Escreva o valor de 'B'");
    b = teclado.nextFloat();
    System.out.println("Escreva o valor de 'C'");
    c = teclado.nextFloat();
    float delta = b*b - 4*a*c;
    xUm = (float) ((-b + Math.sqrt(Math.abs(delta))) / 2*a);
    xDois = (float) ((-b - Math.sqrt(Math.abs(delta))) / 2*a);
    System.out.println("O valor de 'x' é: "+xUm);

    System.out.println("O valor de 'x'' é: "+xDois);

  }

  public static void questao03(){
    float pesoExedente, multa;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o peso dos peixes: ");
        float pesoPeixes = teclado.nextFloat();
       if (pesoPeixes > 50){
           pesoExedente = pesoPeixes - 50;
           multa = pesoExedente * 4;  
       } else {
           multa = 0;
           pesoExedente = 0;
       }
        System.out.println("Multa:" +multa);
        System.out.println("Peso exedente: "+pesoExedente);

  }
  public static void questao04(){
    double s, x;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o valor de N: ");
    int n = teclado.nextInt();
    x = n;
    while (n>1) {
      x *= (n - 1);
      n--;
    }
    s = 1 + 0.5 + 0.17 + 1/x;
    System.out.println("O valor de S: " + s);
  }
 
  public static void questao05(){
      int jj= 0, quadPerf = 0, primo;
      double raiz;
      do{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de j: ");
        int j = teclado.nextInt();
        jj= j;
        raiz = (double) Math.sqrt(Math.abs(j));
        if(raiz % 3 == 0 || raiz % 2 == 0 || raiz % 5 == 0){
          quadPerf++;  
        }else{ 
            primo = (int) raiz;
            if (primo / raiz == 1){
                quadPerf++;
            }  
        }
    }while(jj > 0 & jj <= 1000);
    System.out.println("O número de quadrados perfeitos é: " +quadPerf);
  }
  public static void questao06(){
    int x,z,divEme = 0;
        
    do{
      Scanner teclado = new Scanner(System.in);
      System.out.println("Informe o valor de m: ");
      int m = teclado.nextInt();
          x = m;
          z = m;
      if(m < 10) {
        while(m > 1){
          x *= (m - 1);
          m--;
          
        }
        System.out.println("O fatorial de m é: "+x);

      }else {
            divEme = 1
          for (int i = 1; i < m ; i++){
            if(m % i == 0){
                divEme++;
            }
        }
        System.out.print("Esse número é divisível pela quantidade de números: \n"+divEme );
      }
    }while(z != 0 && z > 0);

  }


}
