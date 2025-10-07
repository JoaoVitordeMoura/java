package com.mycompany.gotosleep;

import javax.swing.*;
import java.awt.event.*;


public class Principal extends Win{
    
    private JLabel labelId, labelNome, labelSexo , labelTelefone;
    private JTextField id, nome, telefone;
    private JRadioButton pessoa, empresa;
    private JComboBox sexo;
    private JCheckBox amigo, cliente;
    private JButton inserir, cancelar;
    
    public Principal(){
        super("Principal", 500, 300, 400, 300, JFrame.EXIT_ON_CLOSE);
        
    }
    
    @Override
    protected void setupComponents(){
        setLayout(null);
        
        
        
        labelId = new JLabel("Id");
        labelNome = new JLabel("Nome");
        labelSexo = new JLabel("Secso");
        labelTelefone = new JLabel("Telefone");
        
        id = new JTextField(5);
        nome = new JTextField(10);
        telefone = new JTextField(11);
        
        pessoa = new JRadioButton("Pessoa");
        empresa = new JRadioButton("Empresa");
        ButtonGroup grupoTipo = new ButtonGroup();
        grupoTipo.add(pessoa);
        grupoTipo.add(empresa);
        
        sexo = new JComboBox(
                new String[]{
                    "masculino", "feminino", "Vitor"
                }
        );
        
        amigo = new JCheckBox("Amigo");
        cliente = new JCheckBox("Cliente");
        
        inserir = new JButton("INSERIR");
        cancelar = new JButton("CANCELAR");
        
        x = 10;
        y = gap = 10;
        
        
        addRow(labelId, id, pessoa, empresa);
        addRow(labelNome, nome);
        addRow(labelSexo, sexo, labelTelefone, telefone);
        addRow(amigo);
        addRow(cliente);
        addRow(inserir, cancelar);
        
        //Criando o evento de clique omggggaaaaa
        InserirHandler insdl = new InserirHandler();
        inserir.addActionListener(insdl);
        
          
        setVisible(true);
        
        
    }
    //Classe do evento clique QUE HERDA DO ACTION LISTENER
    private class InserirHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String id = Principal.this.id.getText();
            String nome = Principal.this.nome.getText();
            String telefone = Principal.this.telefone.getText();
            String tipo;
            String sexo;
            String amizade = null;
                       
            if(Principal.this.pessoa.isSelected()){
                tipo = "Pessoa";
            }
            else{
                tipo = "Empresa";
            }
            
            if(Principal.this.sexo.getSelectedIndex() == 0){
                sexo = "Masculino";
            }
            else if (Principal.this.sexo.getSelectedIndex() == 1){
                sexo = "Femenino";               
            }
            else{
                sexo = "VITORRRRR";
            }
            
            if(Principal.this.amigo.isSelected() && Principal.this.cliente.isSelected()){
                amizade = "Amigo e Cliente";
            }
            else if (Principal.this.amigo.isSelected() && !Principal.this.cliente.isSelected()){
                amizade = "Amigo";
            }
            else if (!Principal.this.amigo.isSelected() && Principal.this.cliente.isSelected()){
                amizade = "Cliente";
            }
            
            JOptionPane.showMessageDialog(null, "Olá " + nome + 
                                          "\n ID: " + id +
                                          "\n Tipo: " + tipo + 
                                          "\n Sexo: " + sexo +
                                          "\n Telefone: " + telefone +
                                          "\n Relacionamento: " + amizade,
                                           nome,
                                          
                                          JOptionPane.INFORMATION_MESSAGE);
            
            
            
        }
        
        
        
    }
    
    
    
    
    
    
    
    
}


