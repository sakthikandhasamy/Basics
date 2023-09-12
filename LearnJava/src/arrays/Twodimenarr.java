package arrays;
import java.util.Scanner;
public class Twodimenarr {

	void learn1()
	{
		Scanner sc=new Scanner(System.in);
		int[][]player=new int[2][];
		int total=0;
	//	System.out.println(player.length);
		
		player[0]=new int[4];
		for(int match=0;match<player[0].length;match++)
		{
			System.out.println("Enter Score : ");
			player[0][match]=sc.nextInt();
			total+=player[0][match];
		}
		System.out.println("total: "+total);
		System.out.println("Average: "+total/player[0].length);
		total=0;
		player[1]=new int[3];
		for(int match=0;match<player[0].length;match++)
		{
			System.out.println("Enter Score : ");
			player[1][match]=sc.nextInt();
			total+=player[1][match];
		}
		System.out.println("total: "+total);
		System.out.println("Average: "+total/player[1].length);
		// TODO Auto-generated method stub
	/*	int[][]scores= {{65,35,120,80},{35,68,110,90}};
		int player=0;
		while(player<2)
		{
			for(int match=0;match<4;match++)
			{
				System.out.print(scores[player][match]);
			}
			System.out.println();
			player++;
		}*/
		

	}
	void learn2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter students:");
		int[][]student=new int[sc.nextInt()][];
		
		for(int sem=0;sem<student.length;sem++)
		{
			int total=0;
			System.out.println("Total subject:");
			student[sem]=new int[sc.nextInt()];
			System.out.println("Enter Marks:");
			for(int mark=0;mark<student[sem].length;mark++)
			{
				student[sem][mark]=sc.nextInt();
				total=total+student[sem][mark];
			}
			System.out.println(total);
			System.out.println("Average : "+total/student[sem].length);
			
		}
	}
public static void main(String[] args) {
	Twodimenarr td=new Twodimenarr();
	//td.learn1();
	td.learn2();
}

}
