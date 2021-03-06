package log4net.Layout;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import log4net.Layout.*;
import log4net.Core.*;
import jio.System.*;

public class RawTimeStampLayout implements IRawLayout {
  protected NObject javonetHandle;

  public RawTimeStampLayout() {
    try {
      javonetHandle = Javonet.New("log4net.Layout.RawTimeStampLayout");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RawTimeStampLayout(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object Format(LoggingEvent loggingEvent) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Layout.IRawLayout")
              .invoke("Format", loggingEvent);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
