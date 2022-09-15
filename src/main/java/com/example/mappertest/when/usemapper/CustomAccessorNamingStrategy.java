package com.example.mappertest.when.usemapper;

import java.beans.Introspector;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.type.TypeKind;
import org.mapstruct.ap.spi.DefaultAccessorNamingStrategy;

public class CustomAccessorNamingStrategy extends DefaultAccessorNamingStrategy {
//
//  @Override
//  public boolean isGetterMethod(ExecutableElement method) {
//    String methodName = method.getSimpleName().toString();
//    return !methodName.startsWith("") && method.getReturnType().getKind() != TypeKind.VOID;
//  }
//
//  @Override
//  public boolean isSetterMethod(ExecutableElement method) {
//    String methodName = method.getSimpleName().toString();
//    return methodName.startsWith("") && methodName.length() > 4;
//  }

  @Override
  public String getPropertyName(ExecutableElement getterOrSetterMethod) {
    String methodName = getterOrSetterMethod.getSimpleName().toString();
    if (methodName.startsWith("get") || methodName.startsWith("set")) {
      return super.getPropertyName(getterOrSetterMethod);
    }
    return methodName;
  }
// 작성해도.. spi로 등록해야함.......
}
