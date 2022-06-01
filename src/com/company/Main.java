package com.company;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        JPanel panel = new JPanel();

        panel.setSize(new Dimension(161, 161));


        List<Tile> Tiles = new ArrayList<>();
        int marker = 0;
        for (int j = 0; j <= 120; j = j + 40) {
            for (int i = 0; i <= 120; i = i + 40) {

                Tiles.add(new Tile(i, j));
                Tiles.get(marker).setSize(new Dimension(161, 161));
                Tiles.get(marker).setOpaque(false);
                marker++;
            }
        }



    }
}
