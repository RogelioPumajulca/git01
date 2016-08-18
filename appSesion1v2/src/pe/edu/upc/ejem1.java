/**
 * 
 */
package pe.edu.upc;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class ejem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s= new Scanner(System.in);
		
		String[] arrNom= new String[3];
		int[] arrEnt=new int[3];
	
		
		for (int i = 0; i<arrEnt.length;i++){
			System.out.print("nombre="+(i+1));
			arrNom[i]=s.nextLine();
		}
		
		for (int i = 0; i < arrEnt.length; i++) {
			System.out.println(arrNom[i]);
		}
		System.out.print("agusto se la come");
			
			
	}

}
