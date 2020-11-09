
package Amol;

public class Question4 
{

	public static void main(String[] args) 
	{        //range                    Max          min
		//byte                 127          -128              byte b=100
                 //2 byte-short        32767       -32768             short s=123
		//4 byte-int           2147483647   -2147483648 
		//4 -float
		//8 -double
		//boolean -
		//char \u0000 2byte
/*
Primitive Data Type  	Default Value 3.6
byte	                0
short	                0
int	                0
long	                0L
float	                0.0f
double	                0.0d
char	               '\u0000'
boolean	                false
*/
		short a=100;
		char d='A';
		byte b=(byte)a;
		byte c=(byte)d;
		System.out.println(Character.SIZE);
		//System.out.println(Integer.SIZE);
		
		System.out.println(Short.SIZE);
		System.out.println(Byte.SIZE);
		System.out.println(b);
		System.out.println(c);
		
		
		
}
}