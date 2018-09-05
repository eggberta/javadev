package pattern.command;

public class Command1 implements ICommand {

  
  private String statement;
  
  public Command1(String statement) {
    this.statement = statement;
  }

  @Override
  public void execute() {
    System.out.println("Es wird ausgef�hrt: " + statement);
    
  }
  

}
