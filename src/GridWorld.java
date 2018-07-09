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




	
	public  void main(String[] args) {
		
		w.show();
		for(int i=0;i<10;i++) {
			for(int g=0; g<10;g++) {
				Location l2 = new Location(i, g);	
				w.add(l2, f1);
			}
		}
	}
	

	



}
