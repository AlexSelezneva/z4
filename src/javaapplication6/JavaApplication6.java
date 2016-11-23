/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wWw
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число а : ");
        double a = input.nextDouble();
        System.out.println("Введите число b : ");
        double b = input.nextDouble();
        //int n = 4;
        System.out.println("");
        double PL = a + b;
        double MU = a * b;
        double DIV = a / b;
        double SUB = a - b;
        System.out.println("Сумма = " + PL);
        System.out.println("Умножение = " + MU);
        System.out.println("Деление = " + DIV);
        System.out.println("Разница = " + SUB);
        System.out.println(" ");
        double mas[] = new double[4];

        mas[0] = PL;
        mas[1] = MU;
        mas[2] = DIV;
        mas[3] = SUB;

        for (int i = 0; i < mas.length; i++) {

            System.out.println("mas[]= " + mas[i]);
        }
        System.out.println("");
        
        double sqrtPL = Math.sqrt(PL);
        double sqrtMU = Math.sqrt(MU);
        double sqrtDIV = Math.sqrt(DIV);
        double sqrtSUB = Math.sqrt(SUB);

        System.out.println("Квадратный корень из Суммы = " + sqrtPL);
        System.out.println("Квадратный корень из Умножения = " + sqrtMU);
        System.out.println("Квадратный корень из Деления = " + sqrtDIV);
        if (SUB >= 0) {
            System.out.println("Квадратный корень из Разницы = " + sqrtSUB);
        } else {
            System.out.println("Нельзя извлечь корень из отрицательного числа");
        }
        System.out.println("");

        double sqrtmas[] = new double[4];

        sqrtmas[0] = sqrtPL;
        sqrtmas[1] = sqrtMU;
        sqrtmas[2] = sqrtDIV;
        if (SUB >= 0) {
            sqrtmas[3] = sqrtSUB;
        }

        for (int i = 0; i < sqrtmas.length; i++) {
            System.out.println("sqrtmas[]= " + sqrtmas[i]);
        }
        
        System.out.println("");
        double[][] QM = {{PL, MU, DIV, SUB}, {sqrtPL, sqrtMU, sqrtDIV, sqrtSUB},};
        System.out.println(Arrays.deepToString(QM));
        /*for (int i = 0; i < QM.length; i++)
            for (int j = 0; j < QM.length; j++){
        System.out.println(" "+QM[i][j]); 
            }*/
        // TODO code application logic here
    }

}
