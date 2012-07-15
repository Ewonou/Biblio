/*
 * Created by JFormDesigner on Sat Jul 14 21:50:13 CDT 2012
 */

package com.twu28.biblioteca;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

public class View extends JFrame {
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private String welcomeMsg = "Welcome to Biblioteca";
    public View() {
        initComponents();
    }

    public String getWelcomeMsg()
    {
        return welcomeMsg;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ewonou Aziakonou
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new FormLayout(
            "24*(default)",
            "17*(default)"));

        //======== scrollPane2 ========
        {

            //---- textArea2 ----
            textArea2.setBackground(Color.orange);
            textArea2.setText(welcomeMsg);
            textArea2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 22));
            scrollPane2.setViewportView(textArea2);
        }
        contentPane.add(scrollPane2, CC.xywh(4, 6, 11, 2));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1, CC.xy(24, 17));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


}
