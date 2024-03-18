import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class StartPage {
    private JLabel lblPic;
    private JButton loginButton;
    private JButton exitButton;
    private JTextField clientIdText;
    private JTextField pinText;
    private JLabel clientIDLbl;
    private JLabel pinLbl;
    private JLabel messageLbl;

    public StartPage() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Client bob= new Client("Bob Smith","Savings1","123QWE",1234);
                Scanner in = new Scanner(System.in);

                String ident="";
                int code=0;
                int count=0;
                while (true) {
                    ident = clientIdText.getText();
                    code = Integer.parseInt(pinText.getText());
                    if ((!(bob.getId().equals(ident)) || bob.getPin() != code) && count < 3){
                        //System.out.println("That is the wrong PIN.");
                        clientIdText.setText("");
                        pinText.setText("");
                        messageLbl.setText("Client ID or PIN is incorrect");
                        count++;
                    } else {
                        break;
                    }
                }
                if (count>=3) {
                    messageLbl.setText("To many wrong pin numbers. Goodbye.");
                    System.exit(0);
                }


            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){

    }
}
