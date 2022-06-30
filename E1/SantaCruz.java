public class SantaCruz implements IDpp{
    private String name;
    private int nP;
    private int nH;
    private String clima;
    private double mPT;

    public SantaCruz(String name, int nP, int nH, String clima, double mPT) {
        this.name = "SantaCruz";
        this.nP = 50;
        this.nH = nH;
        this.clima = "calor";
        this.mPT = mPT;
    }

    public int getnP() {
        return nP;
    }

    public void setnP(int nP) {
        this.nP = nP;
    }

    public int getnH() {
        return nH;
    }

    public void setnH(int nH) {
        this.nH = nH;
    }

    public double getmPT() {
        return mPT;
    }

    public void setmPT(double mPT) {
        this.mPT = mPT;
    }

    @Override
    public void accept(IUser visitor){
        showInfo();
        visitor.pay(this);
        System.out.println("Money por turismo: " + mPT);
        System.out.println();
    }

    public void showInfo(){
        System.out.println("<=== Santa Cruz ===>");
        System.out.println("Departamento: " + name);
        System.out.println("Numero de habitantes: " + nH);
        System.out.println("Numero de Provincias: " + nP);
        System.out.println("Clima: " + clima);
        System.out.println("<==================>");
        System.out.println();
    }
}
