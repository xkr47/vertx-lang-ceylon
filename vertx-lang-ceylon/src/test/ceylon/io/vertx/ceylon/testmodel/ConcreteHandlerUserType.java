package io.vertx.ceylon.testmodel;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "")
public class ConcreteHandlerUserType implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.ConcreteHandlerUserType, ConcreteHandlerUserType> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.ConcreteHandlerUserType, ConcreteHandlerUserType>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.ConcreteHandlerUserType, ConcreteHandlerUserType> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.ConcreteHandlerUserType, ConcreteHandlerUserType>() {
        public ConcreteHandlerUserType convert(io.vertx.codegen.testmodel.ConcreteHandlerUserType src) {
          return new ConcreteHandlerUserType(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ConcreteHandlerUserType, io.vertx.codegen.testmodel.ConcreteHandlerUserType> TO_JAVA = new io.vertx.lang.ceylon.Converter<ConcreteHandlerUserType, io.vertx.codegen.testmodel.ConcreteHandlerUserType>() {
    public io.vertx.codegen.testmodel.ConcreteHandlerUserType convert(ConcreteHandlerUserType src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ConcreteHandlerUserType.class);
  @Ignore private final io.vertx.codegen.testmodel.ConcreteHandlerUserType delegate;

  public ConcreteHandlerUserType(io.vertx.codegen.testmodel.ConcreteHandlerUserType delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("arg0")  RefedInterface1 arg0) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

}
