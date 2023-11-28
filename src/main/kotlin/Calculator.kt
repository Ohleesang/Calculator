
class Calculator {
    //1+(2*4)/2 일때 계산하는 계산기를 만들어보자
    fun processStr(s :String){
        if(s=="") {
            println("값을 입력하시오")
            return
        }
        var operator = arrayOf("+","-","*","/")
        //1.s에서 연산자 인 문자를 찾는다
        var num1 = 0
        var num2 = 0
        var x  = mutableListOf<String>()
        operator.forEach{
            if(s.contains(it)){
                x = s.split(it).toMutableList()
            }
        }
        println(x)
        //2.연산자 기준으로 값을 처리 한다

    }
}

fun main(){
    var cal = Calculator()
    var input :String = ""
    while(true) {

        input = readLine()!!
        cal.processStr(input)

    }


}