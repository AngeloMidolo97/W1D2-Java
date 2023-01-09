/**
 * 
 */
package it.epicode.be;

import java.util.Scanner;

/**
 * @author angelomidolo
 *
 */
public class Esercizio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner form = new Scanner(System.in);
		
		System.out.println("Add name:");
		String studentName = form.nextLine();
		
		System.out.println("Add surname:");
		String studentSurname = form.nextLine();
		
		System.out.println("Add course:");
		String studentCourse = form.nextLine();
		
		System.out.println( "Name: " + studentName );
		System.out.println( "Surname: " + studentSurname );
		System.out.println( "Course: " + studentCourse );
		
		System.out.println(" ");
		
		System.out.println( "Course: " + studentCourse );
		System.out.println( "Surname: " + studentSurname );
		System.out.println( "Name: " + studentName );
		
		form.close();

	}

}
