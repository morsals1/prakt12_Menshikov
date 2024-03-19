import kotlinx.coroutines.*

suspend fun main(){
    val a: `class` = `class`()
    var count = 0
    var k = a.input()
    GlobalScope.launch{
        for(i in 1..k){
            count++
            println("$i раз")
            a.findPass()
            if(a.insp == true){
                break
            }
        }
    }
    runBlocking {
        delay(30000)
        if(a.insp == true){
            println("вы отгадали пароль за $count попытку")
        }
        else println("вы не отгадали пароль")
    }

}


