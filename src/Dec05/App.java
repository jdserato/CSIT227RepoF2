package Dec05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class App extends JFrame {
    private JPanel pnlMain;
    private JTextField tfName;
    private JButton btnOk;
    private JRadioButton rbF1;
    private JRadioButton rbF2;
    private JRadioButton rbF3;
    private JTextArea taOutput;
    private JComboBox cbProgram;
    private JCheckBox cbSerato;
    private JCheckBox cbArellano;
    private JCheckBox cbAliac;

    private List<JRadioButton> bgSections;
    private List<JCheckBox> bgTeachers;
    public App() {
        bgSections = new ArrayList<>();
        bgSections.add(rbF1);
        bgSections.add(rbF2);
        bgSections.add(rbF3);
        bgTeachers = new ArrayList<>();
        bgTeachers.add(cbArellano);
        bgTeachers.add(cbSerato);
        bgTeachers.add(cbAliac);

        taOutput.setFont(new Font("Times New Roman", Font.BOLD, 30));
        taOutput.setEditable(false);
        taOutput.setLineWrap(true);
        taOutput.setForeground(Color.WHITE);
        taOutput.setBackground(Color.BLACK);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name_entered();
            }
        });

        tfName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    name_entered();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        App app = new App();
        app.setContentPane(app.pnlMain);
        app.setSize(700,700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton another = new JButton("Another");
        app.pnlMain.add(another);
        app.setVisible(true);
    }

    public void name_entered() {
        int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure of this?");
        if (result == JOptionPane.CANCEL_OPTION || result == JOptionPane.NO_OPTION) {
            return;
        } else {
            result = JOptionPane.showConfirmDialog(pnlMain, "SURE JUD KA?");
            if (result != JOptionPane.YES_OPTION) {
                return;
            }
        }
        boolean teacher_found = false;
        for (JCheckBox cb : bgTeachers) {
            if (cb.isSelected()) {
                teacher_found = true;
                break;
            }
        }
        if (!teacher_found) {
            JOptionPane.showMessageDialog(pnlMain, "You must select at least one teacher");
            return;
        }

        String name = tfName.getText();
        taOutput.setText(taOutput.getText() + "\n" + name);
//        tfName.setEditable(false);
        tfName.setForeground(Color.BLUE);
//        btnOk.setEnabled(false);
        tfName.setText("");
        for (JRadioButton rb : bgSections) {
            if (rb.isSelected()) {
                taOutput.setText(taOutput.getText() + " is in section " + rb.getText());
            }
            rb.setSelected(false);
        }
        taOutput.setText(taOutput.getText() + " studying " + cbProgram.getSelectedItem());
        taOutput.setText(taOutput.getText() + "\nList of Teachers:");
        for (JCheckBox cb : bgTeachers) {
            if (cb.isSelected()) {
                taOutput.setText(taOutput.getText() + cb.getText() + ", ");
            }
        }
    }

}
