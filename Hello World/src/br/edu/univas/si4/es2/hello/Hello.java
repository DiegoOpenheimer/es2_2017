package br.edu.univas.si4.es2.hello;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





public class Hello {
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		JPanel painel = new JPanel();
		
		JButton button = new JButton();
		
		button.setText("Hello World");
		
		painel.setSize(150, 150);
		
		button.setSize(15, 15);
		
		frame.setSize(400, 400);
		painel.add(button);
		
		frame.add(painel);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		
		
	}

}
