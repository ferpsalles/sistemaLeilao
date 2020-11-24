package com.company.classe;

import com.company.classe.Lance;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Leilao {
    private Date data;
    private String site;
    private String endereco;
    private String cidade;
    private String estado;
    private Lance lanceVencedor;
    private final double valorMinimo; //valor inical do leilao
    private boolean leilaoAberto;
    private List<Lance> lancesRecebidos;
    private String nome; //nome do bem a ser leiloado
    
     // contrutor    
    public Leilao (String n, double v) {
    	nome= n;
    	valorMinimo=v;
    	leilaoAberto=true;
    	lanceVencedor= new Lance ("inical",valorMinimo);
    	lancesRecebidos = new ArrayList <Lance>();
    }
    
    public void registrarLance (String nomePessoa, double valor) {
    	Lance lance = new Lance(nomePessoa, valor);
    	lancesRecebidos.add(lance);
    	if (leilaoAberto) {
    		if(valor >lanceVencedor.getValor()) {
    		lanceVencedor= lance;
    		}
    		
    	}
    	
    }
    
    public void finalizar (JFrame frame) {
    	leilaoAberto= false;
    	StringBuffer listaDeLances = new StringBuffer();
    	for (Lance lance : lancesRecebidos) {
    		listaDeLances.append ("\n_____\nNome do Arrematante" + lance.getNome() + "\nValor do arremate: " + lance.getValor());
    	}
    	
    	JTextArea textArea = new JTextArea ("Bem leiloado: " + nome + listaDeLances + "\n\n\nLanceVencedor" + "\nNome do Arrematente" + lanceVencedor.getNome()+ "\nValor do arremate:" + lanceVencedor.getValor());
    	JScrollPane scrollPane = new JScrollPane();
    	textArea.setLineWrap (true);
    	scrollPane.setPreferredSize (new Dimension (500,500));
    	JOptionPane.showMessageDialog (frame, scrollPane);
    	    	
       }
    
    public void setLeilaoAberto (boolean LeilaoAberto) {
    	this.leilaoAberto= leilaoAberto;
    }

	public Lance getLanceVencedor() {
		return lanceVencedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isLeilaoAberto() {
		return leilaoAberto;
	}

	public void setLanceVencedor(Lance lanceVencedor) {
		this.lanceVencedor = lanceVencedor;
	}
	
	
	
}
	

