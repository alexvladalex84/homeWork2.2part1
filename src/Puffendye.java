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

    public static void compareParameters(Puffendye[] faculty , String name1, String name2) {

        int total1 = 0;
        int total2 = 0;
        for (int i = 0; i < faculty.length; i++) {
            Puffendye faculty1 = faculty[i];
            int total = faculty1.getHardWork()+ faculty1.getloyalty() + faculty1.getHonesty() ;
            if (faculty1.getName().equals(name1)) {
                total1 = total;
                System.out.println(faculty1.getName() + total1);
            } else if (faculty1.getName().equals(name2)) {
                total2 = total;
                System.out.println(faculty1.getName() + total);
            }
        }
        if (total1 > total2) {
            System.out.println(name1 + " лучший Пуффиндуец , чем " + name2 + ".");
        } else if (total2 > total1) {
            System.out.println(name2 + " лучший Пуффиндуец , чем " + name1 + ".");
        }
    }
}
