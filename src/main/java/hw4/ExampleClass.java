package hw4;

public class ExampleClass {

    public static void main(String[] args) throws MyException {
        ExampleClass exampleClass = new ExampleClass();

        System.out.println(exampleClass.squareTriangle(30,40,50));
    }

    public float squareTriangle(int a, int b, int c) throws MyException {
        if (check(a,b,c)) {
            throw new MyException("Такого треугольника не существует!!!");
        } else {
            float p = (float) (a + b + c) / 2;
            float result = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return result;
        }
    }

    private boolean check(int a, int b, int c) {
        return a < 0 || b < 0 || c < 0 ||
               a == 0 || b == 0 || c == 0 ||
               (a + b) <= c || (a + c) <= b || (c + b) <= a;
    }
}
