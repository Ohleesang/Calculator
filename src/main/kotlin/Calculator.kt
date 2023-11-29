import java.util.*

class Calculator {
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
    fun calcul(){
        when(operator){
            '*' -> println("${num1} 과 ${num2} 의 곱셈은 ${num1 * num2} 입니다.")
            '/' -> println("${num1} 과 ${num2} 의 나눗셈은 ${num1 / num2} 입니다.")
            '+' -> println("${num1} 과 ${num2} 의 덧셈은 ${num1 + num2} 입니다.")
            '-' -> println("${num1} 과 ${num2} 의 뺄셈은 ${num1 - num2} 입니다.")
        }
    }
}

fun main() {
    var cal = Calculator()
//    cal.processStr("12+22")
//    cal.processStr("132-111")
//    cal.processStr("132*111")
//    cal.processStr("132/111")

    var input: String = ""
    while (true) {

        input = readLine()!!
        cal.processStr(input)


    }
}
