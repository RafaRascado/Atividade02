/* Nome do Aluno: Rafael Rascado da Silva
* RA:
* Nome do Programa: Atividade 02
* Data: 04/04/2023
*/

// Construa um programa que receba como entrada três valores A, B
// e C e os imprima em ordem crescente.

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    
    System.out.println("Digite o número A: ");
    Scanner teclado = new Scanner(System.in);
    double numeroA = teclado.nextDouble();
    
    
    System.out.println("Digite o número B: ");
    Scanner tecladoB = new Scanner(System.in);
    double numeroB = tecladoB.nextDouble();
  
    
    System.out.println("Digite o número C: ");
    Scanner tecladoC = new Scanner(System.in);
    double numeroC = teclado.nextDouble();
  
    
    if(numeroA < numeroB && numeroB < numeroC){
      System.out.println(numeroA + " " + numeroB + " " + numeroC);
    } else if(numeroB < numeroA && numeroA < numeroC){
      System.out.println(numeroB + " " + numeroA + " " + numeroC);
    } else if(numeroC < numeroA && numeroA < numeroB){
      System.out.println(numeroC + " " + numeroA + " " + numeroB);
    } else if(numeroC < numeroB && numeroB < numeroA){
      System.out.println(numeroC + " " + numeroB + " " + numeroA);
    }
  }
}