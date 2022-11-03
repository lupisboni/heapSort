/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapsort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author guada
 */
public class HeapSort {

    private static int longitud;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []arr = {3,1,4,2,8,5,9,7,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        // 1. Construye un gran montón superior
        for(int i=arr.length/2-1;i>=0;i--){
                         // Ajusta la estructura desde el primer nodo no hoja de abajo hacia arriba y de derecha a izquierda
            adjustHeap(arr,i,arr.length);
        }
                 // 2. Ajusta la estructura del montón + intercambia los elementos superiores y finales del montón
        for(int j=arr.length-1;j>0;j--){
                         swap (arr, 0, j); // Intercambia el elemento superior y el elemento final
                         adjustHeap (arr, 0, j); // Reajustar el montón
        }
 
    }
 
    /**
           * Ajuste de la pila superior grande (solo el proceso de ajuste, construido sobre la base de la pila superior grande)
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int []arr,int i,int length){
                 int temp = arr [i]; // Eliminar primero el elemento actual i
                 for (int k = i * 2 + 1; k <longitud; k = k * 2 + 1) {// comenzando desde el hijo izquierdo de i, es decir, comenzando en 2i + 1
                         if (k + 1 <length && arr [k] <arr [k + 1]) {// Si el niño izquierdo es más pequeño que el derecho, k apunta al niño derecho
                k++;
            }
                         if (arr [k]> temp) {// Si el nodo hijo es más grande que el nodo padre, asigne el valor del nodo hijo al nodo padre (sin intercambio)
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
                 arr [i] = temp; // coloca el valor temporal en la posición final
    }
 
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
        
