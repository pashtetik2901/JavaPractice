package task_1;

public class Complex {
    private int real;
    private int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public int getImag() {
        return imag;
    }

    public int getReal() {
        return real;
    }

    @Override
    public String toString() {
        return "real=" + real + ", imag=" + imag;
    }
}
