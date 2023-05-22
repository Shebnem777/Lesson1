package MyLesson;
//equals() və == operatoru arasında mühüm fərqlər var. Bu fərqləri aşağıda izah edirəm:
//
//bərabər() metodu:
//
//equals() metodu Object sinfində müəyyən edilmiş metoddur və məzmun əsasında obyekti başqa obyektlə müqayisə edir.
//equals() metodunun standart tətbiqi iki obyektin istinadlarını müqayisə edir. Yəni, iki fərqli obyekt olsa belə,
// onların istinadları eyni olduqda doğru qaytarır.
//Bu üsul bir sinif tərəfindən yenidən həyata keçirilə bilər və sinfə məxsus məzmuna əsaslanan müqayisələr həyata keçirə bilər.
//== operator:
//
//== operatoru iki dəyişənin eyni yaddaş yerinə işarə edib-etmədiyini yoxlayır. Yəni iki dəyişənin istinadlarını müqayisə edir.
//Müqayisə edilən dəyişənlər eyni yaddaş ünvanına işarə edərsə (null hal istisna olmaqla) doğru qaytarır. Yəni, əgər iki dəyişən
// eyni obyektə işarə edirsə, bu doğru qaytarır.
//== operatoru məzmuna əsaslanan müqayisələr etmir. İki fərqli obyektin məzmunu eyni olsa belə, onların istinadları
// fərqli olduqda false qaytarılır.
//Xülasə, equals() metodu məzmuna əsaslanan müqayisə aparır, == operatoru isə istinad əsaslı müqayisə edir. equals()
// metodu iki obyektin eyni məzmuna malik olub-olmadığını yoxlamaq üçün,
// \== operatoru isə iki dəyişənin eyni yaddaş ünvanına işarə edib-etmədiyini yoxlamaq üçün istifadə olunur.

    public class MyClass {
        public static int count; // static değişken

        public MyClass() {
            // constructor
        }

        public static void myMethod() {
            // static metot
        }
    }


