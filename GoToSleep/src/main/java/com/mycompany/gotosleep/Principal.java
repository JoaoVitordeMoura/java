package com.mycompany.gotosleep;

import javax.swing.*;


public class Principal extends Win{
    
    private JLabel labelId, labelNome, labelSexo , labelTelefone;
    private JTextField id, nome, telefone;
    private JRadioButton pessoa, empresa;
    private JComboBox sexo;
    private JCheckBox amigo, cliente;
    private JButton ok, cancelar;
    
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
        
        ok = new JButton("OK");
        cancelar = new JButton("CANCELAR");
        
        x = 100;
        y = gap = 10;
        
        
        addRow(labelId, id, pessoa, empresa);
        addRow(labelNome, nome);
        addRow(labelSexo, sexo, labelTelefone, telefone);
        addRow(amigo);
        addRow(cliente);
        addRow(ok, cancelar);
        
          
        setVisible(true);
        
        
    }
}


