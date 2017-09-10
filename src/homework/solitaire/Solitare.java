package homework.solitaire;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Solitare extends Applet {
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static TablePile tableau[];
    static SuitPile suitPile[];
    static CardPile allPiles[];


    private int markedPile = 0;
    private int selectedPile = 0;

    private boolean mousePressed = false;
    private int xCoord = 0;
    private int yCoord = 0;


    @Override
    public void init() {
        this.setBackground(new Color(0,128,0));
        // first allocate the arrays
        allPiles = new CardPile[13];
        suitPile = new SuitPile[4];
        tableau = new TablePile[7];
        // then fill them in
        allPiles[0] = deckPile = new DeckPile(350, 5);
        allPiles[1] = discardPile = new DiscardPile(268, 5);
        for (int i = 0; i < 4; i++) {
            allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
        }
        for (int i = 0; i < 7; i++) {
            allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
        }


        addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
                allPiles[markedPile].takeOffMark();
                for (int i = 0; i < 13 ; i++) {
                    if(allPiles[i].includes(e.getX(),e.getY()) && i != selectedPile){
                        allPiles[i].setMark();
                        markedPile = i;
                        repaint();
                    }
                }
            }
        });


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                mousePressed = true;
                xCoord = e.getX();
                yCoord = e.getY();

                for (int i = 0; i < 13 ; i++) {
                    if(allPiles[i].includes(xCoord,yCoord)){
                        allPiles[i].setMark();
                        markedPile = i;
                        selectedPile = i;
                        repaint();
                    }

                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(markedPile != 0){
                    allPiles[selectedPile].select(e.getX(),e.getY(),markedPile);
                    repaint();
                } else{
                    allPiles[markedPile].select(e.getX(),e.getY(),-1);
                }
                mousePressed = false;
                allPiles[markedPile].takeOffMark();

                for (int i = 6 ; i < 13 ; i++) {
                    if(!allPiles[i].top().isFaceUp()){
                        allPiles[i].top().flip();
                    }

                }
                repaint();

            }
        });


    }


    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++) {
            allPiles[i].display(g);
        }
    }



}
