package CompanyQuestions;

/* A company allows employees to work on multiple tasks in a day,
but the total working time cannot exceed 8 hours, and an employee can perform a maximum of 5 tasks per day.
Given an array of tasks (where each element represents the task duration in minutes), 
write a program to calculate the maximum number of tasks an employee can complete in a day without violating these rules.
 */

import java.util.Arrays;

public class CalenderTaskScheduler 
{
	public static int maxTasks(int[] tasks)
	{
		Arrays.sort(tasks);
		int sum=0;
		int count=0;

		for(int t : tasks)
		{
			if(count == 5 || sum+t > 480)
				break;

			sum+=t;
			count++;
		}
		return count;

	}
	public static void main(String[] args) {
		int[] arr= {60,30,90,120,20,15};
		System.out.println(maxTasks(arr));
	}

}
