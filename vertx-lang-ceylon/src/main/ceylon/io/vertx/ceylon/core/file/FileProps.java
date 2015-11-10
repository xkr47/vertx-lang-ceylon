package io.vertx.ceylon.core.file;

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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class FileProps implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.file.FileProps, FileProps> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.file.FileProps, FileProps>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileProps, FileProps> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.file.FileProps, FileProps>() {
        public FileProps convert(io.vertx.core.file.FileProps src) {
          return new FileProps(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<FileProps, io.vertx.core.file.FileProps> TO_JAVA = new io.vertx.lang.ceylon.Converter<FileProps, io.vertx.core.file.FileProps>() {
    public io.vertx.core.file.FileProps convert(FileProps src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(FileProps.class);
  @Ignore private final io.vertx.core.file.FileProps delegate;

  public FileProps(io.vertx.core.file.FileProps delegate) {
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long creationTime() {
    long ret = delegate.creationTime();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long lastAccessTime() {
    long ret = delegate.lastAccessTime();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long lastModifiedTime() {
    long ret = delegate.lastModifiedTime();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isDirectory() {
    boolean ret = delegate.isDirectory();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isOther() {
    boolean ret = delegate.isOther();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isRegularFile() {
    boolean ret = delegate.isRegularFile();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isSymbolicLink() {
    boolean ret = delegate.isSymbolicLink();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

}