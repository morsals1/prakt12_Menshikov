import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    val list =  mutableListOf<Int>()
    val a: `class2` = `class2`()
    var k = a.input()
    var temp = 0
    GlobalScope.launch{
        for(i in 1..k){
            println("$i раз")
            a.info()
            list.add(a.kol)
        }
    }
    runBlocking {
        delay(20000)
        a.sort(list)
    }
}