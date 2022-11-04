package s0start;

import java.awt.Color;
import java.util.Scanner;

import std.ui.MiniApp;

public class ConstructionSite extends MiniApp{
	
	static int bricks = 0;
	static int material = 0;
	
	public static int whichBrick(int lenght)
	{
		int i;
		
		i = 0;
		while (i < lenght && i < 9)
		{
			i++;
		}
		if (i == 2)
			return (2);
		else if (i == 3)
			return (3);
		else if (i == 4 || i == 5)
			return (4);
		else if (i == 6 || i == 7)
			return (6);
		else if (i >= 8)
			return (8);
		else
			return (1);

	}
	
	public static void buildWall(int p, int w, int h)
	{
		int i, a, l, p1;
		
		i = 0;
		l = w;
		p1 = p;
		while (i < h)
		{
			while (l > 0)
			{
				a = whichBrick(l);
				l -= a;
				placeBrick(p1, true, a, Color.black);
				bricks++;
				material += a;
				p1 += a;
			}
			i++;
			p1 = p;
			l = w;
		}
	}
	
	
//	public static void buildWall(int p, int w, int h)
//	{
//		int i, a;
//		
//		i = 0;
//		a = 0;
//		while (i < w)
//		{
//			while (a < h)
//			{
//				placeBrick(p, true, 1, Color.black);
//				a++;
//			}
//			i++;
//			p++;
//			a = 0;
//		}
//	}
	
	public static void buildFloor(int p, int w, int f)
	{
		int i;
		
		i = 0;
		while (i < 6)
		{
			if (i < 2)
				buildWall(p, w, 1);
			else if (i > 4)
				buildWall(p, w, 1);
			else
			{
				buildWall(p, f, 1);
				buildWall(p + f + 5, w - f - 5, 1);
			}
			i++;
		}
	}
	
	public static void main(String[] args)
	{
		int p, w, f;
		Scanner sc = new Scanner(System.in);
		
		p = sc.nextInt();
		w = sc.nextInt();
		f = sc.nextInt();
		buildFloor(p, w, f);
		buildFloor(p, w, f);
		buildFloor(p, w, f);
		System.out.println("bricks = " + bricks);
		System.out.println("material = " + material);
	}
}
