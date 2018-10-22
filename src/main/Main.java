package main;

import object.Animal;
import util.Sexe;

public class Main {

	public static void main(String[] args) {
		//Init animal
		Animal cochon = new Animal("cochon","babe", Sexe.Male, 0);
		Animal cochonne = new Animal("cochon","peggy", Sexe.Femelle, 1);
		Animal canard = new Animal("canard","riri", Sexe.Male, 2);
		
		cochon.accoupler(cochonne);
		System.out.println("Test femelle coupling :");
		cochonne.accoupler(cochon);
		System.out.println(cochon);
		System.out.println("Test different race coupling :");
		canard.accoupler(cochonne);
		System.out.println(canard);
	}
}
