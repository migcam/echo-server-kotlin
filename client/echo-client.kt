import java.io.*
import java.net.*

fun main(){

    val echoSocket = Socket("localhost",8080)

    val Out = PrintWriter(echoSocket.getOutputStream(),true)
    val input = InputStreamReader(echoSocket.getInputStream())
    val In = BufferedReader(input)

    val systemIn = InputStreamReader(System.`in`)
    val stdIn = BufferedReader(systemIn)

    var userInput = stdIn.readLine()
    while(userInput != null){
        Out.println(userInput)
        System.out.println(In.readLine());
        userInput = stdIn.readLine()
    }

}