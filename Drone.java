import java.util.Scanner;

//Author Name: Samantha Halbleib
//Date: 01/19/2020
//Program Name: drone.java
//Purpose: Simulation using button, drone movement in x, y,z location

public class Drone {

	private int x,y,z;
	
	private int direction;
	
	public Drone() {
		x=0;
		y=0;
		z=0;
		direction=0;
	}
	
	public int getX() {
		return x;
		
	}
	
	public void setX(int x) {
		this.x=x;
		
	}
	
	public int getY() {
		return y;
		
	}
	
	public void setY(int y) {
		this.y=y;
		
	}
	
	public int getZ() {
		return z;
		
	}
	
	public void setZ(int z) {
		this.z=z;
		
	}
	
	public void moveUp(int spaces) {
		z+=spaces;
		
	}
	
	public void moveDown(int spaces) {
		z-=spaces;
		
		if (z<0) {
			z=0;
		}
	}
	
	public void forward (int spaces) {
		if(direction==0) {
			y+=spaces;
		}
		
		else if (direction==1) {
			x+=spaces;
		}
		
		else if (direction==2) {
			y-=spaces;
		}
		
		else {
			x-=spaces;
		}
	}
	
	public void backward(int spaces) {
		if(direction ==0) {
			y-=spaces;
		}
		
		else if(direction==1) {
			x-=spaces;
		}
		
		else if (direction==2) {
			y+=spaces;
		}
		
		else {
			x+=spaces;
		}
	}
	
	public void turnRight() {
		direction=(direction+1)%4;
	}
	
	public void turnLeft() {
		direction--;
		if (direction<0) {
			direction = 3;
		}
	}
	
	@Override
	public String toString() {
		return "Drone is at (x=" + x + ", y=" + y + ", z=" + z + ")";
	}
	
	public static void main(String[] args) {
		Drone drone = new Drone();
		Scanner scanner = new Scanner(System.in);
				String ch ="";
		while (!ch.equalsIgnoreCase("X")) {
			System.out.println("\n" + drone + "\n");
			
			System.out.println("Enter F to move forward 1 space");
			System.out.println("Enter B to move backward 1 space");
			System.out.println("Enter U to move up 1 space");
			System.out.println("Enter D to move down 1 space");
			System.out.println("Enter R to turn right");
			System.out.println("Enter L to turn left");
			System.out.println("Enter X to quit");
			System.out.print("Your choice: ");
			
			ch = scanner.next();
			
			if (ch.equalsIgnoreCase("F")) {
				drone.forward(1);
			}
			
			else if (ch.equalsIgnoreCase("B")) {
				drone.backward(1);
			}
			
			else if (ch.equalsIgnoreCase("U")) {
				drone.moveUp(1);
			}
			
			else if (ch.equalsIgnoreCase("D")) {
				drone.moveDown(1);
			}
			
			else if (ch.equalsIgnoreCase("R")) {
				drone.turnRight();
			}
			
			else if (ch.equalsIgnoreCase("B")) {
				drone.turnLeft();
			}
		}
		
		}
	}

