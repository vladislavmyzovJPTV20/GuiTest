/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycomponents;

import com.sun.prism.j2d.J2DPipeline;
import com.sun.scenario.effect.impl.sw.java.JSWBoxBlurPeer;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author pupil
 */
public class EditFieldComponent extends JPanel{
    private JLabel jLabelTitle;
    private JTextField jTextFieldEdit;

    public EditFieldComponent(String text,int widthPanel,int heightPanel, int widthEdit) {
        initComponents(text,widthPanel,heightPanel,widthEdit);
    }

    private void initComponents(String text,int widthPanel,int heightPanel,int widthEdit) {
        this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        this.setPreferredSize(new Dimension(widthPanel,heightPanel));
        this.setMaximumSize(this.getPreferredSize());
        this.setMinimumSize(this.getPreferredSize());
        //this.setBorder(BorderFactory.createLineBorder(Color.black));
        jLabelTitle = new JLabel(text);
        jLabelTitle.setPreferredSize(new Dimension(widthPanel/3,27));
        jLabelTitle.setMinimumSize(jLabelTitle.getPreferredSize());
        jLabelTitle.setMaximumSize(jLabelTitle.getPreferredSize());
        jLabelTitle.setHorizontalAlignment(JLabel.RIGHT);
        jTextFieldEdit = new JTextField();
        if(widthEdit == 0) {
            jTextFieldEdit.setPreferredSize(new Dimension(((widthPanel-widthPanel/3)-40),27));
        }else{
            jTextFieldEdit.setPreferredSize(new Dimension(widthEdit,27));
        }
        jTextFieldEdit.setMaximumSize(jTextFieldEdit.getPreferredSize());
        jTextFieldEdit.setMinimumSize(jTextFieldEdit.getPreferredSize());
        this.add(jLabelTitle);
        this.add(jTextFieldEdit);
    }

    public JLabel getjLabelTitle() {
        return jLabelTitle;
    }

    public JTextField getjTextFieldEdit() {
        return jTextFieldEdit;
    }
    
    
}
