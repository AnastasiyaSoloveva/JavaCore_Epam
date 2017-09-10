package homework.solitaire;

import java.awt.Graphics;
import java.util.ListIterator;

class TablePile extends CardPile {

    int pileHeigth;

    TablePile(int x, int y, int c) {
        // initialize the parent class
        super(x, y);
        // then initialize our pile of cards
        for (int i = 0; i < c; i++) {
            if (i == 0) {
                pileHeigth = 80 + Card.height;
            } else {
                pileHeigth += 25;
            }

            push(Solitare.deckPile.pop());
        }
        // flip topmost card face up
        top().flip();
    }

    @Override
    public boolean canTake(Card aCard) {
        if (isEmpty()) {
            return aCard.getRank() == 12;
        }
        Card topCard = top();
        return (aCard.getColor() != topCard.getColor())
                && (aCard.getRank() == topCard.getRank() - 1);
    }

    @Override
    public boolean includes(int tx, int ty) {
        if (size() > 0) {
            return x <= tx && tx <= x + Card.width && y <= ty && ty <= pileHeigth;
        } else {
            return x <= tx && tx <= x + Card.width && y <= ty;
        }
    }


    @Override
    public void select(int tx, int ty, int index) {
        if (isEmpty())
            return;

        // if face down, then flip
        Card topCard = top();
        if (!topCard.isFaceUp()) {
            topCard.flip();
            return;
        }

        // see if any suit pile can take card
        if (index != -1) {
            for (int i = 0; i < 4; i++) {
                if (Solitare.suitPile[i].canTake(topCard)) {
                    Solitare.suitPile[i].push(pop());
                    return;
                }
            }
      }
 else {
            if (index > 4 && Solitare.allPiles[index].canTake(topCard)) {
                Solitare.allPiles[index].push(pop());
                return;
            }
        }



        CardPile tempPile = new CardPile(0, 0);

        // get the cards  from the table pile
        while (!isEmpty()) {
            // stop if we reached a card that is face down
            if (!top().isFaceUp())
                break;
            tempPile.push(pop());
        }


        // if we have to play only one card
        if (tempPile.top() == topCard) {
            // put it back into the table pile
            push(tempPile.pop());

            // we have already tried the suit piles
            // see if any other table pile can take card
            if(index == -1) {
                for (int i = 0; i < 7; i++) {
                    if (Solitare.tableau[i].canTake(topCard)) {
                        Solitare.tableau[i].push(pop());
                        return;
                    }
                }
            } else {
                if(index > 4 + 2) { // table pile
                    if (Solitare.allPiles[index].canTake(topCard)) {
                        Solitare.allPiles[index].push(pop());
                        return;
                    }
                }
            }
        } else { // we got ourselves a build to play
            topCard = tempPile.top();

            // see if any other table pile can take this build
            if(index == -1) {
                for (int i = 0; i < 7; i++) {
                    if (Solitare.tableau[i].canTake(topCard)) {
                        while (!tempPile.isEmpty())
                            Solitare.tableau[i].push(tempPile.pop());
                        return;
                    }
                }
            } else {
                if (Solitare.tableau[index - 7 + 1].canTake(topCard)) {
                    while (!tempPile.isEmpty())
                        Solitare.tableau[index - 7 + 1].push(tempPile.pop());

                    return;
                }
            }

            // can't play the build?
            // then we must restore our pile
            while (!tempPile.isEmpty())
                push(tempPile.pop());


        }



    }


    @Override
    public void display(Graphics g) {
        int localy = y;
        ListIterator<Card> iter = cardPile.listIterator(0);
        if (!isEmpty()) {
            while (iter.hasNext()) {
                iter.next().draw(g, x, localy,isMarked());
                localy += 25;
            }


        }
    }
}
