package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import logic.logic;

public class CustomPanel extends javax.swing.JPanel implements KeyListener,ActionListener,Runnable {
	
    private static final long serialVersionUID = 1L;
    
    int xdir[]={60, 78, 96, 114, 132, 150, 168, 186, 204, 222, 240, 258,
    			276, 294, 312, 330, 348, 366, 384, 402, 420, 438, 456, 474,
    			492, 510, 528, 546, 564, 582, 600, 618, 636, 654, 672, 690,
    			708, 726, 744, 762, 780, 798, 816, 834, 852, 870, 888, 906, 
    			924, 942, 960};

	public int arr[]= {26, 148, 109, 75, 41, 61, 12, 114, 33, 68, 29, 147, 134,
						52, 125, 72, 59, 128, 118, 10, 115, 113, 136, 148, 143,
						147, 40, 120, 22, 45, 58, 140, 119, 141, 46, 101, 73, 144,
						100, 84, 142, 39, 137, 104, 123, 51, 107, 118, 24, 103, 131};
	public int temp[]=arr;
	public int il=-1,jl=-1,zl=-1,zx=-1;
	public boolean logic=true;
	public int x=0;
	public int delay=400;
	public Thread T1=new Thread((Runnable) this);
	public int i=0;
	
	public CustomPanel(logic obj,int index,int i) {
		 this.i=i;
		 addKeyListener(this);
		 setFocusable(true);
		 setFocusTraversalKeysEnabled(false);
		 x=index;
		 T1.start();
		 
	}
	public void delayincrease() {
		delay+=100;
	}
	public void delaydecrease() {
		if(delay==0)delay=0;
		else if(delay<=50)delay-=10;
		else delay-=50;
	}
    @Override
    protected void paintComponent(Graphics g) {
    	
    	super.paintComponent(g);

		 g.setColor(Color.black);
		 g.fillRect(0,0, 1000, 450);
		
	     g.setColor(Color.YELLOW);
	     g.setFont(new Font("serif",Font.BOLD,18));
	     
	     for(int i=0;i<50;i++) {
	  	     g.fillRect(xdir[i],400-arr[i]*2 , 5, arr[i]*2);
		     
	     }

	     g.setFont(new Font("serif",Font.BOLD,26));
	     
	     if(x==1) {

		     g.setColor(Color.red);
		     g.drawString("Bubble Sort", 450,30);
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 5, arr[il]*2);
			     g.drawString("i", xdir[il]+4,450 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 5, arr[jl]*2);
			     g.drawString("j", xdir[jl]+4,480 );
			     	 
		     }
	     }
	     else if(x==2) {

		     g.setColor(Color.red);
		     g.drawString("Insertion Sort", 400,20);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 5, arr[il]*2);
			     g.drawString("Key", xdir[il]-13,450 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 5, arr[jl]*2);
			     g.drawString("j", xdir[jl],480 );
			     	 
		     }
	     } 
	     else if(x==3) {

		     g.setColor(Color.red);
		     g.drawString("Selection Sort", 450,30);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 5, arr[il]*2);
			     g.drawString("i", xdir[il],450 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 5, arr[jl]*2);
			     g.drawString("max", xdir[jl]-16,480 );
			     	 
		     }
	     }
	     else if(x==4) {

		     g.setColor(Color.red);
		     g.drawString("Merge Sort", 450,30);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 5, arr[il]*2);
			     g.drawString("left", xdir[il]-15,450 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 5, arr[jl]*2);
			     g.drawString("right", xdir[jl]-18,480 );
			     	 
		     }
	     }
	     else if(x==5) {

		     g.setColor(Color.red);
		     g.drawString("Quick Sort", 450,30);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 5, arr[il]*2);
			     g.drawString("left", xdir[il]-15,430 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 5, arr[jl]*2);
			     g.drawString("right", xdir[jl]-18,450 );
			     
			     g.setColor(Color.magenta);
		    	 g.fillRect(xdir[zl],400-arr[zl]*2 , 5, arr[zl]*2);
			     g.drawString("pivot", xdir[zl]-23,480 );
			     	 
		     }
	     }
	     else if(x==6) {

		     g.setColor(Color.red);
		     g.drawString("Heap Sort", 400,20);
		     
	    	 if(il!=-1&&jl!=-1) {
			     g.setColor(Color.red);
		    	 g.fillRect(xdir[il],400-arr[il]*2 , 5, arr[il]*2);
			     g.drawString("left", xdir[il]-15,480 );

			     g.setColor(Color.blue);
		    	 g.fillRect(xdir[jl],400-arr[jl]*2 , 5, arr[jl]*2);
			     g.drawString("right", xdir[jl]-20,480 );
			     	 
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

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

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
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
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
	}
	@SuppressWarnings("static-access")
	@Override
	public void run() {
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
						T1.sleep(delay);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(arr[i]>arr[j]) {
						try {
									T1.sleep(delay);
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
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] > arr[maxIndex]) {
	                    maxIndex = j;jl=j;
	                    repaint();
	                    try {
							T1.sleep(delay);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                }
	            }
	            
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
							T1.sleep(delay);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                repaint();
		                mergeDescending(arr, temp, leftStart, mid, rightEnd);
		                
		                try {
							T1.sleep(delay);
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
							T1.sleep(delay);
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

	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(arr, n, i);
	        }
	        for (int i = n - 1; i > 0; i--) {
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;

	            heapify(arr, i, 0);
	            il=0;jl=i;
	            try {
					T1.sleep(delay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            repaint();
	        }
		}
		
	}
	
}