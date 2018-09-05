package pattern.command;

import java.util.Vector;

public class CommandPatternDemo {



  public static void main(String[] args) {
    
    Server server = new Server();
    ICommand befehl1 = new Command1("Befehl 1");
    ICommand befehl11 = new Command1("Befehl 11");
    ICommand befehl2 = new Command2("Befehl 2");
    
    Vector<ICommand> commnandList = new Vector<>();
    commnandList.add(befehl1);
    commnandList.add(befehl11);
    commnandList.add(befehl2);
    
    server.machet(commnandList);
  }
  
}
