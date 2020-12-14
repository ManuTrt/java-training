package code._4_student_effort._1_exchange_desk;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {
    public <A extends Currency,B extends Currency> B exchange(A from, Class<B> to, float rate) {
        B toReturn = null;

        try {
            toReturn = to.getDeclaredConstructor().newInstance();
            toReturn.setValue(from.getValue() * rate);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return toReturn;
    }
}
