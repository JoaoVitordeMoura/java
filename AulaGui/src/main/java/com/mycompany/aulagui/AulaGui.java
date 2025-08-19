package com.mycompany.aulagui;

import java.awt.Dimension;
import java.awt.Toolkit;

public class AulaGui {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screensize = toolkit.getScreenSize();
        int x = screensize.width;
        int y = screensize.height;
        System.out.println(x + ", " + y);
        
        Win principal = new Win((x - 400)/2, (y - 200)/2, 400, 200, "Principal", 3);
        Win pessoa = new Win(300, 400, 300, 200, "Pessoa", 1);
        Win produto = new Win(700, 520, 200, 200, "Produto", 1);
    }
}
