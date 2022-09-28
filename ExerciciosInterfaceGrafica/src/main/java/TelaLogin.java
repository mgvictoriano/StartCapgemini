import javax.swing.*;

public class TelaLogin extends JFrame{
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton entrarButton;
    private JTextField textField1;
    private JTextField esqueceuSuaSenhaCliqueTextField;

    public TelaLogin(String title) {
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }

    public static void main(String[] args) {

        JFrame frame = new TelaLogin("App Capgemini");
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
