import java.awt.Graphics;

import javax.swing.JFrame;

public class mythreadmoving extends JFrame{
	static int x=20;
	int y=50;
	static int rad=50;
	static int x1=20;
	int y1=120;
	static int x2=20;
	int y2=180;
	
	public mythreadmoving()
	{
		setSize(500,500);
                setLayout(null);
		setVisible(true);
	}
	public void paint(Graphics G)
    {
        super.paint(G);
    	G.fillOval(x,y,rad,rad);
    	G.fillOval(x1,y1,rad,rad);
    	G.fillOval(x2,y2,rad,rad);
    }

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		mythreadmoving m1=new mythreadmoving ();
        Thread t1=new Thread(new Runnable()
        		{
        	      public void run()
        	      {
        	    	  while(x<m1.getWidth()-rad)
        	    	  {
        	    		  try
        	    		  {
        	    			  x=x+1;
        	    			  Thread.sleep(7);
        	    			  m1.repaint();
        	    			  
        	    		  }
        	    		  catch(InterruptedException e1)
        	    		  {
        	    			  
        	    		  }
        	    		 
        	    		  if(x==m1.getWidth()-rad)
        	    		  {
        	    			
       	    			
        	    			 while(x!=50)
        	    			 {
        	    				 try
        	    				 {
        	    				 x--;
        	    				 Thread.sleep(7);
        	    				 m1.repaint();
        	    				 }
        	    				 catch(InterruptedException e1)
               	    		    {
               	    			  
               	    		    }
        	    			 }
        	    			
        	    			 
        	    		  }
        	    	  }
        	      }
        		});
        t1.start();
        Thread t2=new Thread(new Runnable()
		{
          public void run()
	      {
	    	  while(x1<m1.getWidth()-rad)
	    	  {
	    		  try
	    		  {
	    			  x1=x1+1;
	    			  Thread.sleep(2);
	    			  m1.repaint();
	    			  
	    		  }
	    		  catch(InterruptedException e1)
	    		  {
	    			  
	    		  }
	    		  if(x1==m1.getWidth()-rad)
	    		  {
	    			  while(x!=m1.getWidth()-rad )
	    			  {
	    				  try
		    				 {
		    				 Thread.sleep(1);
		    				 }
		    				 catch(InterruptedException e1)
	     	    		     {
	     	    			  
	     	    		     }  
	    			  }
	    			  
	    			 while(x1!=50)
	    			 {
	    				 try
	    				 {
	    				 x1--;
	    				 Thread.sleep(2);
	    				 m1.repaint();
	    				 }
	    				 catch(InterruptedException e1)
     	    		  {
     	    			  
     	    		  }
	    			 } 
	    		  }
	    	  }
	      }
		});

        t2.start();
        Thread t3=new Thread(new Runnable()
		{
          public void run()
          {
	    	  while(x2<m1.getWidth()-rad)
	    	  {
	    		  try
	    		  {
	    			  x2=x2+1;
	    			  Thread.sleep(5);
	    			  m1.repaint();
	    			  
	    		  }
	    		  catch(InterruptedException e1)
	    		  {
	    			  
	    		  }
	    		  if(x2==m1.getWidth()-rad)
	    		  {
	    			  while(x!=m1.getWidth()-rad && x1==m1.getWidth()-rad)
	    			  {
	    				  try
		    				 {
		    				 Thread.sleep(1);
		    				 }
		    				 catch(InterruptedException e1)
	     	    		     {
	     	    			  
	     	    		     }  
	    			  }
	    			 while(x2!=50)
	    			 {
	    				 try
	    				 {
	    				 x2=x2-1;
	    				 Thread.sleep(5);
	    				 m1.repaint();
	    				 }
	    				 catch(InterruptedException e1)
     	    		     {
     	    			  
     	    		     }
	    				 
	    			 }
	    			
	    			 
	    		  }
	    	  }
	      }
		});
        t3.start();

	}

}
