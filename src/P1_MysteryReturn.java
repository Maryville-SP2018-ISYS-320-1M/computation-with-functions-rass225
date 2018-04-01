/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):
  	2 0
	1 2 4
	3 3
	5 2 4
	7 1
	5 9 4
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 Yes I was correct. I learned that the mystery method prints out 2 digits and after that stores variable. 
 Then it prints out 3 digits, which leads to the results I got
 
 */
public class P1_MysteryReturn {
	public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        z = mystery( x, z, y);
        System.out.println( x + " " + y + " " + z);
        x = mystery( z, z, x);
        System.out.println( x + " " + y + " " + z);
        y = mystery( y, y, z);
        System.out.println( x + " " + y + " " + z);

    }
    
    public static int mystery( int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 2;
        System.out.println(y + " " + z );
        return x;
    }

}
