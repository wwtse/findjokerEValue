
public class Process {
    public int[] cards;
    //private int[] dcards;
    public int[] cardsS;
    private int[] cardsB;

    /** TODO init the cards*/
    public Process(){
        cards = new int[54];
        for (int i = 0; i < 54; i++){
            cards[i] = (i + 4) / 4;
        }
        cardsS = new int[13];
        cardsB = new int[14];
    }

    public void cardRandom(){
        StdRandom.shuffle(cards);
    }

    /** deal single */
    public void dealer(int i){
        if (i == 4){
            System.arraycopy(cards,39,cardsB,0,14);
        }else{
            int tempI = 13 * i -13;
            System.arraycopy(cards,tempI,cardsS,0,13);
        }
    }

    /** TODO  delete the same number card
     * does it need create the */
    public int throwAndCountM(int n){
        int num;
        if (n == 4){
            dealer(n);
            num = 14;
            for (int i = 0; i < 14; i++) {
                for (int j = i + 1; j < 14; j++) {
                    if (cardsB[i] == cardsB[j]) {
                        cardsB[j] = cardsB[j] + 20 * j;
                        num -= 2;
                        break;
                    }
                }
            }

        } else{
            dealer(n);
            num = 13;
            for (int i = 0; i < 13; i++) {
                for (int j = i + 1; j < 13; j++) {
                    if (cardsS[i] == cardsS[j]) {
                        cardsS[j] = cardsS[j] + 20 * j;
                        num -= 2;
                        break;
                    }
                }
            }
        }
        return num;
    }

    /** TODO  return size */
    public double calcCardNum(){
        return 0.0;
    }
}
