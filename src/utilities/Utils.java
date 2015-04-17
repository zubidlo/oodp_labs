package utilities;

import java.lang.reflect.*;
import java.util.*;
import static java.lang.System.out;

/**
 * Some useful static methods.
 * Created by martin on 06/02/2015.
 * from:
 * <a href="http://docs.oracle.com/javase/tutorial/reflect/class/classModifiers.html">Reflection tutorial</a>
 */
public class Utils {

    /**
     * Prints Extensive Class information about given object:
     * Interfaces it implements,
     * it's inheritance path,
     * it's declared constructors,
     * it's declared fields,
     * it's declared methods
     * and all inherited methods.
     * @param o Object
     */
    public static void printClassInfo(Object o) {

        Class c = o.getClass();
        out.format("Class: %n  %s%n%n", c.getName());
        printInterfaces(c);
        printInheritancePath(c);
        printConstructors(c);
        printDeclaredFields(c);
        printMethods(c);
    }

    private static void printConstructors(Class c) {

        Constructor[] constructors = c.getConstructors();
        out.format("Constructors:%n");
        for (Constructor cons : constructors) {
            out.format("  %s%n", cons.toString());
        }
        out.format("%n");

    }

   private static void printInterfaces(Class c) {

        out.format("Implemented Interfaces:%n");
        Type[] interfaces = c.getGenericInterfaces();
        if (interfaces.length != 0) {
            for (Type intf : interfaces) { out.format("  %s%n", intf.toString()); }
            out.format("%n");
        } else { out.format("  -- No Implemented Interfaces --%n%n"); }
    }

    private static void printInheritancePath(Class c) {

        out.format("Inheritance Path:%n");
        List<Class> l = new ArrayList<>();
        printAncestor(c, l);
        if (l.size() != 0) {
            for (Class<?> cl : l) { out.format("  %s%n", cl.getCanonicalName()); }
            out.format("%n");
        } else { out.format("  -- No Super Classes --%n%n"); }
    }

    private static void printDeclaredFields(Class c) {

        out.format("Declared Fields:%n");
        Field[] fields = c.getDeclaredFields();
        if(fields.length != 0) {
            for(Field f : fields) {
                out.format("  %s %s%n", Modifier.toString(f.getModifiers()), f.toString());
            }
            out.format("%n");
        } else {
            out.format("  -- No Fields --%n%n");
        }
    }

    private static void printMethods(Class c) {

        out.format("Declared Methods:%n");
        List<Method> declaredMethods = new LinkedList<>(Arrays.asList(c.getDeclaredMethods()));
        if(declaredMethods.size() != 0) {
            for(Method m : declaredMethods) {
                out.format("  %s %s%n", Modifier.toString(m.getModifiers()), m.toString());
            }
            out.format("%n");
        }

        List<Method> allMethods = new LinkedList<>(Arrays.asList(c.getMethods()));
        allMethods.removeAll(declaredMethods);
        out.format("Inherited Methods:%n");
        for(Method m : allMethods) {
            out.format("  %s %s%n", Modifier.toString(m.getModifiers()), m.toString());
        }
        out.format("%n");

    }

    private static void printAncestor(Class c, List<Class> l) {

        Class<?> ancestor = c.getSuperclass();
        if (ancestor != null) {
            l.add(ancestor);
            printAncestor(ancestor, l);
        }
    }

    private static Random rand = new Random();

    /**
     * Returns random integer from O included to upperLimit excluded.
     * @param upperLimit upper limit
     * @return random integer
     */
    public static int rand(int upperLimit) {

        return rand.nextInt(upperLimit);
    }
}
