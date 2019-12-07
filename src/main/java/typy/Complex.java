package typy;

public class Complex {

    private double re;
    private double im;

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void pisz(String s) {
        System.out.println(s+"["+(int)this.getRe() + "+i*" + (int)this.getIm()+"]");
    }

    public Complex dodaj(Complex x1, Complex x2) {
        // dla x1 = a+b*i, x2 = c+d*i mamy x1+x2 = (a+c)+i*(b+d)
        Complex res = new Complex (x1.getRe() + x2.getRe(), x1.getIm() + x2.getIm());
        return res;
    }

    public Complex iloczyn (Complex x2){ //zwraca iloczyn dwóch liczb zespolonych
        // dla x1 = a+b*i, x2 = c+d*i mamy x1*x2 = (ac-bd)+i*(ad+bc) // (x1=this, ten sam obiekt)*x2 (parametr)
        Complex res = new Complex (
                this.getRe() * x2.getRe() - this.getIm() * x2.getIm(),
                this.getRe() * x2.getIm() + this.getIm() * x2.getRe());
        return res; }
}
