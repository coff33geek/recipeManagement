package gui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class OverviewScreen extends JFrame {
    public OverviewScreen(){
        initOverviewUI();
    }
    public final void initOverviewUI(){
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu();

        menubar.add(file);
        setJMenuBar(menubar);

        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        ImageIcon exit = new ImageIcon("exit.png");
        JButton bexit = new JButton(exit);
        bexit.setBorder(new EmptyBorder(0,0,0,0));
        toolbar.add(bexit);

        add(toolbar, BorderLayout.NORTH);

        JToolBar vertical = new JToolBar(JToolBar.VERTICAL);
        vertical.setFloatable(false);
        vertical.setMargin(new Insets(10,5,5,5));

        ImageIcon select  = new ImageIcon("drive.png");
        ImageIcon freehand = new ImageIcon("computer.png");
        ImageIcon shaped = new ImageIcon("printer.png");

        JButton selectb = new JButton(select);
        selectb.setBorder(new EmptyBorder(3,0,3,0));

        JButton freehandb = new JButton(freehand);
        freehandb.setBorder(new EmptyBorder(3,0,3,0));

        JButton shapedb = new JButton(shaped);
        shapedb.setBorder(new EmptyBorder(3,0,3,0));

        vertical.add(selectb);
        vertical.add(freehandb);
        vertical.add(shapedb);

        add(vertical, BorderLayout.WEST);

        add(new JTextArea(), BorderLayout.CENTER);

        JLabel statusbar = new JLabel("Statusbar");

        statusbar.setPreferredSize(new Dimension(-1,22));
        statusbar.setBorder(LineBorder.createGrayLineBorder());

        setSize(640, 480);
        setTitle("Recipe Overview");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                OverviewScreen overview = new OverviewScreen();
                overview.setVisible(true);
            }
            });
        }
    }