package log4net.Filter;

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
import log4net.Filter.*;
import log4net.Core.*;

public class LevelRangeFilter extends FilterSkeleton implements IFilter, IOptionHandler {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAcceptOnMatch(java.lang.Boolean value) {
    try {
      javonetHandle.set("AcceptOnMatch", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAcceptOnMatch() {
    try {
      java.lang.Boolean res = javonetHandle.get("AcceptOnMatch");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setLevelMin(Level value) {
    try {
      javonetHandle.set("LevelMin", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Level getLevelMin() {
    try {
      Object res = javonetHandle.<NObject>get("LevelMin");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLevelMax(Level value) {
    try {
      javonetHandle.set("LevelMax", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Level getLevelMax() {
    try {
      Object res = javonetHandle.<NObject>get("LevelMax");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LevelRangeFilter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Filter.LevelRangeFilter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LevelRangeFilter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public FilterDecision Decide(LoggingEvent loggingEvent) {
    try {
      Object res =
          javonetHandle.explicitInterface("log4net.Filter.IFilter").invoke("Decide", loggingEvent);
      if (res == null) return null;
      return FilterDecision.valueOf(((NEnum) res).getValueName());
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
