package com.ramkissoon.brahm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExampleFrame extends JFrame {
	// Private Instance Variables
	private JPanel _contentPanel;
	private EmptyBorder _myEmptyBorder;
	private BorderLayout _myBorderLayout;
	private JLabel _firstNameLabel;
	

	// Constructor +++++++++++++++++++++++++++++++++++++++++
	public ExampleFrame() {
		_initialize();
	}
	
	// PRIVATE METHODS
	private void _initialize() {
		this._myEmptyBorder = new EmptyBorder(5, 5, 5, 5);
		this._myBorderLayout = new BorderLayout(0, 0);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this._contentPanel = new JPanel();
		this._contentPanel.setBorder(this._myEmptyBorder);
		this._contentPanel.setLayout(this._myBorderLayout);
		setContentPane(this._contentPanel);
		
		this._firstNameLabel = new JLabel("First Name");
		this._contentPanel.add(this._firstNameLabel, BorderLayout.NORTH);
	}
}
