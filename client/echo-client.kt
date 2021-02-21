import java.io.*
import java.net.*


fun main(){

    val echoSocket = Socket("localhost",8080)

    PrintWritter out = PrintWritter(echoSocket.getOutPutStream(),true)
    InputStreamReader input = InputStreamReader(getInPutStream(echoSocket.getOutPutStream()))
    BufferedReader In = BufferedReader(input)

    InputStreamReader systemIn = InputStreamReader(System.`in`)
    BufferedReader stdIn = BufferedReader(systemIn)

    String userInput = stdIn.readLine();
    while(userInput != null){
        System.out.println(userInput)
        System.out.println("echo: " + In.readLine());
    }

}