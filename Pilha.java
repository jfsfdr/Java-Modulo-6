package pilha;

import java.util.Scanner;

public class Pilha {
   

    public static void main(String[] args) {
        int nelementos;
        String elemento ;
        Scanner dados = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter a pilha ?");
        nelementos = dados.nextInt();
        String[] pilha;
        pilha = new String[nelementos];
        for (int i=0;i<(nelementos-1);i++){
        System.out.print("Que elemento quer inserir ? ");
        elemento=dados.next();
        int posicaopilha;
        pilha[(nelementos-1)]= elemento;
        }
        for(int j=nelementos; j>0; j--){
            
        }
    }
}
