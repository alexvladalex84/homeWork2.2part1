import java.util.Objects;

public abstract class Hogwarts {
    private String name ;
    private  int thePowerOfFalconry;
    private int transgress;

    public Hogwarts (String name, int thePowerOfFalconry, int transgress) {
        this.name = name;
        this.thePowerOfFalconry = thePowerOfFalconry;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThePowerOfFalconry() {
        return thePowerOfFalconry;
    }

    public void setThePowerOfFalconry(int thePowerOfFalconry) {
        this.thePowerOfFalconry = thePowerOfFalconry;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int calculationParameterGeneral() {
        return this.thePowerOfFalconry + this.getTransgress();
    }

   public abstract int calculationParameter();


    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareParametersSpecific(hogwarts);
        } else {
            compareGeneralParameters(hogwarts);
        }
    }

    public void compareStudentOfFaculty(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareGeneralParameters(hogwarts);
        }
    }

    private void compareGeneralParameters(Hogwarts hogwarts) {
        int thisScore = calculationParameterGeneral();
        int otherScore = hogwarts.calculationParameterGeneral();
        if (thisScore > otherScore) {
            System.out.println(this.name + thisScore + "," + hogwarts.getName() + otherScore);
            System.out.println(this.name + " сильнее " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(this.name + thisScore + "," + hogwarts.getName() + otherScore);
            System.out.println(hogwarts.getName() + " сильнее чем " + this.name);
        } else {
            System.out.println(this.name + thisScore + "," + hogwarts.getName() + otherScore);
            System.out.println("Силы равны");
        }


    }

    public abstract void printCompareOfParameterSpecific(String name1,String name2);

    private void compareParametersSpecific(Hogwarts hogwarts) {
        int thisScore = calculationParameter();
        int otherScore = hogwarts.calculationParameter();
        if (thisScore > otherScore) {
            System.out.println(this.name + thisScore + "," + hogwarts.getName() + otherScore);
//            System.out.println(this.name + " сильнее " + hogwarts.getName());
            printCompareOfParameterSpecific(this.name,hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(this.name + thisScore + "," + hogwarts.getName() + otherScore);
//            System.out.println(hogwarts.getName() + " сильнее " + this.name);
            printCompareOfParameterSpecific(hogwarts.getName(),this.name);
        } else {
            System.out.println(this.name + thisScore + "," + hogwarts.getName() + otherScore);
            System.out.println("Силы равны");
        }


    }



    @Override
    public String toString() {
        return "Hogwarts{" +
                "name = '" + name + '\'' +
                ", thePowerOfFalconry = " + thePowerOfFalconry +
                ", transgress = " + transgress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return thePowerOfFalconry == hogwarts.thePowerOfFalconry && transgress == hogwarts.transgress && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, thePowerOfFalconry, transgress);
    }
}
