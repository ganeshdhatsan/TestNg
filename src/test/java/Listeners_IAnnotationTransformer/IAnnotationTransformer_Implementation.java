package Listeners_IAnnotationTransformer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class IAnnotationTransformer_Implementation implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(IRetryAnalyzer_Implementation.class);
	}

//	@Override
//	public void transform(ITestAnnotation  annotation, Class testClass, Constructor testConstructor,
//			Method testMethod) {
//		annotation.setRetryAnalyzer(IRetryAnalyzer_Implementation.class);
//		
//
//	}
	
	
	

}
