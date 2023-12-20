import java.util.*;
class Gen3 {
	public static void main (String [] args){
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	

	int First = (int) (Math.random()*Math.abs(y-x)+Math.min(x,y));
	int Second = (int) (Math.random()*Math.abs(y-x)+Math.min(x,y));
	int Third = (int) (Math.random()*Math.abs(y-x)+Math.min(x,y));

	System.out.println(First);
	System.out.println(Second);
	System.out.println(Third);

	int minimum = Math.min(First,Math.min(Second,Third));

	System.out.println("The minimal number generated was " + minimum );



	}







}