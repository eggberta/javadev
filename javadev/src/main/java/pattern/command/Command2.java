package pattern.command;

public class Command2 implements ICommand {

  private String statement;

  public Command2(String statement) {
    this.statement = statement;
  }

  @Override
  public void execute() {
    System.out.println("Executing: " + statement);

  }

}
