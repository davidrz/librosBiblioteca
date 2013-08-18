package librosBiblioteca.vista;


import librosBiblioteca.control.controlBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: David Restrepo
 * Date: 18/08/13
 * Time: 04:54 PM
 * To change this template use File | Settings | File Templates.
 */

public class interfazBiblioteca extends JFrame implements ActionListener {

        private JScrollPane panel;
        private JButton boton1,boton2,boton3,boton4;
        private JList lista;


            public interfazBiblioteca(){
            super("Biblioteca electronica");  //titulo de la ventana
            this.setSize(400,400);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new GridBagLayout());
            GridBagConstraints grid = new GridBagConstraints();  // se cera un objeto de tipo GridBadLayout

            lista = new JList();
            panel = new JScrollPane(lista);
            boton1 = new JButton("adiicionar libro");
            boton2 = new JButton("buscar libro");
            boton3 = new JButton("eliminar libro");
            boton4 = new JButton("salir");


            grid.gridx = 0;
            grid.gridy = 0;
            grid.gridwidth = 1;
            grid.gridheight = 5;
            grid.weightx = 1.0;
            grid.weighty = 1.0;
            grid.fill = GridBagConstraints.BOTH;
            add(panel,grid);

            grid.gridx = 2;
            grid.gridy = 1;
            grid.gridwidth = 1;
            grid.gridheight = 1;
            grid.weightx = 0.0;
            grid.weighty = 0.0;
            grid.fill = GridBagConstraints.HORIZONTAL;
            add(boton1,grid);

            grid.gridx = 1;
            grid.gridy = 2;
            grid.gridwidth = 2;
            grid.gridheight = 1;
            grid.weightx = 1.0;
            grid.weighty = 1.0;
            grid.fill = GridBagConstraints.HORIZONTAL;
            add(boton2,grid);

            grid.gridx = 1;
            grid.gridy = 3;
            grid.gridwidth = 3;
            grid.gridheight = 1;
            grid.weightx = 1.0;
            grid.weighty = 1.0;
            grid.fill = GridBagConstraints.HORIZONTAL;
            add(boton3,grid);

            grid.gridx = 1;
            grid.gridy = 4;
            grid.gridwidth = 4;
            grid.gridheight = 1;
            grid.weightx = 1.0;
            grid.weighty = 1.0;
            grid.fill = GridBagConstraints.HORIZONTAL;
            add(boton4,grid);

            this.setVisible(true);




        }
    public void actionPerformed(ActionEvent e){

        if (e.getSource()==boton4){
            System.exit(0);
        }

        if(e.getSource()== boton1){

            adicionarLibro add = new adicionarLibro();
            add.setLayout(null);
            add.setVisible(true);
            add.setResizable(false);
            add.setBounds(0,0,500,500);
            add.setLocationRelativeTo(null);
            add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add.getContentPane().setBackground(new Color(130,255,123));

        }
    }





    public static void main( String[] args ) {
        interfazBiblioteca ib = new interfazBiblioteca();
        ib.setBounds(0,0,500,400);
        ib.setLocationRelativeTo(null);
        ib.setVisible(true);

        adicionarLibro ad = new adicionarLibro();
        ad.setVisible(false);
        ad.setBounds(200,200,300,400);



    }

}
