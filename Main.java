/*
* Programa 2A
*/

import java.util.Scanner;
import java.util.Arrays;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
    	int numAndares;
    	int[] andares;
    	int[] tempo;
    	int[] tempoAux;
    	Scanner scan = new Scanner(System.in);
    	numAndares = scan.nextInt();
    	while(numAndares < 3 || numAndares > 5) {
        	System.out.println("O número de andares deve ser entre 3 e 5");
        	numAndares = scan.nextInt();
        }
    	andares = new int[numAndares];
    	tempo = new int[numAndares];
    	tempoAux = new int[numAndares];
    	for(int i=0;i<numAndares;i++) {
    		andares[i] = scan.nextInt();
    		}
    	for(int i=0;i<numAndares;i++) {
    		tempo[i] = getTempo(andares,i);
    		tempoAux[i] = tempo[i];
    		}
    	Arrays.sort(tempoAux);
    	System.out.println(tempoAux[0]);
    	for(int i=0;i<numAndares;i++) {
    		if(tempo[i] == tempoAux[0]) {
    			System.out.print(i+1);
    			System.out.print(" ");
    		}
    	}
    	scan.close();
    	}
    public static int getTempo(int[] vec, int andar) {
    	int tempo = 0;
    	for(int i=0;i< vec.length;i++) {
    		if(i != andar) {
    			tempo += 2* Math.absExact(andar - i) * vec[i];
    		}
    	}
    		
    	return tempo;
    }
}    