/*
 * Created by JFormDesigner on Sun Jul 15 06:07:41 CDT 2012
 */

package com.twu28.biblioteca;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Ewonou Aziakonou
 */
public class View_Biblioteca extends JPanel {
    public View_Biblioteca() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ewonou Aziakonou
        Menu1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuBar2 = new JMenuBar();
        menu2 = new JMenu();
        menuItem2 = new JMenuItem();
        menuBar3 = new JMenuBar();
        menu3 = new JMenu();
        menuItem3 = new JMenuItem();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new FormLayout(
            "2*(default, $lcgap), default",
            "3*(default, $lgap), default"));

        //======== Menu1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Valid Option");
                menu1.setBackground(new Color(255, 153, 51));

                //---- menuItem1 ----
                menuItem1.setText("\"Valid Option\"");
                menu1.add(menuItem1);
            }
            Menu1.add(menu1);
        }
        add(Menu1, CC.xy(1, 1));

        //======== menuBar2 ========
        {

            //======== menu2 ========
            {
                menu2.setText("Invalid Option");
                menu2.setBackground(new Color(255, 102, 204));

                //---- menuItem2 ----
                menuItem2.setText("Select a valid option");
                menu2.add(menuItem2);
            }
            menuBar2.add(menu2);
        }
        add(menuBar2, CC.xy(3, 1));

        //======== menuBar3 ========
        {

            //======== menu3 ========
            {
                menu3.setText("Valid Option");
                menu3.setBackground(new Color(255, 102, 51));

                //---- menuItem3 ----
                menuItem3.setText("\"valid option\"");
                menu3.add(menuItem3);
            }
            menuBar3.add(menu3);
        }
        add(menuBar3, CC.xy(5, 1));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ewonou Aziakonou
    private JMenuBar Menu1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuBar menuBar2;
    private JMenu menu2;
    private JMenuItem menuItem2;
    private JMenuBar menuBar3;
    private JMenu menu3;
    private JMenuItem menuItem3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
