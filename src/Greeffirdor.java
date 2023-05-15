import java.util.Objects;

public class Greeffirdor extends Hogwarts {

    private int nobility;                                //благородство
    private int honour;                                  // честь
    private int bravery;                                //храбрость

    public Greeffirdor(String name, int thePowerOfFalconry, int transgress, int nobility, int honour, int bravery) {
        super(name, thePowerOfFalconry, transgress);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public int calculationParameter() {
        return this.nobility + this.honour + this.bravery;
    }

    @Override
    public void printCompareOfParameterSpecific(String name1, String name2) {
        System.out.println(name1 + " Лучший Гриффиндорец чем " + name2);

    }

    //   public static void compareParameters(Greeffirdor[] faculty , String name1, String name2) {
//
//            int total1 = 0;
//            int total2 = 0;
//            for (int i = 0; i < faculty.length; i++) {
//                Greeffirdor faculty1 = faculty[i];
//                int total = faculty1.getNobility()+ faculty1.getHonour() + faculty1.getBravery() ;
//                if (faculty1.getName().equals(name1)) {
//                    total1 = total;
//                    System.out.println(faculty1.getName() + total1);
//                } else if (faculty1.getName().equals(name2)) {
//                    total2 = total;
//                    System.out.println(faculty1.getName() + total);
//                }
//            }
//            if (total1 > total2) {
//                System.out.println(name1 + " лучший Гриффирдорец , чем " + name2 + ".");
//            } else if (total2 > total1) {
//                System.out.println(name2 + " лучший Гриффирдорец , чем " + name1 + ".");
//            }
//        }



             @Override
            public String toString () {
                return "Greeffirdor{" +
                        "nobility = " + nobility +
                        ", honour = " + honour +
                        ", bravery = " + bravery +
                        '}';
            }
        }
