package whatisnewin.java.lang.constant;

import java.lang.constant.DynamicCallSiteDesc;
import java.lang.constant.MethodTypeDesc;
import java.lang.constant.MethodHandleDesc;
import java.lang.constant.ConstantDesc;
import java.lang.constant.DirectMethodHandleDesc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles.Lookup;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link DynamicCallSiteDesc}
 * that were newly introduced in Java versions 12.<br>
 *
 * {@link DynamicCallSiteDesc} is a completely new class
 * @since 12
 * @see DynamicCallSiteDesc
 */
public final class WhatIsNewInDynamicCallSiteDesc
{
  /**
   * Example call to new method {@link DynamicCallSiteDesc#invocationType}
   * @since 12
   * @see DynamicCallSiteDesc#invocationType
   */
  public MethodTypeDesc invocationType()
  {
    DynamicCallSiteDesc testee = $$$();

    MethodTypeDesc result = testee.invocationType();
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#invocationName}
   * @since 12
   * @see DynamicCallSiteDesc#invocationName
   */
  public String invocationName()
  {
    DynamicCallSiteDesc testee = $$$();

    String result = testee.invocationName();
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#bootstrapMethod}
   * @since 12
   * @see DynamicCallSiteDesc#bootstrapMethod
   */
  public MethodHandleDesc bootstrapMethod()
  {
    DynamicCallSiteDesc testee = $$$();

    MethodHandleDesc result = testee.bootstrapMethod();
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#withArgs}
   * @since 12
   * @see DynamicCallSiteDesc#withArgs
   */
  public DynamicCallSiteDesc withArgs(ConstantDesc[] bootstrapArgs)
  {
    DynamicCallSiteDesc testee = $$$();

    DynamicCallSiteDesc result = testee.withArgs(bootstrapArgs);
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#of}
   * @since 12
   * @see DynamicCallSiteDesc#of
   */
  public static DynamicCallSiteDesc of(DirectMethodHandleDesc bootstrapMethod, String invocationName, MethodTypeDesc invocationType, ConstantDesc[] bootstrapArgs)
  {
    DynamicCallSiteDesc result = DynamicCallSiteDesc.of(bootstrapMethod, invocationName, invocationType, bootstrapArgs);
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#of}
   * @since 12
   * @see DynamicCallSiteDesc#of
   */
  public static DynamicCallSiteDesc of(DirectMethodHandleDesc bootstrapMethod, String invocationName, MethodTypeDesc invocationType)
  {
    DynamicCallSiteDesc result = DynamicCallSiteDesc.of(bootstrapMethod, invocationName, invocationType);
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#of}
   * @since 12
   * @see DynamicCallSiteDesc#of
   */
  public static DynamicCallSiteDesc of(DirectMethodHandleDesc bootstrapMethod, MethodTypeDesc invocationType)
  {
    DynamicCallSiteDesc result = DynamicCallSiteDesc.of(bootstrapMethod, invocationType);
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#bootstrapArgs}
   * @since 12
   * @see DynamicCallSiteDesc#bootstrapArgs
   */
  public ConstantDesc[] bootstrapArgs()
  {
    DynamicCallSiteDesc testee = $$$();

    ConstantDesc[] result = testee.bootstrapArgs();
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#resolveCallSiteDesc}
   * @since 12
   * @see DynamicCallSiteDesc#resolveCallSiteDesc
   */
  public CallSite resolveCallSiteDesc(Lookup lookup) throws Throwable
  {
    DynamicCallSiteDesc testee = $$$();

    CallSite result = testee.resolveCallSiteDesc(lookup);
    return result;
  }

  /**
   * Example call to new method {@link DynamicCallSiteDesc#withNameAndType}
   * @since 12
   * @see DynamicCallSiteDesc#withNameAndType
   */
  public DynamicCallSiteDesc withNameAndType(String invocationName, MethodTypeDesc invocationType)
  {
    DynamicCallSiteDesc testee = $$$();

    DynamicCallSiteDesc result = testee.withNameAndType(invocationName, invocationType);
    return result;
  }

  private DynamicCallSiteDesc $$$()
  {
    return null;
  }
}
