import java.util.Scanner;
class player
{
	String name;
	int matchplay;
	int runscore;
	int wicket;
	
	player()
	{
		this.name="sachin";
		this.matchplay=664;
		this.runscore=34357;
		this.wicket=200;
	}
	player(String n,int m,int r,int w)
	{
		this.name=n;
		this.matchplay=m;
		this.runscore=r;
		this.wicket=w;
	}
	void acceptInfo(Scanner sc)
	{
		System.out.println("Enter a player Name:");
		name=sc.nextLine();

		System.out.println("Enter a match play:");
		matchplay=sc.nextInt();

		System.out.println("Enter a runscore:");
		runscore=sc.nextInt();

		System.out.println("Enter a wicket:");
		wicket=sc.nextLine();
	}
	void display()
	{
		System.out.println("Player Name:"+name);
		System.out.println("Player match play:"+matchplay);
		System.out.println("Player runscore:"+runscore);
		System.out.println("Player wicket:"+wicket+"\n");
	}
		
		


}
class Test
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		
		player p1=new player[10];
		System.out.println("Enter details for Player :");
		for (int i=0;i<p1.length;i++)
		{
			p[i]=new p[i]
			
				
		
	
}

        // Accept player details
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Player " + (i + 1) + ":");
            p[i] = new p();  // Initialize object
            players[i].acceptInfo(sc);
        }

        System.out.println("\n--- Player Details ---");
        for (int i = 0; i < 10; i++) {
            players[i].displayInfo();
        }

        // Find player with maximum runs
        int maxRunIndex = 0;
        int maxWicketIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (players[i].runsScored > players[maxRunIndex].runsScored) {
                maxRunIndex = i;
            }
            if (players[i].wicketsTaken > players[maxWicketIndex].wicketsTaken) {
                maxWicketIndex = i;
            }
        }

        System.out.println("== Player with Maximum Runs ==");
        players[maxRunIndex].displayInfo();

        System.out.println("== Player with Maximum Wickets ==");
        players[maxWicketIndex].displayInfo();

        sc.close();
    }
}
