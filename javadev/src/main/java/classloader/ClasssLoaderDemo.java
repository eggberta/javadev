package classloader;

import java.util.List;

public class ClasssLoaderDemo {

  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

    String className = "java.util.Vector";
    Class<?> clazz = Class.forName(className);
    Object instance = clazz.newInstance();
    List instanceList = (List) instance;

    instanceList.add("eins");
    System.out.println(instanceList.size());

  }
}
