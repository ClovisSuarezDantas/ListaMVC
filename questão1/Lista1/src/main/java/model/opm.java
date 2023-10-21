package model;

public class opm {
	private int a;
	private int b;
	private int c;
	
	
    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static int subtrai(int a, int b) {
        return a - b;
    }

    public static int multiplica(int a, int b, int c) {
        return a * b * c;
    }

    public static double divide(int a, int b, int c) {
        return (double) a / b / c;
    }

    public static double restoB(int a, int b) {
        return (double) a % b;
    }
    
    public static double restoC(int a, int c) {
        return (double) a % c;
    }
}