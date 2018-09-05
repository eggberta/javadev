package pattern.command;

import java.util.Vector;

public class Server {

  public void machet(Vector<ICommand> commnandList) {

    for (ICommand currentCommand : commnandList) {

      currentCommand.execute(); // Callback
    }

  }

}
