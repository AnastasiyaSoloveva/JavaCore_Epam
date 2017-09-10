package homework.solitaire;

class DiscardPile extends CardPile {

    DiscardPile(int x, int y) {
        super(x, y);
    }

    @Override
    public void push(Card aCard) {
        if (!aCard.isFaceUp()) {
            aCard.flip();
        }
        super.push(aCard);
    }

    @Override
    public void select(int tx, int ty,int index) {
        if (isEmpty())
            return;

        Card topCard = top();

        // check the SuitPile's first
        for (int i = 0; i < 4; i++) {
            if (Solitare.suitPile[i].canTake(topCard)) {
                Solitare.suitPile[i].push(pop());
                return;
            }
        }

        if (Solitare.allPiles[index].canTake(topCard)) {
            Solitare.allPiles[index].push(pop());
            return;
        }
    }
}
