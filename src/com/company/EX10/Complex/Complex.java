package com.company.EX10.Complex;

public class Complex {
    private double dReal, dImaginary;

    public Complex() {
        dReal = 0.0;
        dImaginary = 0.0;
    }

    public Complex(double dReal, double dImaginary) {
        this.dReal = dReal;
        this.dImaginary = dImaginary;
    }

    public Complex add( Complex cB ) {
        Complex sum = new Complex();

        sum.dReal = this.dReal + cB.dReal;
        sum.dImaginary = this.dImaginary + cB.dImaginary;

        return (sum);
    }

    public Complex sub( Complex cB ) {
        Complex subRes = new Complex();

        subRes.dReal = this.dReal - cB.dReal;
        subRes.dImaginary = this.dImaginary - cB.dImaginary;

        return (subRes);
    }

    @Override
    public String toString() {
        if (dImaginary >= 0)
            return dReal + " + " + dImaginary + "i";
        else
            return dReal + " - " + -dImaginary + "i";
    }
}
