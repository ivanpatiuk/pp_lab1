//lab1_8
//
package lab1_1;

public class CustomDouble {
    public int anInt;
    public double aDouble;

    public CustomDouble() {
        anInt = 0;
        aDouble = 0;
    }

    public CustomDouble(int anInt, double aDouble) {
        this.anInt = anInt;
        if (aDouble >= 1) {
            if (this.anInt < 0)
                this.anInt -= Math.abs(aDouble / 1);
            else
                this.anInt += Math.abs(aDouble / 1);
            this.aDouble += Math.abs(aDouble % 1);

        } else
            this.aDouble = aDouble;
    }

    public double toDouble() {
        if (this.anInt < 0)
            return this.anInt - this.aDouble;
        else
            return this.anInt + this.aDouble;
    }

    public void plus(final CustomDouble obj) {
        double result = this.toDouble();
        double tmp = obj.toDouble();
        result += tmp;
        this.anInt = (int) result;
        this.aDouble = Math.abs(result - this.anInt);
    }

    public void minus(final CustomDouble obj) {
        obj.anInt = -obj.anInt;
        this.plus(obj);
    }

    public boolean moreThan(final CustomDouble obj) {
        return (this.toDouble() > obj.toDouble());
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        final CustomDouble object = (CustomDouble) obj;
        if (this.anInt == object.anInt && this.aDouble == object.aDouble)
            return true;
        else
            return false;
    }

    public boolean moreEqualThan(final CustomDouble obj) {
        if (this.moreThan(obj) | this.equals(obj))
            return true;
        else
            return false;
    }

    public boolean lessThan(final CustomDouble obj) {
        if (!(this.moreThan(obj)))
            return true;
        else
            return false;
    }

    public boolean lessEqualThan(final CustomDouble obj) {
        if (!(this.moreEqualThan(obj)))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.anInt + (int) (10000 * this.aDouble) + 27;
    }

    public void sout() {
        System.out.println(this.toDouble());
        System.out.println(anInt + "," + aDouble);
    }

    public static void main(String[] args) {
        CustomDouble a = new CustomDouble(-4, 0.2);
        System.out.println(a.toDouble());
        CustomDouble b = new CustomDouble(5, 0.6);
        a.plus(b);
        a.sout();
        CustomDouble c = new CustomDouble(-3, 0.7);
        CustomDouble d = new CustomDouble(6, 0.2);
        c.minus(d);
        c.sout();
        CustomDouble a1 = new CustomDouble(1, 0.6);
        CustomDouble b1 = new CustomDouble(1, 0.6);
        if (a.moreEqualThan(b))
            System.out.println("true1");
        if (c.lessThan(d))
            System.out.println("true2");
        if (a1.equals(b1))
            System.out.println("true3");
    }
}
