package com.ramkissoon.brahm;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// Stopped at Vid 30/42 Lesson07
// Driver Class
public class Program {
	
	public static void main(String[] args){
		ExampleFrame myFrame = new ExampleFrame();
		myFrame.setVisible(true);
		
		Dimension dialogDimensions = new Dimension(300,300);
		
				
		
		myFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		myFrame.setSize(dialogDimensions);
		myFrame.setMinimumSize(new Dimension(300, 300));
		myFrame.setVisible(true);
		
	}	
}
