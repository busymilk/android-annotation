package busymilk.annotation.activity;

import java.lang.annotation.Annotation;

public class AnnotationActivityUtil {
	
	public static  boolean hasAnnotation(Class clas,Class annotationClass){
		boolean has =false;
		Annotation a =clas.getAnnotation(annotationClass);
		return a==null?false:true;
	}
	
}
