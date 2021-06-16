import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	MyFrame(){
		
		this.setTitle("JFrame title goes here"); //sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
		this.setResizable(false);// prevents this from being resized
		this.setSize(420,420); //sets the x-dimension, and y-dimension of this
		this.setVisible(true);//makes this visible
		
		ImageIcon image = new ImageIcon("C:\\Users\\MR ODOI\\eclipse-workspace\\GUISwing\\img\\logo.png.png"); //create  an ImageIcon
		this.setIconImage(image.getImage()); //change icon of this
		this.getContentPane().setBackground(Color.orange);//change color of background 
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
