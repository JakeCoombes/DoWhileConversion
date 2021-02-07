/* Name:Jake Coombes
 * Date:10/30/18
 * Description:
 * 		create a do-while loop that goes from 0 to 50 
 * 		and prints out all the numbers except 50
 */

package lab7part2;

public class DoWhileConversion {

	public static void main(String[] args) {
		int loopVariable = 0;
		
		do
		{
			System.out.println("Loop Iteration # " + loopVariable );
			loopVariable++;
		}while(loopVariable < 50);

	}

}
