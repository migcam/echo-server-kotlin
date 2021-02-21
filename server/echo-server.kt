import java.io.*
import java.net.*


fun main(){
    val serverSocket = ServerSocket(8080)
    val clientSocket =  serverSocket.accept();

    val out = PrintWritter(clientSocket.getOutPutStream(), true);
    val In = BufferedReader(clientSocket.getInPutStream())

    string inputline = in.readLine()
    while(inputline!= null){
        println(inputline)
        inputline = in.readLine()
    }
}