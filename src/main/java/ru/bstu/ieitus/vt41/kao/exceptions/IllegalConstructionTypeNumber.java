package ru.bstu.ieitus.vt41.kao.exceptions;

/*Исключение, возникающее когда происходит попытка обращения к типу конструкции по не существующему номеру*/
public class IllegalConstructionTypeNumber extends IllegalArgumentException {

    public IllegalConstructionTypeNumber(){
        super();
    }

    public IllegalConstructionTypeNumber(String s) {
        super(s);
    }
}
