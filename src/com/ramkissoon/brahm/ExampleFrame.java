package com.ramkissoon.brahm;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class ExampleFrame extends JFrame {
	// Private Instance Variables
	
	
	private JLabel _firstNameLabel;
	private Icon _sun;
	

	// Constructor +++++++++++++++++++++++++++++++++++++++++
	public ExampleFrame() {
		super("Example Frame");
		_initialize();
	}
	
	// PRIVATE METHODS
	private void _initialize() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FlowLayout());
		
		this._sun = new ImageIcon(getClass().getResource("/Assets/sun.jpg"));
		
		this._firstNameLabel = new JLabel("First Name: ", SwingConstants.CENTER);
		this._firstNameLabel.setIcon(this._sun);
		getContentPane().add(this._firstNameLabel);
	}
}
