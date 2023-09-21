package sorting;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Logic extends JPanel implements KeyListener,ActionListener,Runnable{

	
	/**
	 * @author Harman
	 */
	private static final long serialVersionUID = 1L;
	public int xdir[]={60,120,180,240,300,360,420,480,540,600,660,720,780,840,900,960};
	public int arr[]= {60,20,40,80,50,10,70,90,20,100,120,110,130,150,120};
	public int temp[]=arr;
	public int il=-1,jl=-1,zl=-1,zx=-1;
	public boolean logic=true;
	public int x=0;
	public int delay=500;
	Thread T1=new Thread(this);
	public JFrame currobj;
	
	public Logic(JFrame obj) {
		currobj=obj;
		 addKeyListener(this);
		 setFocusable(true);
		 setFocusTraversalKeysEnabled(false);
		 T1.start();
	}
	public void paint(Graphics g) {
		
		 g.setColor(Color.black);
		 g.fillRect(0,0, 1000, 700);
		
	     g.setColor(Color.YELLOW);
	     g.setFont(new Font("serif",Font.BOLD,18));
	     
	     for(int i=0;i<15;i++) {
	  	     g.fillRect(xdir[i],400-arr[i]*2 , 35, arr[i]*2);
		     g.drawString(Integer.toString(arr[i]), xdir[i]+5,450 );
		     
	     }

	     g.setFont(new Font("serif",Font.BOLD,24));
	     if(x==0) {

		     g.setColor(Color.red);
		     g.drawString("Select Menu", 400,20);
		     g.drawString("press 1 for bubble sort ", 360,50);
		     g.drawString("press 2 for insertion sort ", 360,80);
		     g.drawString("press 3 for selection sort ", 360,110);
		     g.drawString("press 4 for merge sort ", 360,140);
		     g.drawString("press 5 for quick sort ", 360,170);
		     g.drawString("press 6 for heap sort ", 360,200);
		     g.drawString("press enter to restart", 360,600);
	    	 
	     }
	     if(x==1) {

		     g.setColor(Color.red);
		     g.drawString("Bubble Sort", 400,20);
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 35, arr[il]*2);
			     g.drawString("i", xdir[il]+10,480 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 35, arr[jl]*2);
			     g.drawString("j", xdir[jl]+10,480 );
			     	 
		     }
	     }
	     else if(x==2) {

		     g.setColor(Color.red);
		     g.drawString("Insertion Sort", 400,20);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 35, arr[il]*2);
			     g.drawString("Key", xdir[il]+5,480 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 35, arr[jl]*2);
			     g.drawString("j", xdir[jl]+10,480 );
			     	 
		     }
	     } 
	     else if(x==3) {

		     g.setColor(Color.red);
		     g.drawString("Selection Sort", 400,20);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 35, arr[il]*2);
			     g.drawString("i", xdir[il]+5,480 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 35, arr[jl]*2);
			     g.drawString("max", xdir[jl]+10,480 );
			     	 
		     }
	     }
	     else if(x==4) {

		     g.setColor(Color.red);
		     g.drawString("Merge Sort", 400,20);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 35, arr[il]*2);
			     g.drawString("left", xdir[il]+5,480 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 35, arr[jl]*2);
			     g.drawString("right", xdir[jl],480 );
			     	 
		     }
	     }
	     else if(x==5) {

		     g.setColor(Color.red);
		     g.drawString("Quick Sort", 400,20);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 35, arr[il]*2);
			     g.drawString("left", xdir[il]+5,480 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 35, arr[jl]*2);
			     g.drawString("right", xdir[jl],480 );
			     
			     g.setColor(Color.magenta);
		    	 g.fillRect(xdir[zl],400-arr[zl]*2 , 35, arr[zl]*2);
			     g.drawString("pivot", xdir[zl],500 );
			     	 
		     }
	     }
	     else if(x==6) {

		     g.setColor(Color.red);
		     g.drawString("Heap Sort", 400,20);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 35, arr[il]*2);
			     g.drawString("left", xdir[il]+5,480 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 35, arr[jl]*2);
			     g.drawString("right", xdir[jl],480 );
			     	 
		     }
	     }
	     
		
	}
	
	public int typedef() {
		return x;
		
	}
	public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Compare left child with root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Compare right child with root
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

	public static int partitionDescending(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void mergeDescending(int[] arr, int[] temp, int left, int mid, int right) {
	        int i = left;
	        int j = mid + 1;
	        int k = left;

	        while (i <= mid && j <= right) {
	            if (arr[i] >= arr[j]) {
	                temp[k++] = arr[i++];
	            } else {
	                temp[k++] = arr[j++];
	            }
	        }

	        while (i <= mid) {
	            temp[k++] = arr[i++];
	        }

	        while (j <= right) {
	            temp[k++] = arr[j++];
	        }

	        for (int l = left; l <= right; l++) {
	            arr[l] = temp[l];
	        }
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			currobj.dispose();
			Main.ini(new JFrame());
		}
		if(e.getKeyCode()==KeyEvent.VK_0) {
			x=0;
		}if(e.getKeyCode()==KeyEvent.VK_1) {
			x=1;
		}if(e.getKeyCode()==KeyEvent.VK_2) {
			x=2;
		}if(e.getKeyCode()==KeyEvent.VK_3) {
			x=3;
		}if(e.getKeyCode()==KeyEvent.VK_4) {
			x=4;
		}if(e.getKeyCode()==KeyEvent.VK_5) {
			x=5;
		}if(e.getKeyCode()==KeyEvent.VK_6) {
			x=6;
		}
		System.out.println(x);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    if(x==0) {
			while(T1.isAlive()) {
				if(x>0)
					break;
				x=typedef();
				
			}
		}
		if(x==1) {
			//bubble sort
			int n=arr.length;
			for(int i=0;i<n;i++) {
				for(int j=0;j<i;j++) {
					jl=j;
					try {
						T1.sleep(delay-300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(arr[i]>arr[j]) {
						try {
									T1.sleep(delay+200);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						il=i;
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;


						repaint();
					}
					repaint();
				}
			}	
		}
		else if(x==2) {
			//insertion sort
			System.out.println("2");
			int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	        	
	            int key = arr[i];
	            il=i;
	            int j = i - 1;
	            while (j >= 0 && arr[j] < key) {
	            	
	                arr[j + 1] = arr[j];
	            	jl=j;
	                j = j - 1;
	                repaint();
	                try {
						T1.sleep(delay);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	            arr[j + 1] = key;
	        }
		}
		else if(x==3) {
			//selection Sort
			int n = arr.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            int maxIndex = i;
	            il=i;
	            // Find the index of the maximum element in the unsorted part of the array
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] > arr[maxIndex]) {
	                    maxIndex = j;jl=j;
	                    repaint();
	                    try {
							T1.sleep(150);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                }
	            }
	            
	            // Swap the maximum element with the first element in the unsorted part
	            int temp = arr[maxIndex];
	            arr[maxIndex] = arr[i];
	            arr[i] = temp;
	            repaint();
	            try {
					T1.sleep(delay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	        }
		}
		else if(x==4) {
			//Merge Sort
			  int n = arr.length;
		        int[] temp = new int[n];

		        for (int currSize = 1; currSize < n; currSize *= 2) {
		            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
		                int mid = Math.min(leftStart + currSize - 1, n - 1);
		                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);
		                il=leftStart; jl=rightEnd;
		                try {
							T1.sleep(delay+300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                repaint();
		                mergeDescending(arr, temp, leftStart, mid, rightEnd);
		                
		                try {
							T1.sleep(delay+300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                repaint();
		            }
		        }
		}
		else if(x==5) {
			//quick Sort
			  int n = arr.length;
		        Stack<Integer> stack = new Stack<>();

		        stack.push(0);
		        stack.push(n - 1);

		        while (!stack.isEmpty()) {
		            int high = stack.pop();
		            int low = stack.pop();
		            	il=low;
		                jl=high;
		                repaint();
		            if (low < high) {
		                int pivotIndex = partitionDescending(arr, low, high);
		                zl=pivotIndex;
		                repaint();
		                try {
							T1.sleep(delay+300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                
		                stack.push(low);
		                stack.push(pivotIndex - 1);

		                stack.push(pivotIndex + 1);
		                stack.push(high);
		            }
		        }
			 
		}
		else if(x==6) {
			int n = arr.length;

	        // Build a max-heap
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(arr, n, i);
	        }

	        // Extract elements one by one from the heap
	        for (int i = n - 1; i > 0; i--) {
	            // Move current root (maximum) to the end
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;

	            // Call max heapify on the reduced heap
	            heapify(arr, i, 0);
	            il=0;jl=i;
	            try {
					T1.sleep(delay+300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            repaint();
	        }
		}
		
	}
	
}
