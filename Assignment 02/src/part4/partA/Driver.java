package part4.partA;

import java.lang.reflect.Proxy;

/**
 * This is the driver test class, include the part A.
 * @author Gökhan Has
 */
public class Driver {

    private static ITable proxyTable;

    public static void main(String[] args) {

        Integer[][] tempDB = new Integer[10][10];
        int value = 0;
        for(int i=0; i < tempDB.length; i++) {
            for(int j=0; j < tempDB[0].length; j++) {
                tempDB[i][j] = value;
                value++;
            }
        }

        DataBaseTable dataBaseTable = new DataBaseTable(tempDB);
        proxyTable = getOwnerProxy(dataBaseTable);


        Thread thread1 = new Thread(Driver::readerThreadFunction);
        Thread thread2 = new Thread(Driver::writerThreadFunction);
        Thread thread3 = new Thread(Driver::writerThreadFunction);
        Thread thread4 = new Thread(Driver::readerThreadFunction);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


    public static void readerThreadFunction() {
        Object o = proxyTable.getElementAt(5, 5);
        System.out.println( Thread.currentThread().getName() + "  : Get Method Result : " +  o);
    }

    public static void writerThreadFunction() {
        proxyTable.setElementAt(5,5, -10);
        System.out.println(Thread.currentThread().getName() + "  : Set Method is finished");
    }

    public static ITable getOwnerProxy(ITable iTableReference) {
        return (ITable) Proxy.newProxyInstance(iTableReference.getClass().getClassLoader(),
                iTableReference.getClass().getInterfaces(),
                new ProxyTable(iTableReference));
    }
}
