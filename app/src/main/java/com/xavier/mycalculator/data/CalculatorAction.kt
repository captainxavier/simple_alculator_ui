package com.xavier.mycalculator.data

sealed class CalculatorAction{
    data class Number(val number:Int):CalculatorAction()
    object ClearAll:CalculatorAction()
    object Delete:CalculatorAction()
    object Decimal:CalculatorAction()
    object Calculate:CalculatorAction()
    data class Operations(val calculatorOperation: CalculatorOperation):CalculatorAction()

}
