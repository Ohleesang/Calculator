import java.util.*

open class Calculator {
    var num1 = 0
    var num2 = 0
    var operator =' '
    // 2*4 일때 계산하는 계산기를 만들어보자

    // 계산 처리 하는함수
    fun processStr(s :String){
        var str = s+""

        if(str=="") {
            println("값을 입력하시오")
            return
        }

        //공백이 들어갈 경우 처리
        if(str.contains(' ')){
            str =str.replace(" ","")
        }
        var operArray = arrayOf('*','/','+','-')//우선 처리 순서
        var list =listOf<String>()

        operArray.forEach{
            if(str.contains(it))
            {
                operator = it
                list = str.split(it)
                num1 = list[0].toInt()
                num2 = list[1].toInt()
            }
        }
        calcul() //연산자에 따라 계산 실행
    }
    //연산자에 따라 계산 시행
    open fun calcul(){
        when(operator){
            '+' -> println("${num1} 과 ${num2} 의 덧셈은 ${num1 + num2} 입니다.")
            '-' -> println("${num1} 과 ${num2} 의 뺄셈은 ${num1 - num2} 입니다.")
            '*' -> println("${num1} 과 ${num2} 의 곱셈은 ${num1 * num2} 입니다.")
            '/' -> println("${num1} 과 ${num2} 의 나눗셈은 ${num1 / num2} 입니다.")

        }
    }
}
//자식 클래스
class AddOperation:Calculator(){

    override fun calcul(){
        if(operator=='+')
            println("${num1} 과 ${num2} 의 덧셈은 ${num1 + num2} 입니다.")
        else
            println("덧셈이 아닙니다.")
    }

}

class SubstractOperation:Calculator(){

    override fun calcul(){
        if(operator=='-')
            println("${num1} 과 ${num2} 의 뺄셈은 ${num1 - num2} 입니다.")
        else
            println("뺄셈이 아닙니다.")
    }
}

class MultiplyOperation:Calculator(){

    override fun calcul(){
        if(operator=='*')
            println("${num1} 과 ${num2} 의 곱셈은 ${num1 * num2} 입니다.")
        else
            println("곱셈이 아닙니다.")
    }

}


class DivideOperation:Calculator(){
    override fun calcul(){
        if(operator=='/')
            println("${num1} 과 ${num2} 의 나눗셈은 ${num1 / num2} 입니다.")
        else
            println("나눗셈이 아닙니다.")
    }

}
fun main() {
    var cal = Calculator()
    var add = AddOperation()
    var sub = SubstractOperation()
    var mul = MultiplyOperation()
    var div = DivideOperation()
//    cal.processStr("12+22")
//    cal.processStr("132-111")
//    cal.processStr("132*111")
//    cal.processStr("132/111")

    var input: String = ""
    while (true) {

        input = readLine()!!
        cal.processStr(input)
        add.processStr(input)
        sub.processStr(input)
        mul.processStr(input)
        div.processStr(input)


    }
}
