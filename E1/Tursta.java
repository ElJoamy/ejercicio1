public class Tursta implements IUser{
    private String name;
    private int money;
    private String ci;

    public Tursta(String name, int money, String ci) {
        this.name = name;
        this.money = money;
        this.ci = ci;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void pay(LaPaz laPaz) {
        System.out.println("La Paz");
        int random = (int) (Math.random() * (100));
        if (random <= money) {
            System.out.println("El turista gasto: " + random);
            money = money - random;
            laPaz.setmPT(laPaz.getmPT() + random);
            System.out.println("Saldo actual: " + money);
        } else {
            System.out.println("Elturista no tiene suficiente dinero");
        }
    }

    @Override
    public void pay(Cochabamba cochabamba) {
        System.out.println("Cochabamba");
        int porcentaje =(int)(cochabamba.getnH() * 0.1);
        if (porcentaje <= money) {
            System.out.println("El turista gasto: " + porcentaje);
            money = money - porcentaje;
            cochabamba.setmPT(cochabamba.getmPT() + porcentaje);
            System.out.println("Saldo actual: " + money);
        } else {
            System.out.println("El turista no tiene suficiente dinero");
        }
    }

    @Override
    public void pay( SantaCruz santaCruz) {
        System.out.println("Santa Cruz");
        int porcentaje =(int)(santaCruz.getnP() * 0.5);
        if (porcentaje <= money) {
            System.out.println("El turista gasto: " + porcentaje);
            money = money - porcentaje;
            santaCruz.setmPT(santaCruz.getmPT() + porcentaje);
            System.out.println("Saldo actual: " + money);
        } else {
            System.out.println("El turista no tiene suficiente dinero");
        }
    }  
}
