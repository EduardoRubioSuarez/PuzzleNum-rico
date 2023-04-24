import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PuzzleNumerico extends JFrame{

	public PuzzleNumerico() {
		
		this.setVisible(true);
		this.setSize(515,635);
		this.setTitle("Ventana Perrona");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//PANEL DE FONDO
		JPanel panelsito = new JPanel();
		panelsito.setBounds(0,0,500,600);
		panelsito.setOpaque(true);
		panelsito.setLayout(new BorderLayout());
		panelsito.setBackground(Color.decode("#D0B83A"));
		this.add(panelsito);
		
		//PANEL ARRIBA
		JPanel panelAr = new JPanel();
		panelAr.setVisible(true);
		panelAr.setOpaque(true);
		panelAr.setLayout(new BorderLayout());
		panelsito.add(panelAr,BorderLayout.NORTH);
		
		JLabel eb1 = new JLabel(" ");
		eb1.setOpaque(true);
		eb1.setVisible(true);
		eb1.setBackground(Color.decode("#D0B83A"));
		panelAr.add(eb1,BorderLayout.CENTER);
		
		//PANEL ABAJO
		JPanel panelAb = new JPanel();
		panelAb.setVisible(true);
		panelAb.setOpaque(true);
		panelAb.setLayout(new GridLayout());
		panelsito.add(panelAb,BorderLayout.SOUTH);
		
		JLabel eb2a = new JLabel(" ");
		eb2a.setOpaque(true);
		eb2a.setVisible(true);
		eb2a.setBackground(Color.decode("#D0B83A"));
		panelAb.add(eb2a/*,BorderLayout.CENTER*/);
		
		//PANEL IZQUIERDA
		JPanel panelI = new JPanel();
		panelI.setVisible(true);
		panelI.setOpaque(true);
		panelI.setLayout(new BorderLayout());
		panelsito.add(panelI,BorderLayout.EAST);
		
		JLabel eb3 = new JLabel("     ");
		eb3.setOpaque(true);
		eb3.setVisible(true);
		eb3.setBackground(Color.decode("#D0B83A"));
		panelI.add(eb3,BorderLayout.CENTER);

		//PANEL DERECHA
		JPanel panelD = new JPanel();
		panelD.setVisible(true);
		panelD.setOpaque(true);
		panelD.setLayout(new BorderLayout());
		panelsito.add(panelD,BorderLayout.WEST);
		
		JLabel eb4 = new JLabel("     ");
		eb4.setOpaque(true);
		eb4.setVisible(true);
		eb4.setBackground(Color.decode("#D0B83A"));
		panelD.add(eb4,BorderLayout.CENTER);
		
		//PANEL CENTRAL
		JPanel panelsitoCentral = new JPanel();
		panelsitoCentral.setBounds(0,0,500,600);
		panelsitoCentral.setOpaque(true);
		panelsitoCentral.setLayout(new GridLayout(4,4));
		panelsito.add(panelsitoCentral,BorderLayout.CENTER);
		
		
		//////////////SE CREA Y SE AÑADE EL ARREGLO DE BOTONES////////////////
		JButton []arrBtn = new JButton[16];
		cerarBtns(arrBtn,panelsitoCentral);
		
		JButton reinicio = new JButton("Reiniciar");
		reinicio.setVisible(true);
		reinicio.setOpaque(true);
		reinicio.setBackground(Color.decode("#FFFFFF"));
		
		JButton ganar = new JButton("Ganar :)");
		ganar.setVisible(true);
		ganar.setOpaque(true);
		ganar.setBackground(Color.decode("#FFFFFF"));
		
		panelAb.add(reinicio);
		panelAb.add(ganar);
		
		reinicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelsitoCentral.removeAll();
				repaint();
				revalidate();
				cerarBtns(arrBtn,panelsitoCentral);
			}
			
		});
		
		ganar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelsitoCentral.removeAll();
				for(int x=0;x<15;x++) {
					if(x<15) {
						arrBtn[x]= new JButton();
						arrBtn[x].setVisible(true);
						arrBtn[x].setOpaque(true);
						arrBtn[x].setBackground(Color.decode("#F3DB5B"));
						arrBtn[x].setForeground(Color.black);
						arrBtn[x].setFont(new Font("", Font.BOLD,24));
						panelsitoCentral.add(arrBtn[x]);
						
					}else {
						arrBtn[x]= new JButton("");
						arrBtn[x].setVisible(true);
						arrBtn[x].setOpaque(true);
						arrBtn[x].setBackground(Color.white);
						arrBtn[x].setEnabled(false);
						panelsitoCentral.add(arrBtn[x]);
					}
					List<String> numeros = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15");
					arrBtn[x].setText(numeros.get(x));
				}
				repaint();
				revalidate();
				validarVictoria(arrBtn);
			}
			
		});
		
		repaint();
		revalidate();
	}
	
	public void cerarBtns(JButton[] arrBtn, JPanel panelsitoCentral) {
		List<String> numeros = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15");
		
		for(int i=0;i<=15;i++) {
			if(i<15) {
				arrBtn[i]= new JButton();
				arrBtn[i].setVisible(true);
				arrBtn[i].setOpaque(true);
				arrBtn[i].setBackground(Color.decode("#F3DB5B"));
				arrBtn[i].setForeground(Color.black);
				arrBtn[i].setFont(new Font("", Font.BOLD,24));
				panelsitoCentral.add(arrBtn[i]);
				
			}else {
				arrBtn[i]= new JButton("");
				arrBtn[i].setVisible(true);
				arrBtn[i].setOpaque(true);
				arrBtn[i].setBackground(Color.white);
				arrBtn[i].setEnabled(false);
				panelsitoCentral.add(arrBtn[i]);
			}
			int y=i;
			if(i== 1 || i==2){
				arrBtn[i].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y+1] != null && arrBtn[y+1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+1].setText(texto);
							arrBtn[y+1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+1].setForeground(Color.black);
							arrBtn[y+1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-1] != null && arrBtn[y-1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-1].setText(texto);
							arrBtn[y-1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-1].setForeground(Color.black);
							arrBtn[y-1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y+4] != null && arrBtn[y+4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+4].setText(texto);
							arrBtn[y+4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+4].setForeground(Color.black);
							arrBtn[y+4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}
					}
					
				});
			}
			
			if(i== 13 || i==14){
				arrBtn[i].addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y+1] != null && arrBtn[y+1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+1].setText(texto);
							arrBtn[y+1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+1].setForeground(Color.black);
							arrBtn[y+1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-1] != null && arrBtn[y-1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-1].setText(texto);
							arrBtn[y-1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-1].setForeground(Color.black);
							arrBtn[y-1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-4] != null && arrBtn[y-4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-4].setText(texto);
							arrBtn[y-4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-4].setForeground(Color.black);
							arrBtn[y-4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
						}
					}
					
				});
			}
			
			if(i== 4 || i==8){
				arrBtn[i].addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y+1] != null && arrBtn[y+1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+1].setText(texto);
							arrBtn[y+1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+1].setForeground(Color.black);
							arrBtn[y+1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y+4] != null && arrBtn[y+4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+4].setText(texto);
							arrBtn[y+4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+4].setForeground(Color.black);
							arrBtn[y+4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-4] != null && arrBtn[y-4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-4].setText(texto);
							arrBtn[y-4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-4].setForeground(Color.black);
							arrBtn[y-4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
						}
					}
					
				});
			}
			
			if(i== 7 || i==11){
				arrBtn[i].addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y-1] != null && arrBtn[y-1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-1].setText(texto);
							arrBtn[y-1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-1].setForeground(Color.black);
							arrBtn[y-1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y+4] != null && arrBtn[y+4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+4].setText(texto);
							arrBtn[y+4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+4].setForeground(Color.black);
							arrBtn[y+4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-4] != null && arrBtn[y-4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-4].setText(texto);
							arrBtn[y-4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-4].setForeground(Color.black);
							arrBtn[y-4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
						}
					}
					
				});
			}
			
			if(i== 5 || i==6 || i== 9 || i==10){
				arrBtn[i].addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y+1] != null && arrBtn[y+1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+1].setText(texto);
							arrBtn[y+1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+1].setForeground(Color.black);
							arrBtn[y+1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-1] != null && arrBtn[y-1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-1].setText(texto);
							arrBtn[y-1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-1].setForeground(Color.black);
							arrBtn[y-1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y+4] != null && arrBtn[y+4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+4].setText(texto);
							arrBtn[y+4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+4].setForeground(Color.black);
							arrBtn[y+4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-4] != null && arrBtn[y-4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-4].setText(texto);
							arrBtn[y-4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-4].setForeground(Color.black);
							arrBtn[y-4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
						}
					}
					
				});
			}
			
			if(i== 0){
				arrBtn[i].addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y+1] != null && arrBtn[y+1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+1].setText(texto);
							arrBtn[y+1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+1].setForeground(Color.black);
							arrBtn[y+1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y+4] != null && arrBtn[y+4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+4].setText(texto);
							arrBtn[y+4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+4].setForeground(Color.black);
							arrBtn[y+4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
						}
					}
				});
			}
			
			if(i== 3){
				arrBtn[i].addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y-1] != null && arrBtn[y-1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-1].setText(texto);
							arrBtn[y-1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-1].setForeground(Color.black);
							arrBtn[y-1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y+4] != null && arrBtn[y+4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+4].setText(texto);
							arrBtn[y+4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+4].setForeground(Color.black);
							arrBtn[y+4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}
					}
					
				});
			}
			
			if(i== 12){
				arrBtn[i].addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y+1] != null && arrBtn[y+1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y+1].setText(texto);
							arrBtn[y+1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y+1].setForeground(Color.black);
							arrBtn[y+1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y+1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-4] != null && arrBtn[y-4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-4].setText(texto);
							arrBtn[y-4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-4].setForeground(Color.black);
							arrBtn[y-4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
						}
					}
					
				});
			}
			
			if(i== 15){
				arrBtn[i].addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(arrBtn[y-1] != null && arrBtn[y-1].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-1].setText(texto);
							arrBtn[y-1].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-1].setForeground(Color.black);
							arrBtn[y-1].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-1].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
							
						}else if(arrBtn[y-4] != null && arrBtn[y-4].getText().equals("")) {
							String texto = arrBtn[y].getText();
							arrBtn[y-4].setText(texto);
							arrBtn[y-4].setBackground(Color.decode("#F3DB5B"));
							arrBtn[y-4].setForeground(Color.black);
							arrBtn[y-4].setFont(new Font("", Font.BOLD,24));
							arrBtn[y-4].setEnabled(true);
							
							arrBtn[y].setText("");
							arrBtn[y].setBackground(Color.white);
							arrBtn[y].setEnabled(false);
							validarVictoria(arrBtn);
						}
					}
					
				});
			}
			
		}
		
		/////////////////ASIGNAR VALORES RANDOM A LOS BOTONES//////////////////////////
		Collections.shuffle(numeros);
		for(int x=0;x<15;x++) {
			arrBtn[x].setText(numeros.get(x));
		}
	}
	
	public void validarVictoria(JButton[] botones) {
		int condicional=0;
		String [] numeros = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
		for(int i=0; i<numeros.length;i++) {
			if(botones[i].getText().equals(numeros[i])) {
				condicional++;
			}
			if(condicional==15)
				JOptionPane.showMessageDialog(null, "Puzzle resuelto, Ganaste :)");
		}
	}
}
