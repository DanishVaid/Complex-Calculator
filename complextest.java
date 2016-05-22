								/**********************
									Danish Vaid
									Period 4
									AP Computer Science: Mr. Kumar
									complextest.java
									© Danish Vaid 2013
								**********************/	

import java.util.*;

public class complextest{													//main class
	public static void main(String[] args){

		Scanner inp = new Scanner(System.in);								//Make A Scanner
		System.out.println("Which funtion to run (Key)?\n  Magnitude (1)\n  Addition (2)");
		System.out.println("  Substraction (3)\n  Multiply (4)");
		System.out.println("\n  Division (5)\n  Power [All] (6)\n  Root (7)\n  Argand (8)");
		System.out.println("\n  Theata (9)\n  Conjugate (10)\n  Non-Complex to a Complex (11)");
		System.out.println("\n  Check Equality (12)\n  Log Functions (13)\n Quadratic EQ Solver (14)\n somefoo (15)");
		int c = inp.nextInt(); 												//Which Function to run

		System.out.println("What is the real value [of the first if multiple function, 0 if not needed]?");
		double x = inp.nextDouble(); 										//Take in real value
		System.out.println("What is the imaginary value [of the first if multiple function, 0 if not needed]?");
		double y = inp.nextDouble(); 										//Take in imaginary Value
		complex z = new complex(x, y); 										//Assign the complex
		System.out.println(" Complex: " + x + " + " + y + "i assigned");

/**********************
	[Look in complex.java for arguments and returns details]
	A Magnitude function: Used to find the magnitude of a complex
		-Takes in first complex to find magnitude
**********************/	
		if( c == 1) 														//If Magnitude 
				System.out.println("\n --> The Magnitude is = " + z.mag() + " <--" );

/**********************
	[Look in complex.java for arguments and returns details]
	2 Power Functions: Used for caculating the power of the function
		-One For Complex to a complex
		-Other for complex to a real
**********************/	
		if( c == 6){															//If Power
			System.out.println("Is it to real Power(Key 1) or Complex(Key 2)?");
			int l = inp.nextInt();
			if(l == 1){
				System.out.println("Which power do you want to take?" );		//Ask for base Power value
				double n = inp.nextDouble();	
				System.out.println(" \n --> Powered Complex: " + z.powR(z,n) + " <--" );
																			//Real Power Function and Print
			}
			else if(l == 2) {
				System.out.println("What is the real value of next complex (raised value)?");
				double p = inp.nextDouble();										//Take in real value
				System.out.println("What is the imaginary value (raised value)?");
				double m = inp.nextDouble(); 										//Take in imaginary Value
				complex zn = new complex(x, y); 									//Assign the complex
				System.out.println(" \n --> Powered Complex: " + z.powI(z,zn,p,m) + " <--" );
																			//Imaginary Power Function and Print
			}

			else{
				System.out.println("Not an acceptable value. Function Aborted!"); //Invalid entry
			}
		}	

/**********************
	[Look in complex.java for arguments and returns details]
	A Root Function: Used for caculating the rpt of the function
**********************/	
		if( c == 7){
			System.out.println("What root?");
			int l = inp.nextInt();
														//If Root
			System.out.print(" \n --> Root value of Complex: \n");	
/* Next 4 lines left empty for printing Formatting
		


Line Empty for printing formating */	
			complex.printArray(z.root(z,l));							//Root Function and Print
 		}
/**********************
	[Look in complex.java for arguments and returns details]
	An Argand Function: Used for Argand Calculation
**********************/	


		if( c == 8)															//If Argand
			System.out.println(" \n --> Argand Argument of Complex: " + z.argand() + " <--" );
																		   //Argand Function and Print	
/**********************
	A Theata Value Calculator: Used for complex theata Calculation
	Run Base = A complex
	Arguments: None
	Returns: Angle In Degrees
**********************/	
		if( c == 9)									//If Theata //[Below] Theata Function and Print
			System.out.println(" \n --> Degree Theata Value of Complex: " + ((z.argand() * 180.0) / Math.PI) + " <--" );	
/**********************
	[Look in complex.java for arguments and returns details]
	A Conjugate Function: Used for calculating Conjuagte.
**********************/	
		if( c == 10)														//If Conjugate 
			System.out.println(" \n --> Conjuagte Value of Complex: " + z.conj(z) + " <--" );		
/**********************
	[Look in complex.java for arguments and returns details]
	A Power Function for Non-Complex to a Complex: Used for calculating the power of the function.
**********************/	
		if( c == 11){												//If Non-Complex to a Complex 
			System.out.println("What is the numerical base value?");
			double l = inp.nextDouble();
			System.out.println(" \n --> Powered result of value: " + z.nctc(z, l) + " <--" );
		}	
/**********************
	[Look in complex.java for arguments and returns details]
	Log Functions: Used for calculating the log of the complex for any base.
**********************/	
		if( c == 13){														//If Log Functions
			System.out.println("Base e(Key 1), or another (Other Key)?");
			int o = inp.nextInt();
			if( o == 1){
				System.out.println(" \n --> Log Calculated result of value: " + z.logE(z) + " <--" );	
			}	
			else{
				System.out.println("What Log Base?");
				int d = inp.nextInt();	
				System.out.println(" \n --> Log Calculated result of value: " + z.logN(z,d) + " <--" );
			}																		
		}

/**********************
	[Look in complex.java for arguments and returns details]
	Quadratic Equation Solver: Used for calculating roots of a REAL COEFFICIENTS quadratic only.
**********************/	
/*		if( c == 14){														//If Log Functions
			System.out.println("Form used: ax^2 + bx + c = 0");
			System.out.println("Value of A?");
			double a = inp.nextDouble();
			System.out.println("Value of B?");
			double b = inp.nextDouble();
			System.out.println("value of C?");
			double l = inp.nextDouble();
			System.out.println("The Solutions to the Quadratic Equation is:");
			z.printArray(z.qes(a, b, l));
} */

	if( c == 15){														
		System.out.println("Running SomeFoo");
		System.out.println("What is k?");
		int k = inp.nextInt();	
		System.out.println(" \n --> Somefoo Calculated result of value: " + complex.somefoo(k) + " <--" );
} 




	if( (2 <= c && c <= 5)  || c == 12 ) {
			System.out.println("What is the real value of next complex?");
			x = inp.nextDouble();											//Take in real value
			System.out.println("What is the imaginary value?");
			y = inp.nextDouble(); 											//Take in imaginary Value
			complex zn = new complex(x, y); 								//Assign the complex
			System.out.println(" Complex: " + x + " + " + y + "i assigned");

/**********************
	[Look in complex.java for arguments and returns details]
	A Addition Function: Used for static complex addition
		-It takes in the second complex value and adds it to the first complex.
**********************/	
		if( c == 2) 															//If Addition
			System.out.println(" \n --> Sum of Complexs: " + z.add(zn) + " <--");
																		//Addition Function and Print	
/**********************
	[Look in complex.java for arguments and returns details]
	A Substraction Function: Used for static complex Substraction
		-It takes in the second complex value and substracts it to the first complex.
**********************/	
		if( c == 3) 																//If Substraction
			System.out.println(" \n --> Difference of Complexs: " + z.sub(zn) + " <--");			
																		//Substract Function and Print
/* Next 8 lines left empty for printing Formatting
		



		


Line Empty for printing formating */
/**********************
	[Look in complex.java for arguments and returns details]
	A Multiplication Function: Used for static complex multiplication
		-It takes in the second complex value and multiplies it to the first complex.
**********************/	


		if( c == 4) 															//If Multiplication
			System.out.println(" \n --> Product of Complexs: " + z.mul(zn) + " <--");
																//Multiplication Function and Print	
/**********************
	[Look in complex.java for arguments and returns details]
	A Division Function: Used for static complex Division
		-It takes in the second complex value and divides it to the first complex.
**********************/	
		if( c == 5){													//If Division
		 	if(x != 0 && y != 0)										//Checks to make sure not 0.
				System.out.println(" \n --> Division of Complexs: " + z.div(zn) + " <--" );		
			else													// ^ Division Function and Print
				System.out.println(" \n --> Can not divide by 0. Unreal Calculation <--"); 
		}															// ^ If dividing by 0.

/**********************
	[Look in complex.java for arguments and returns details]
	An Equal Function: Used for Checking for equality between complex numbers
**********************/	
		if( c == 12){															//If Check Equality
			if(z.equal(zn) == true)
				System.out.println(" --> The Complex Numbers are equal! <--");
			else
				System.out.println(" --> X - The Complex Numbers are NOT equal. <--");
		}														


	}
}	



}
//© Danish Vaid 2013