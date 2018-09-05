package serializable;

public class MyException extends Exception {

 /**
   * 
   */
  private static final long serialVersionUID = 3634053799249006548L;

//  private static final long serialVersionUID = 3634053799249006548L;
//  private static final long serialVersionUID = 3634053799249006548L;
// private static final long serialVersionUID = 3634053799249006548L;
//  private static final long serialVersionUID = 1L;
//  private static final long serialVersionUID = -7293721031721656873L;

  public MyException(String msg) {
    
    super(msg);    
  }
  
  public String getFormattedMessage() {
    String message = super.getMessage();
    String formattedMessage = String.format(message, 4711,4722);
    return formattedMessage;
  }

}
