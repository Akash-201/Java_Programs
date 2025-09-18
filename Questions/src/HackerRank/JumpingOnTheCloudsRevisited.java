package HackerRank;

public class JumpingOnTheCloudsRevisited 
{
	static int jumpingOnClouds(int[] c, int k) 
	{
		int n = c.length;
		int energy = 100;
		int currentPosition = 0;

		while (true) {

			currentPosition  = (currentPosition + k) % n;
			energy--;

			if (c[currentPosition] == 1) {
				energy -= 2;
			}


			if (currentPosition == 0) {
				break;
			}
		}

		return energy;
	}
	public static void main(String[] args) {
		int[] c= {0, 0, 1, 0, 0, 1, 1, 0};
		int k=2;
		System.out.println(jumpingOnClouds(c, k));
	}

}
