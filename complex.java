										/**********************
											Danish Vaid
											Period 4
											AP Computer Science: Mr. Kumar
											complex.java
											© Danish Vaid 2013
										**********************/	
import java.util.*;
public class complex{
	private double x;								//Real Part
	private double y;								//Imaginary Part

public complex(double real, double imag){
	x = real;
	y = imag;
}

/**********************
	[Look in complex.java for arguments and returns details]
	A Magnitude function: Used to find the magnitude of a complex
		-Takes in first complex to find magnitude
	Run Base =  A complex	
	Arguments: None
	Returns: A Double, Magnitude Value	
**********************/	
public double mag(){

	return(Math.sqrt(x*x+y*y));
}	

/**********************
	[Look in complextest.java for use of function]
	An Addition Function: Used for static complex addition
		-It takes in the second complex value and adds it to the first complex.
	Run Base = A complex
	Arguments: A complex
	Returns: A new complex [made from the addition]
**********************/	
public complex add(complex z){
	double a = x + z.x;
	double b = y + z.y;
	return(new complex(a,b));
}

/**********************
	[Look in complextest.java for use of function]
	A Substraction Function: Used for static complex Substraction
		-It takes in the second complex value and substracts it from the first complex.
	Run Base = A complex
	Arguments: A complex
	Returns: A new complex [made from the Substraction]
**********************/	
public complex sub(complex z){
	double a = x - z.x;
	double b = y - z.y;
	return(new complex(a,b));
}

/**********************
	[Look in complextest.java for use of function]
	A Multiplication Function: Used for static complex multiplication
		-It takes in the second complex value and multiplies it to the first complex.
	Run Base = A complex
	Arguments: A complex
	Returns: A new complex [made from the multiplication]
**********************/	
public complex mul(complex z){
	double a = (x * z.x) - (y * z.y);
	double b = (y * z.x) + (x * z.y);
	return(new complex(a,b));
}

/**********************
	[Look in complextest.java for use of function]
	A Division Function: Used for static complex Division
		-It takes in the second complex value and divides it to the first complex.
	Run Base = A complex
	Arguments: A complex
	Returns: A new complex [made from the Division]
*Next 5 Lines Left Empty for Printing Format*





*Line Left Empty for Printing Format*
**********************/	
public complex div(complex z){
		double a = ( ( (x * z.x) + (y * z.y) ) / ((Math.pow(z.x,2)) + (Math.pow(z.y,2) )) );
		double b = ( ( (y * z.x) - (x * z.y) ) / ((Math.pow(z.x,2)) + (Math.pow(z.y,2) )) );
		return(new complex(a,b));
}

/**********************
	A toSring Function: Is needed - converts values to a readable String
	Run base = complex z
	Arguments: None
	Returns: A String Value
**********************/	
public String toString(){
	String ret = "";
	ret += x;
	ret += (" + ");
	ret += (y + "i");
	return(ret);
}

/**********************
	[Look in complextest.java for use of function]
	An Argand Value Function: Used for Argand Calculation
	Run Base = A complex
	Arguments: None
	Returns: Argand Argument, Angle in Radians
**********************/	
public double argand(){
	return(Math.atan2(y,x));
} 

/**********************
	[Look in complextest.java for use of function]
	2 Power Functions: Used for calculating the power of the function [even to a complex].
		-One For Complex to a complex
		-Other for complex to a real
	Run Base = A complex
	Arguments: Base Value
	Returns: Result Powered Value
**********************/	
public complex powR(complex z, double n){
		double a = (Math.pow(z.mag() , n) * (Math.cos(n * z.argand() ) ) );//Using eq:
		double b = (Math.pow(z.mag() , n) * (Math.sin(n * z.argand() ) ) );//z^n=r^n(cos(n*t)+isin(n*t))
		return(new complex(a,b) );
}
public complex powI(complex z, complex zn, double p, double m){
	double a = ( ( Math.pow( (Math.pow(z.x,2) + Math.pow(z.y,2)), (p/2) )) * (Math.pow(Math.E, -1* m *(Math.atan2(z.y,z.x)))));
	double b = ( a * (Math.cos( (p * Math.atan2(z.y,z.x)) + 0.5 * zn.y * Math.log(Math.pow(z.x, 2) + Math.pow(z.y,2)) ) ) );
	double c = ( a * (Math.sin( (p * Math.atan2(z.y,z.x)) + 0.5 * zn.y * Math.log(Math.pow(z.x, 2) + Math.pow(z.y,2)) ) ) );
	return(new complex(b,c));
}

/**********************
	[Look in complextest.java for use of function]
	A Root Function: Used for calculating the root of the function.
	Run Base = A complex
	Arguments: Base Value
	Returns: Result Rooted Value
**********************/	
public complex[] root(complex z, int l){
		complex[] resn = new complex[l];			//Assign Array										
		double rmag = Math.pow(z.mag(), 1.0/l );	//Root of Magnitude
		double tmpT = 0;							//Set Theata
		for(int j = 0; j < l; j++){
			tmpT = ((z.argand()  + 2 * Math.PI * j)/l);
			resn[j] = new complex(rmag * Math.cos(tmpT), rmag * Math.sin(tmpT));							
		}
		return(resn);
}

/**********************
	[Look in complextest.java for use of function]
	A Power Function for Non-Complex to a Complex: Used for calculating the power of the function.
	Run Base = A complex
	Arguments: Base Value
	Returns: Result Powered Value
*Next 5 Lines Left Empty for Printing Format*





*Line Left Empty for Printing Format*	
**********************/	
public complex nctc(complex z, double l){
	double a = Math.pow(l, z.x) * ((Math.cos(z.y*Math.log(l))));
	double b = Math.pow(l, z.x) * ((Math.sin(z.y*Math.log(l))));
	return(new complex(a,b));
}

/**********************
	[Look in complextest.java for use of function]
	A Conjugate Function: Used for calculating Conjuagte.
	Run Base = A complex
	Arguments: None
	Returns: Conjugate
**********************/	
 public complex conj(complex z){
 	double a = z.x;
 	double b = -1 * z.y;
 	return(new complex(a,b));
} 

/**********************
	[Look in complextest.java for use of function]
	An Array Printing Function: Used for Printing Arrays.
	Run Base = A complex
	Arguments: Array
	Returns: Prints out the Value of the array
**********************/	
public static void printArray(Object[] array){
	for( int i = 0; i < array.length; i++){
		System.out.println(array[i]);
	}
	System.out.println("------------------");
}

/**********************
	[Look in complextest.java for use of function]
	An Equal Function: Used for Checking for equality between complex numbers
	Run Base = A complex
	Arguments: A Complex
	Returns: True or False based on respective equality
**********************/	
public boolean equals(complex z){
	double ep = 1.0E-10;						//Epsilon Value
	int q = 0;											//Counter for Both Correct or not
	if( Math.abs(z.x - x) < ep){						//Checks for Real Diviation 
		System.out.println(" --> The Real Values Match!");
		q++;
	}
	else { 

		System.out.println(" --> The Real Values DO NOT Match!");
	}

	if( Math.abs(z.y - y) < ep){						//Checks for Imaginary Diviation 
		System.out.println(" --> The Imaginary Values Match!");
		q++;
	}
	else { 
		System.out.println(" --> The Imaginary Values DO NOT Match!");
	}
	if( q == 2){
		return(true);
	}
	else{
		return(false);
	}
	
}

/*Next 8 Lines Left Empty for Printing Format*








*Line Left Empty for Printing Format*/ 

/**********************
	[Look in complextest.java for use of function]
	Log Functions: Used for calculating the log of the complex for any base.
	Run Base = A complex
	Arguments: A Complex
	Returns: Log's computated value
**********************/			
public complex logE(complex z){							//Base E Funtion
		double a = ( Math.log(z.mag() ) );
		double b = z.argand();
		return(new complex(a,b));
}	

public complex logN(complex z, int c ){					//Other Base Function
		double a = (( Math.log(z.mag()) ) / (Math.log(c)) );
		double b = z.argand()*( 1 / Math.log(c));
		return(new complex(a,b));
}

/**********************
	[Look in complextest.java for use of function]
	Quadratic Equation Solver: Used for calculating roots of a REAL COEFFICIENTS quadratic only.
	Run Base = Real Vales: Form Used - ax^2 + bx + c = 0
	Integers: A, B, C
	Returns: Quadratic solutions/roots (Can return complex roots as well)
**********************/	
/*public static complex[] qes(double a, double b, double c){
		complex[] qess = new complex[2];
		complex root = new complex( (Math.pow(b,2) - 4*a*c) , 0 );

			qess[0] = (new complex(-b , 0)).add(complex.root(root, 2))).div( ( (new complex(2,0).mul((new complex(a,0)))));
			// qess[1] = (new complex(-b , 0).sub(complex.root(root, 2))).div( (2* (new complex(a,0))) ); 
		return(qess);
} */

public static complex somefoo(int k){		//CHECK
	complex z = new complex(0,0);
	//z = z.powR(z, -1);
	double d = 0.0;
	complex zn = new complex(0,0);
	for(int n = 1; n <= k; n++){
		d = (Math.pow(-1,n) * Math.pow(n,0.5));
		zn = new complex(1,d);
		//zn = zn.powR(zn, -1);
		z = z.add(zn);
	}

	return(z);
}

/**********************
	[Look in complextest.java for use of function]
	A Set Real Function
	Run Base = Complex z
	Returns: Nothing, just sets the real part of the complex
**********************/
public void setReal(double newReal){
	x = newReal;
}

/**********************
	[Look in complextest.java for use of function]
	A Set Imaginary Function
	Run Base = Complex z
	Returns: Nothing, just sets the imgainary part of the complex
**********************/
public void setImag(double newImag){
	y = newImag;
}
/*Next 8 Lines Left Empty for Printing Format*








*Line Left Empty for Printing Format*/ 

/**********************
	[Look in complextest.java for use of function]
	A static "get" method of the real part of a complex
	Run Base = A Complex
	Returns: A double value of the real
**********************/	
public double getReal(){
	return x;
}

/**********************
	[Look in complextest.java for use of function]
	A static "get" method of the Imaginary part of a complex
	Run Base = A Complex
	Returns: A double value of the real
**********************/	
public double getImag(){
	return y;
}

/**********************
	[Look in complextest.java for use of function]
	A Noargument Constructor
	Run Base = Nothing
	Returns: Complex: "0.0 + 0.0i"
**********************/
public complex(){
	x = 0.0;
	y = 0.0;
}	

/**********************
	[Look in complextest.java for use of function]
	A Copier Constructor
	Run Base = Complex z
**********************/
public copycomplex(complex z){
	this(z.x, z.y);
}

/**********************
	A "static" Magnitude Function
	Run Base = Complex z
	Returns: Magnitude
**********************/
public static double mag(complex z){
	return (Math.sqrt((z.x*z.x)+(z.y*z.y)));
} 

/**********************
	A "static" Addition Function – Uses Method overloading
	Run Base = Complex x and y
	Returns: Sum complex
**********************/
public static complex add(complex x, complex y){	
	return new complex(x.x+y.x, x.y+y.y);
}

/**********************
	A "static" Substraction Function – Uses Method overloading
	Run Base = Complex x and y
	Returns: Difference complex
**********************/
public static complex subtract(complex x, complex y){
	return new complex(a.x-b.x,a.y-b.y);
}
/*Next 12 Lines Left Empty for Printing Format*












*Line Left Empty for Printing Format*/ 
/**********************
	A "static" Conjugate Function – Uses Method overloading
	Run Base = Complex z
	Returns: Conjugate Complex
**********************/
public static complex conjugate(complex z){
	return(new complex(z.x,-z.y));
} 

/**********************
	A "static" Multiplication Function – Uses Method overloading
	Run Base = Complex x and y
	Returns: Multiplied complex
**********************/
public static complex multiply(complex x, complex y){
	return(new complex(x.x*y.x-(x.y*y.y), x.y*y.x+x.x*y.y));
}

/**********************
	A "static" Division Function – Uses Method overloading
	Run Base = Complex x and y
	Returns: Divided complex
**********************/
public static complex div(complex a, complex b){
	complex bottom=b.multiply(b.conjugate());
	double imag=(a.x*b.x)-(a.y*b.y);
	double real=(a.y*b.x)+(a.x*b.y);
	return(new complex(real/bottom.x,imag/bottom.x));
}
/**********************
	A "static" Argand Function – Uses Method overloading
	Run Base = Complex z
	Returns: theata value
**********************/
public static double arg(complex z){
	double theta=Math.atan2(z.y,z.x);
	return(theta);
}

/**********************
	A "static" Root Function – Uses Method overloading
	Run Base = Complex z and an Integer Value
	Returns: A Complex Array
**********************/
public static complex[] root(complex z, int n){
	double[] real=new double [n+1];
	double[] imag=new double [n+1];
	double rad=z.arg()/(double)n;
	double mag=Math.pow(z.mag(),1.0/n);
	complex[] roots=new complex [n+1];
	for(int k=0;k<n;k++){
		real[k]=(double)mag*Math.cos(rad+(k*(Math.PI*2)/n));
		imag[k]=(double)mag*Math.sin(rad+(k*(Math.PI*2)/n));
		roots[k]=new complex(real[k],imag[k]);
	}
	return roots;
}

/**********************
	A "static" toString Method 
	Run Base = Complex z
	Returns: A String
**********************/
public static String toString(complex z){
	String ret="";
	ret=ret+"(";
	ret=ret+z.x;
	ret=ret+",";
	ret=ret+z.y+"i)";
	return(ret);
}
/*Next 12 Lines Left Empty for Printing Format*












*Line Left Empty for Printing Format*/ 

/**********************
	Represents a complex in its polar form
	A "dynamic" polar string Method 
	Run Base = none
	Returns: A String
**********************/
public String polarString(){
	String ret="";
	ret=ret+this.mag();
	ret=ret+"e^";
	ret=ret+this.arg();
	ret=ret+"i";
	return(ret);
}

/**********************
	Represents a complex in its polar form
	A "static" polar string Method 
	Run Base = complex z
	Returns: A String
**********************/
public static String polarString(complex z){
	String ret="";
	ret=ret+z.mag();
	ret=ret+"e^";
	ret=ret+z.arg();
	ret=ret+"i";
	return(ret);
}

}

//© Danish Vaid 2013