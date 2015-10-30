package com.ramkissoon.brahm;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// Stopped at Vid 23/28 Lesson06 part 2 @ 27 mins
// Driver Class
public class Program {
	
	public static void main(String[] args){
		// Setup Objects
		JFrame myFrame = new JFrame();
		JPanel myPanel = new JPanel();
		
		// Properties of Objects
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(300, 300, 650, 600);
		
		// Properties of the Panel
		myPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		myPanel.setLayout(new BorderLayout(0, 0));
		
		// Assign Panel as a child object of the Frame
		myFrame.setContentPane(myPanel);
		
		myFrame.setVisible(true);
	}	
}
