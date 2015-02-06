package utilities;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static java.lang.System.out;

/**
 * Created by martin on 06/02/2015.
 * from:
 * <a href="http://docs.oracle.com/javase/tutorial/reflect/class/classModifiers.html">Reflection tutorial</a>
 */
public class Utils {

    public static void printClassInfo(Object o) {

        Class c = o.getClass();
        out.format("Class: %n  %s%n%n", c.getName());
        printInterfaces(c);
        printInheritancePath(c);
        printDeclaredConstructors(c);
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

    private static void printDeclaredConstructors(Class c) {

        Constructor[] declConstructors = c.getDeclaredConstructors();
        out.format("Declared constructors:%n");
        for (Constructor cons : declConstructors) {
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
        List<Class> l = new ArrayList<Class>();
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
        List<Method> declaredMethods = new LinkedList<Method>(Arrays.asList(c.getDeclaredMethods()));
        if(declaredMethods.size() != 0) {
            for(Method m : declaredMethods) {
                out.format("  %s %s%n", Modifier.toString(m.getModifiers()), m.toString());
            }
            out.format("%n");
        }

        List<Method> allMethods = new LinkedList<Method>(Arrays.asList(c.getMethods()));
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
}
