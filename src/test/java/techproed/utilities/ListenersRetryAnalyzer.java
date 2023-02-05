package techproed.utilities;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
1. Failed test caseleri tekrar run etme islemini testNG xml file ile tum test caselere automatic olarak uygulayabiliriz.
Util class olustur : ListenersRetryAnalyzer
Implement IAnnotationTransformer interface
transform metotunu olustur
Metot da setRetryAnalyzer kullan: annotation.setRetryAnalyzer(ListenersRetry.class)
2. xml file da bu util classi test caselerle ilişkilerdir
<listeners>
    <listener class-name=“techproed.utilities.ListenersRetryAnalyzer"></listener>
</listeners>
3. When I run this class

 */
public class ListenersRetryAnalyzer implements IAnnotationTransformer {

    //    Bu sinifin amaci, TUM FAILE TEST CASELERI BIR KEZ DAHA AUTOMATIK OLARAK XML FILE ILE RUN ETMEK
    // BU SINIF ListenersRetry sınıfını xml de kulanılabılmek ıcın olusturuldu
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
//        Bu sinif ListenersRetry util classina baglidir
        annotation.setRetryAnalyzer(ListenersRetry.class);
    }
}