import java.io.*
import java.net.*


fun main(){
    val serverSocket = ServerSocket(8080)
    val clientSocket =  serverSocket.accept();

    var Out = PrintWriter(clientSocket.getOutputStream(), true)
    val inputstream = InputStreamReader(clientSocket.getInputStream())
    val In = BufferedReader(inputstream)

    var inputline = ""
    while(inputline!= null){
        inputline = In.readLine()
        Out.println("echo: " + inputline)
    }


}