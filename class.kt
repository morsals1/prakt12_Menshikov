import kotlin.random.Random

class `class` {
    var a = (100..999).random()
    var insp = false

    fun input():Int {
        try {
        println("введите сколько потворений будет")
        var sv = readln()!!.toInt()
        if(sv>0)
            return sv
        else println("число должно быть больше 0")
        return 1
        }catch (e:Exception) {println("некоректный ввод")}
        return 1
    }
    fun findPass(){
        try {
            println("Угадайте пароль *** ($a)");
            var b = readln()!!.toInt()
            if (a == b) {
                println("вы угадали пароль")
                insp = true
            } else {
                println("поробуйте снова")
                insp = false
            }
        }catch (e:Exception) { println("некоректный ввод") }
    }
}