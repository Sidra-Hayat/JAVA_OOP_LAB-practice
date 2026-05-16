package lab2_3;

public class marks {

       private int sidra;
    private   int eiza;
    private int laiba;
        public marks(){
            sidra=50;
            laiba =50;
            eiza=50;
        }
        public marks(int a,int b,int c){
            sidra=a;
            eiza=b;
            laiba=c;

        }
        public int calculateSum(){
            return (sidra+eiza+laiba);

        }

    public int getLaiba() {
        return laiba;
    }

    public void setLaiba(int laiba) {
        this.laiba = laiba;
    }

    public int getSidra() {
        return sidra;
    }

    public void setSidra(int sidra) {
        this.sidra = sidra;
    }

    public int getEiza() {
        return eiza;
    }

    public void setEiza(int eiza) {
        this.eiza = eiza;
    }
}


