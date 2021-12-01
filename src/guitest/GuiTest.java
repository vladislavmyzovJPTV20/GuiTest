/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author pupil
 */
public class GuiTest extends JFrame{
    private JLabel jLabelTitle;
    private JPanel jPanelContent;
    private JTextField jTextField;
    private JButton jButtonSetTextToLabel;
    public GuiTest() {
        super.setPreferredSize(new Dimension(480, 290));
        super.setMaximumSize(new Dimension(480, 290));
        super.setMinimumSize(new Dimension(480, 290));
        //super.getContentPane().setLayout(new BorderLayout());
        
        jLabelTitle = new JLabel("Hello, JPTV20!",SwingConstants.CENTER);
        jLabelTitle.setFont(new java.awt.Font("Tahome", 0, 24));
        jLabelTitle.setPreferredSize(new Dimension(480,27));
        jLabelTitle.setMaximumSize(new Dimension(480,27));
        JPanel panelTitle = new JPanel();
        panelTitle.setPreferredSize(new Dimension(480,54));
        panelTitle.add(jLabelTitle);
        
        jPanelContent = new JPanel();
        jPanelContent.setLayout(new BoxLayout(jPanelContent, BoxLayout.Y_AXIS));
        jPanelContent.add(jLabelTitle);
        
        jTextField = new JTextField(SwingConstants.CENTER);
        jTextField.setPreferredSize(new Dimension(200,37));
        jTextField.setMaximumSize(jTextField.getPreferredSize());
        JPanel panelTextField = new JPanel();
        panelTextField.setPreferredSize(new Dimension(480,27));
        panelTextField.setMaximumSize(new Dimension(480,27));
        panelTextField.add(jTextField);
        jPanelContent.add(jTextField);
        
        jButtonSetTextToLabel = new JButton();
        jButtonSetTextToLabel.setText("Изменить текст в метке");
        jButtonSetTextToLabel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelTitle.setText(jTextField.getText());
            }
        });
        JPanel panelButton = new JPanel();
        panelButton.setPreferredSize(new Dimension(480,27));
        panelButton.add(jButtonSetTextToLabel);
        jPanelContent = new JPanel();
        jPanelContent.setLayout(new BoxLayout(jPanelContent,BoxLayout.Y_AXIS));
        jPanelContent.add(panelTitle);
        jPanelContent.add(panelTextField);
        jPanelContent.add(panelButton);
        this.add(jPanelContent);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello JPTV20");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTest().setVisible(true);
            }
        });
    }
    
}
