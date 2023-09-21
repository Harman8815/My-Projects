package connect.pkg4.dot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Arrays;

public class Grid {
	  public  int arr[][]=new int[10][10];

		public int X_corr[]={0,40,80,120,160,200,240,280,320,360};
		 public int Y_corr[]={0,40,80,120,160,200,240,280,320,360};
	    public  Grid(){
	        for(int r[]:arr){
	            Arrays.fill(r, 0);
	        }
//	        for(int r[]:arr){
//	            for(int c:r)
//	                System.out.print(c+" ");
//	            System.out.println();
//	        }
	        
	    }
	    
//		public void draw(Graphics2D g) {
//			
//			g.setColor(Color.blue);
//			for(int i=0;i<10;i++) {
//	            for(int j=0;j<10;j++){
//	                System.out.print("i");
//	               g.fillRect(X_corr[i]+50,Y_corr[j]+50,30,30); 
//	            }
//	            System.out.print("");}
//		}
}
