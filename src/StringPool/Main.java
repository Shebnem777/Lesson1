package StringPool;
//String Java-da verilənlər tipli mətnləri təmsil etdiyi halda,
// String sinfinin metodları bu mətnlər üzərində müxtəlif funksiyaları yerinə yetirməyə imkan verir.
// Müxtəlif funksiyaları yerinə yetirmək üçün istifadə olunan sətir metodları, mətn emalı və String obyektləri

import java.util.Arrays;
import java.util.Locale;
import java.util.StringJoiner;

public class Main {
    //public final class String

    /**
     * The value is used for character storage.
     *
     * @implNote This field is trusted by the VM, and is a subject to
     * constant folding if String instance is constant. Overwriting this
     * field after construction will cause problems.
     * <p>
     * Additionally, it is marked with {@link Stable} to trust the contents
     * of the array. No other facility in JDK provides this functionality (yet).
     * {@link Stable} is safe here, because value is never null.
     */
    //  @Stable
    // private final byte[] value;
    public static void main(String[] args) {

        String s = "hello";
        String s1 = "hello";
        String s2="word";
        String a = new String("hello");
        System.out.println(s == s1);
        System.out.println(s == a);
        System.out.println(s1==a);
        String b = s.toLowerCase();
        System.out.println("kicik " + b);
        String c = s.toUpperCase();
        System.out.println("boyuk " + c);
        char f[] = s.toCharArray();
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);

        }
        StringAppend();
        person();
        test();
    }

    static void StringAppend() {
        StringBuffer m = new StringBuffer();//theadsafe synchronized oldugu ucun gec calisir
        m.append("test");
        m.append("bir");
        System.out.println(m);
        String k = "test";
        k = k + "bir";
        System.out.println(k);
        StringBuilder b; // theadsafe deyil


    }

    public static void person() {
        Person person=new Person(6);
        System.out.println(person.getAge());

    }



    public static void test() {
        ToString toString=new ToString("Shabnam",28);
        System.out.println(toString);
    }

}