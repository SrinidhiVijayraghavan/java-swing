import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
class img11 extends Thread
{
	
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++)
			{
			JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("download1.jpg");
			  JLabel label = new JLabel(icon);
			  frame.add(label);
			  
			  try
		        {
		            Thread.sleep(1000);
		        }
		        catch (Exception e)
		        {
		            System.out.println("Thread  interrupted.");
		        }
				
			  frame.pack();
			  frame.setSize(1000, 1000);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  frame.setVisible(true);	
			  
			 }
		}
		
	
}

public class flikkerbook
{
	public static void main(String args[])
	{
		img11 a = new img11();

	
		a.start();
		
	}

}