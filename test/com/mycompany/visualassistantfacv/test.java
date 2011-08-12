/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.visualassistantfacv;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JPanel {

  public static void main(String[] a) {
    JFrame f = new JFrame();
    f.setSize(400, 400);
    f.add(new test());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

  public void paint(Graphics g) {
    g.setColor (Color.yellow);
    g.drawLine(10, 30, 5, 60);
  }
}