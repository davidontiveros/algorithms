package algos.problems.recursion;

import java.util.List;

/**
 * Imagine a robot sitting on the upper left hand corner of an NxN grid. 
 * The robot can only move in two directions: right and down. 
 * How many possible paths are there for the robot to reach a certain point??
 * 
 * @author daviD_dev
 *
 */
public class FindAllMoves 
{

	public static void main(String[] args) 
	{	
		new FindAllMoves().findAllMoves(0, 0, 4, 2, 2);
		System.out.println(validPaths);
	}

	/**
	 * valid moves : 
	 * 		right	if(x++ < matrix.length)
	 * 		down	if(y++ < matrix[0].length)
	 */
	static int validPaths = 0; 
	private void findAllMoves(int x, int y, int n, int targetX, int targetY)
	{
		// if we reach the target point, increase validPaths counter
		if(x == targetX && y == targetY)
			validPaths++;
		
		//path not valid
		if(x == n &&  y == n)
			return; 
		
		// move right
		if(x+1 < n) 
			findAllMoves(x+1, y, n, targetX, targetY);
		
		// move down
		if(y+1 < n) 
			findAllMoves(x, y+1, n, targetX, targetY);
		
	}
}
