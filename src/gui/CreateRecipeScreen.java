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

public class CreateRecipeScreen extends JFrame {
    public CreateRecipeScreen(){
        initRecipeScreen();
    }
    public final void initRecipeScreen(){
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu();
        JMenu edit = new JMenu();
        JMenu view = new JMenu();

        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);

        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        add(toolbar, BorderLayout.NORTH);


        JLabel statusbar = new JLabel(" Statusbar");
        statusbar.setPreferredSize(new Dimension(-1, 22));
        statusbar.setBorder(LineBorder.createGrayLineBorder());
        add(statusbar, BorderLayout.SOUTH);

        setSize(640, 480);
        setTitle("Create Recipe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                CreateRecipeScreen recipescreen = new CreateRecipeScreen();
                recipescreen.setVisible(true);
            }
        });
    }
}
