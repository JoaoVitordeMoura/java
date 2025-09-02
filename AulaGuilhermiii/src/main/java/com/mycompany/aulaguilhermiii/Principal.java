package com.mycompany.aulaguilhermiii;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Principal extends Win{
    public Principal(){
        super("Principal", 500, 300, 400, 300, JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    protected void setupComponents(){
        setLayout(null);
        
        //Caixa de texto do id
        JTextField id = new JTextField(5);
        id.setSize(id.getPreferredSize());
        id.setLocation(40, 20);
        add(id);
        
        //Texto id
        JLabel textoId = new JLabel("ID");
        textoId.setSize(textoId.getPreferredSize());
        textoId.setLocation(20, 20);
        add(textoId);
        
        //Seleção unica
        JRadioButton katakuri = new JRadioButton("Katakuri V12");
        JRadioButton brulee = new JRadioButton("Brulee");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(katakuri);
        grupo.add(brulee);
        katakuri.setSize(katakuri.getPreferredSize());
        brulee.setSize(brulee.getPreferredSize());
        katakuri.setLocation(100, 20);
        brulee.setLocation(200,20);
        add(katakuri);
        add(brulee);
        
        //label do nome
        
        JLabel textoNome = new JLabel("Nome");
        textoNome.setSize(textoNome.getPreferredSize());
        textoNome.setLocation(20, 50);
        add(textoNome);
        
        //Campo de texto nome
        
        JTextField nome = new JTextField(20);
        nome.setSize(nome.getPreferredSize());
        nome.setLocation(100, 50);
        add(nome);
        
        //ComboBox
        
        JComboBox frisa = new JComboBox(
                new String[]{
                    "FREZZZAAAAA PORR QUEEE VOCEEE MATOU O KURIRIIINNNNNNNN",
                    "EU ESTOU NERVOSO",
                    "EU ESTOU NERVOSO",
                    "FREEEEZAAAAAAAAAAAAAAAA"
                        
                }
        );
        frisa.setMaximumRowCount(10);
        frisa.setSize(frisa.getPreferredSize());
        frisa.setLocation(20, 70);
        add(frisa);
        
        //Check box
        JCheckBox jauBom = new JCheckBox("Jau BOM");
        JCheckBox jauMal = new JCheckBox("Jau MAL");
        jauBom.setSize(jauBom.getPreferredSize());
        jauMal.setSize(jauMal.getPreferredSize());
        jauBom.setLocation(20, 100);
        jauMal.setLocation(20, 130);
        add(jauBom);
        add(jauMal);
        
        //Botão OK
        
        JButton ok = new JButton("OK");
        ok.setSize(ok.getPreferredSize());
        ok.setLocation(210, 170);
        add(ok);
        
        //Botão cancelar
        
        JButton cancel = new JButton("Cancelar");
        cancel.setSize(cancel.getPreferredSize());
        cancel.setLocation(270, 170);
        add(cancel);
        
        setVisible(true);
        
        
    }
}

