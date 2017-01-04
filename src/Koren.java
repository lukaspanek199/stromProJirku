public class Koren {
    private int hodnota;
    private Koren pravy;
    private Koren levy;

    public Koren(int vstup) {
        this.hodnota = vstup;
    }

    public void insrtNmbr(int vstup) {
        if (vstup > this.hodnota) {
            insrtRght(vstup);
        } else if (vstup < this.hodnota) {
            insrtLft(vstup);
        } else {
            return;
        }
    }

    public void insrtRght(int vstup) {
        if (this.pravy != null) {
            this.pravy.insrtNmbr(vstup);
        } else {
            this.pravy = new Koren(vstup);
        }
    }

    public void insrtLft(int vstup) {
        if (this.levy != null) {
            this.levy.insrtNmbr(vstup);
        } else {
            this.levy = new Koren(vstup);
        }
    }

    public void print(){
        if(this.levy != null){
            this.levy.print();
        }
        System.out.println(this.hodnota+" ");
        if(this.pravy != null){
            this.pravy.print();
        }
    }
}
