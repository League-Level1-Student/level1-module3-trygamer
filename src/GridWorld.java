import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static World w = new World();
	public static Bug b = new Bug();
	public static Bug b1 = new Bug();
	public static Flower f1 = new Flower();
	public static Flower f2 = new Flower();
	static Random y = new Random();
	static 




	
	public static void main(String[] args) {
		
		w.show();
		for(int i=0;i<100;i++) {
			int r=y.nextInt(11);
			 int t = y.nextInt(8);
			 Location l2 = new Location(r, t);
			w.add(l2, f1);

			
		}
	}
	

	



}
