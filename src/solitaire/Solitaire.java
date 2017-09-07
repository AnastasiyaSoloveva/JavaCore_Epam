package solitaire;


import java.applet.Applet;
import java.awt.*;


public class Solitaire extends Applet {
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static TablePile tableau[];
    static SuitPile suitPile[];
    static CardPile allPiles[];

    static boolean flag;

    @Override
    public void init() {
        this.setBackground(new Color(0,128,0));
        // first allocate the arrays
        allPiles = new CardPile[13];
        suitPile = new SuitPile[4];
        tableau = new TablePile[7];
        // then fill them in
        allPiles[0] = deckPile = new DeckPile(450, 5);
        allPiles[1] = discardPile = new DiscardPile(268, 5);
        for (int i = 0; i < 4; i++) {
            allPiles[2 + i] = suitPile[i] =
                    new SuitPile(15 + 60 * i, 5);
        }
        for (int i = 0; i < 7; i++) {
            allPiles[6 + i] = tableau[i] =
                    new TablePile(5 + 55 * i, 80, i + 1);
        }
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++) {
            allPiles[i].display(g);
        }
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        for (int i = 0; i < 13; i++) {
            if (allPiles[i].includes(x, y)) {
                if(!flag) {
                    allPiles[i].select(x, y);
                } else {
                    CardPile pileFrom = null;
                    for (int j = 0; j < 13; j++) {
                        if (allPiles[j].top() != null && allPiles[j].top().isMarked()) {
                            pileFrom = allPiles[j];
                        }
                    }

                    if (pileFrom != null && allPiles[i].canTake(pileFrom.top())) {
                        pileFrom.top().switchMarked();
                        allPiles[i].push(pileFrom.pop());
                    }
                    flag = !flag;
                }
                repaint();
                return true;
            }
        }
        return true;
    }




}
