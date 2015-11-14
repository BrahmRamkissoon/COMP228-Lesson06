package com.ramkissoon.brahm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;

public class MyDialog extends JDialog {

	private final JPanel _contentPanel = new JPanel();
	//	CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++++
	public MyDialog() {
		
		_initialize();
	}

	private void _initialize() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		this._contentPanel.setLayout(new FlowLayout());
		this._contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("My Dialog");		
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		
		getContentPane().add(this._contentPanel, BorderLayout.CENTER);
		{
			JLabel lblNewLabel = new JLabel("Error");
			lblNewLabel.setToolTipText("Error");
			_contentPanel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		
	}
}
