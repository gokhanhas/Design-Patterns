package part4.partB;

import java.lang.reflect.Proxy;

/**
 * This is the driver test class, include the part B.
 * @author Gökhan Has
 */
public class DriverPartB {
    private static ITablePartB proxyTable;

    public static void main(String[] args) {

        Integer[][] tempDB = new Integer[10][10];
        int value = 0;
        for(int i=0; i < tempDB.length; i++) {
            for(int j=0; j < tempDB[0].length; j++) {
                tempDB[i][j] = value;
                value++;
            }
        }

        DataBaseTablePartB dataBaseTable = new DataBaseTablePartB(tempDB);
        proxyTable = getOwnerProxy(dataBaseTable);


        Thread thread1 = new Thread(DriverPartB::writerThreadFunction);
        Thread thread2 = new Thread(DriverPartB::writerThreadFunction);
        Thread thread3 = new Thread(DriverPartB::writerThreadFunction);
        Thread thread4 = new Thread(DriverPartB::writerThreadFunction);
        Thread thread5 = new Thread(DriverPartB::writerThreadFunction);
        Thread thread6 = new Thread(DriverPartB::readerThreadFunction);
        Thread thread7 = new Thread(DriverPartB::readerThreadFunction);
        Thread thread8 = new Thread(DriverPartB::readerThreadFunction);
        Thread thread9 = new Thread(DriverPartB::readerThreadFunction);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();

    }


    public static void readerThreadFunction() {
        Object o = proxyTable.getElementAt(5, 5);
        System.out.println( Thread.currentThread().getName() + "  : Get Method Result : " +  o);
    }

    public static void writerThreadFunction() {
        proxyTable.setElementAt(5,5, -10);
    }

    public static ITablePartB getOwnerProxy(ITablePartB iTableReference) {
        return (ITablePartB) Proxy.newProxyInstance(iTableReference.getClass().getClassLoader(),
                iTableReference.getClass().getInterfaces(),
                new ProxyTablePartB(iTableReference));
    }
}
