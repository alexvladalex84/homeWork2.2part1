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




             @Override
            public String toString () {
                return "Greeffirdor{" +
                        "nobility = " + nobility +
                        ", honour = " + honour +
                        ", bravery = " + bravery +
                        '}';
            }
        }
