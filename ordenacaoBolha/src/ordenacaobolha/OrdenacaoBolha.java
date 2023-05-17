/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacaobolha;

/**
 *
 * @author aluno
 */
public class OrdenacaoBolha {

    /** Ordenação Bolha / BubbleSort
     */
    public static void main(String[] args) {
      
        // compara com o elemento que está a esquerda
        // eficaz para listas pequenas
        
        int[]vetor = {40,20,33,40,50,2,15,88,8};
        boolean houveTroca = true;
        
        while(houveTroca){
        
            houveTroca = false;
            
            for(int i = 0; i < vetor.length; i++){
                
                if(vetor[i]> vetor[i+1]){
                    int aux = vetor[i];
                    
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    
                    houveTroca = true;
                }
                
            }
        
        }
        
           for(int i=0; i < vetor.length; i++){
           
               System.out.println("posicao [" +i+ "] = " +vetor[i]);
           }
           
    }
    
}
