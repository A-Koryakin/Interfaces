package ru.bstu.ieitus.vt41.kao.utills;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*Позволяет получить от пользователя данные во что бы то ни стало*/
public class ScanningLoop {

    private Scanner mScanner;

    public ScanningLoop(Scanner scanner)
    {
        mScanner = scanner;
    }

    public int scanInt() throws NoSuchElementException, IllegalStateException{
        int result;

        while (true){
            try {
                result = mScanner.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.print(" Вы ввели не целое число, попробуйте ещё раз: ");
                mScanner.next();
            }
            catch (NoSuchElementException e){
                throw new NoSuchElementException("Сканеру не удалось распознать вводимые символы " + e.getMessage());
            }
            catch (IllegalStateException e){
                throw new IllegalStateException("Сканер не может сейчас отработать " + e.getMessage());
            }
        }

        return result;
    }

    public int scanNotNullInt() throws NoSuchElementException, IllegalStateException {
        int result = 0;

        try{
            while (result == 0){
                result = scanInt();
                if(result == 0)
                {
                    System.out.print("Число не должно быть равно нулю, попробуйте ещё раз: ");
                }
            }
        }
        catch (NoSuchElementException e){
            throw new NoSuchElementException("Сканеру не удалось распознать вводимые символы " + e.getMessage());
        }
        catch (IllegalStateException e){
            throw new IllegalStateException("Сканер не может сейчас отработать " + e.getMessage());
        }

        return result;
    }

    public boolean scanBooleanFromString() throws NoSuchElementException, IllegalStateException {
        String tmp = "";

        while (true){

            try {
                tmp = mScanner.next();
            }
            catch (NoSuchElementException e){
                throw new NoSuchElementException("Сканеру не удалось распознать вводимые символы " + e.getMessage());
            }
            catch (IllegalStateException e){
                throw new IllegalStateException("Сканер не может сейчас отработать " + e.getMessage());
            }

            if(tmp.toUpperCase().equals("Y") || tmp.toUpperCase().equals("Д") || tmp.toUpperCase().equals("1"))
            {
                return true;
            }
            if(tmp.toUpperCase().equals("N") || tmp.toUpperCase().equals("Н") || tmp.toUpperCase().equals("0")) {
                return false;
            }
            else
            {
                System.out.print("Были введены неправилные символы, попробуйте ещё раз: ");
            }
        }
    }
}
