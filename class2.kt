class class2 {

    fun input():Int {
        try {
        println("введите сколько потворений будет")
        var sv = readln()!!.toInt()
        if(sv>0)
            return sv
        else println("число должно быть больше 0")
        return 1
        } catch (e:Exception) { println("некоректный ввод") }
        return 1
    }

    var kol = 0
    var pass = ""
    var name = ""
    var rep = 0

    fun info(){
        try {
            println("введите имя участника")
            name = readln()!!.toString()
            println("репозиторий: приватный - (1), откртый - (2)")
            rep = readln()!!.toInt()
            if (rep == 1) {
                println("введите пароль репозитория")
                pass = readln()
                println("введите сколько у вас репозиториев")
                kol = readln()!!.toInt()

            } else if (rep == 2) {
                pass = ""
                println("введите сколько у вас репозиториев")
                kol = readln()!!.toInt()

            } else {
                println("нужно нажать: приватный - (1), откртый - (2)")
            }
        } catch (e:Exception) { println("некоректный ввод") }
    }

    fun sort(x: List<Int>){
        x.sorted()
        println(x.sorted())
    }

    fun output(t:Int){
        println("имя - $name; репозиторий - $rep; пароль - $pass; кол-во репозиториев - $t")
    }
}