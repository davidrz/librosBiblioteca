package librosBiblioteca.vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *    interfaz para la adición de un libro.
 */
public class adicionarLibro extends JFrame implements ActionListener {

    private JTextField tisbn,ttitulo, tfechap, tnumeroE, tautor;
    private JLabel isbn, titulo, fechap, numeroE, autor;
    private JButton adicionarAntes, adicionarDespues;

    public adicionarLibro(){

        setTitle("adicionar libro a la biblioteca");
        setResizable(true);
        setSize(700,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        isbn = new JLabel("isbn");
        titulo = new JLabel("titulo");
        fechap = new JLabel("fecha publicacion");
        numeroE = new JLabel("numero ejemplares");
        autor = new JLabel("autor");

        isbn.setBounds(30,30,150,100);
        titulo.setBounds(30,40,150,100);
        fechap.setBounds(30,50,150,100);
        numeroE.setBounds(30,60,150,100);
        autor.setBounds(30,70,150,100);

        add(isbn);
        add(titulo);
        add(fechap);
        add(numeroE);
        add(autor);

        tisbn = new JTextField();
        ttitulo = new JTextField();
        tfechap = new JTextField();
        tnumeroE = new JTextField();
        tautor = new JTextField();

        tisbn.setBounds(70,30,150,100);
        titulo.setBounds(70,40,150,100);
        tfechap.setBounds(70,50,150,100);
        tnumeroE.setBounds(70,60,150,100);
        tautor.setBounds(70,60,150,100);

        add(tisbn);
        add(ttitulo);
        add(tfechap);
        add(tnumeroE);
        add(tautor);

       adicionarAntes = new JButton("adicionar antes");
       adicionarDespues = new JButton("adicionardespues");

       adicionarAntes.setBounds(50,80,60,70);
       adicionarDespues.setBounds(50,80,60,70);

       add(adicionarAntes);
       add(adicionarDespues);

       adicionarAntes.addActionListener(this);
        adicionarDespues.addActionListener(this);




    }


    //public static void main(String[] args) {

        //adicionarLibro al = new adicionarLibro();
        //al.setBounds(300,300,600,600);
        //al.setVisible(true);
    //}

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
