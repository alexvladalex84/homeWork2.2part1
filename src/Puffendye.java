public class Puffendye extends Hogwarts {
   private int  hardWork;                                      //трудолюбие
    private int loyalty;                                         //верность
    private  int honesty;                                           //честность

    public Puffendye(String name, int thePowerOfFalconry, int transgress, int hardWork, int loyalty, int honesty) {
        super(name, thePowerOfFalconry, transgress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getloyalty() {
        return loyalty;
    }

    public void setloyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public int calculationParameter() {
        return this.hardWork + this.loyalty + this.honesty;
    }
    @Override
    public void printCompareOfParameterSpecific(String name1,String name2) {
        System.out.println(name1 + " Лучший Пуффендуец чем " + name2);

    }


}
