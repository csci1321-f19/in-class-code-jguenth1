package networking
import akka.actor.Actor
import java.net.Socket
import java.io.PrintStream
import java.io.BufferedReader


class Chatter(name: String, sock:Socket, out: PrintStream, in: BufferedReader) extends Actor {
  import Chatter._
  def receive = {
    case CheckInput =>
      if (in.ready()) {
        val message = in.readLine()
        sender ! ChatManager.SendToAll(name + ": " + message)
      }
    case PrintMessage(message) => println(message)
    case m => println("Unhandled message in Chatter")
  }
}
object Chatter {
  case object CheckInput
  case class PrintMessage(message: String)
}