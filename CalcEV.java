public class CalcEV {

    public static void main(String[] args){
        int numEVB = 0;
        int numEVS = 0;
        Process testR = new Process();

        for (int i = 0 ; i < 10000; i++){
            testR.cardRandom();
            numEVB = numEVB + testR.throwAndCountM(4);
            numEVS = numEVS + testR.throwAndCountM(1);
        }
        System.out.println("14 is " + numEVB);
        System.out.println("13 is " + numEVS);

    }
}
