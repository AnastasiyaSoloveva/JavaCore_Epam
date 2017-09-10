package homework.solitaire;

import java.awt.*;
import java.util.LinkedList;

// описывает абстрактную стопку
class CardPile {

    // coordinates of the card pile
    protected int x;
    protected int y;

    protected LinkedList<Card> cardPile;

    private boolean isMarked;



    CardPile(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
        cardPile = new LinkedList<>();
    }



    // access to cards are not overridden

    public Card top() {

            return cardPile.getLast();

    }

    public boolean isEmpty() {
        return cardPile.isEmpty();
    }


    public void push(Card aCard) {
        cardPile.addLast(aCard);
    }

    public Card pop() {
        return cardPile.removeLast();
    }


    public int size(){
        return cardPile.size();
    }


    public boolean isMarked() {
        return isMarked;
    }


    public void setMark() {
        isMarked = true;
    }

    public void takeOffMark() {
        isMarked = false;
    }


    // the following are sometimes overridden

    public boolean includes(int clickX, int clickY) {
        return x <= clickX && clickX <= x + Card.width &&
                y <= clickY && clickY <= y + Card.height;
    }




    public void select(int tx, int ty,int index) {
        // do nothing
    }


    public void display(Graphics g) {
        g.setColor(Color.black);
        if (cardPile.isEmpty()) {
            g.drawRect(x, y, Card.width, Card.height);
        } else {
            cardPile.getLast().draw(g, x, y, isMarked());
        }
    }

    public boolean canTake(Card aCard) {
        return false;
    } //  можно ли в стопку положить карту


}
