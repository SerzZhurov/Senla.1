package Learning;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String MARKS = "+-*/%=";
        final String EQ_MARK = "=";
        final String CE_COMAND = "ce";
        final String OFF_COMAND = "off";
        double lastResult = 0;
        double arg1 = 0;
        double arg2 = 0;
        String currentMak = "";
        String userInput = "";
        boolean isLastInputMark = false;
        boolean isLastInputEq = false;
        boolean isArg1Entered = false;
        boolean isArg2Entered = false;
        System.out.println("Добро пожаловать в калькулятор. ");
        System.out.println("Вводите числа и знаки действий нажимая Enter после каждого. \n"
                + "Введите = для получения результата. \n"
                + "Введите СЕ для сброса результата. \n"
                + "Введите OFF для выхода.\n");
        while (true) {
// получить пользовательский ввод
            userInput = input.next();
//если пользователь ввел off - выйти из программы
            if (userInput.equalsIgnoreCase(OFF_COMAND)) {
                break;
// если пользователь ввел ce - сбросить все состояние переменных на начальное
            } else if (userInput.equalsIgnoreCase(CE_COMAND)) {
                lastResult = arg1 = arg2 = 0;
                currentMak = userInput = "";
                isLastInputMark = isLastInputEq = isArg1Entered = isArg2Entered = false;
// если пользователь ввел знак из группы +-*/%=
            } else if (userInput.length() == 1 && MARKS.contains(userInput)) {
// если (пользователь ввел = ) или (другой знак операции но оба аргументы уже были введены) - провести расчет
                if (EQ_MARK.equals(userInput) || !EQ_MARK.equals(userInput) && isArg1Entered && isArg2Entered) {
                    if (isLastInputEq) {
                        arg1 = lastResult;
                    } else if (isLastInputMark && isArg1Entered) {
                        arg2 = arg1;
                    } else if (isArg1Entered && !isArg2Entered) {
                        arg2 = arg1;
                        arg1 = lastResult;
                    }
                    if (currentMak.equals("+")) {
                        lastResult = arg1 + arg2;
                    } else if (currentMak.equals("-")) {
                        lastResult = arg1 - arg2;
                    } else if (currentMak.equals("*")) {
                        lastResult = arg1 * arg2;
                    } else if (currentMak.equals("/") || currentMak.equals("%")) {
                        if (arg2 != 0) {
                            lastResult = currentMak.equals("/") ? arg1 / arg2 : arg1 % arg2;
                        } else {
                            System.out.println("Делить на ноль нельзя");
                            lastResult = 0;
                        }
// если пользователь ввел число и после него сразу знак =, сбросить состояние переменных
                    } else if (currentMak.isBlank()) {
                        lastResult = arg1 = arg2 = 0;
                        isLastInputMark = isLastInputEq = isArg1Entered = isArg2Entered = false;
                        System.out.println("Неверная последовательность ввода");
                        continue;
                    }
                    System.out.println(arg1 + currentMak + arg2 + "=" + lastResult);
                    isArg1Entered = isArg2Entered = isLastInputMark = false;
                    isLastInputEq = true;
// если текущий расчет был иницирован не знаком =, а новой операцией, записать результат в 1й аргумент
                    if (!EQ_MARK.equals(userInput)) {
                        isArg1Entered = true;
                        arg1 = lastResult;
                        currentMak = userInput;
                        isLastInputMark = true;
                    }
                } else {
                    if (!isArg1Entered) { // если еще не введен первый аргумент - записать в него последний расчет
                        isArg1Entered = true;
                        arg1 = lastResult;
                    }
                    currentMak = userInput;
                    isLastInputMark = true;
                }
// иначе пользователь ввел число
            } else {
                if (!isArg1Entered) {
                    arg1 = Double.parseDouble(userInput);
                    isArg1Entered = true;
                } else if (!isArg2Entered) {
                    arg2 = Double.parseDouble(userInput);
                    isArg2Entered = true;
                } else {
                    arg1 = Double.parseDouble(userInput);
                    isArg1Entered = true;
                    isArg2Entered = false;
                    isLastInputEq = isLastInputMark = false;
                    lastResult = 0;
                }
                isLastInputEq = isLastInputMark = false;
            }
        }
    }
}
