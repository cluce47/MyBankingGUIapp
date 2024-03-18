import javax.swing.*;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class BankSystem {
    private JLabel accountLbl;
    private JLabel idLbl;
    private JLabel nameLbl;
    private JLabel balanceLbl;
    private JLabel amountLbl;
    private JButton depositBttn;
    private JButton withdrawBttn;
    private JButton EXITButton;

    public BankSystem() {
        nameLbl.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent containerEvent) {
                super.componentAdded(containerEvent);
            }
        });
    }
}
