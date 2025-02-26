import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private JLabel lblMensagem;
    private JLabel lblMensagem2;

    public HelloWorld() {
        lblMensagem2 = new JLabel("O Miguel Pereira esteve aqui");
        panel1.add(lblMensagem2); // Adicionar lblMensagem2 ao panel1
        setContentPane(panel1);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
