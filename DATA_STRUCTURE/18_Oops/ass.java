import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    // Method to display a complex number
    public void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first complex number
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        // Taking input for the second complex number
        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        // Performing operations
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        // Displaying results
        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        difference.display();

        System.out.print("Product: ");
        product.display();

        scanner.close();
    }
}
