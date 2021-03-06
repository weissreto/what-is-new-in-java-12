package whatisnewin.java.lang.invoke;

import java.lang.invoke.MethodType;
import java.util.Optional;
import java.lang.constant.MethodTypeDesc;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link MethodType}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link MethodType} is an old class but has new fields, constructors or methods.
 * @since 1.7
 * @see MethodType
 */
public final class WhatIsNewInMethodType
{
  /**
   * Example call to new method {@link MethodType#descriptorString()}.
   * @since 12
   * @see MethodType#descriptorString()
   */
  public String descriptorString()
  {
    MethodType testee = $$$();

    String result = testee.descriptorString();
    return result;
  }

  /**
   * Example call to new method {@link MethodType#describeConstable()}.
   * @since 12
   * @see MethodType#describeConstable()
   */
  public Optional<MethodTypeDesc> describeConstable()
  {
    MethodType testee = $$$();

    Optional<MethodTypeDesc> result = testee.describeConstable();
    return result;
  }

  private MethodType $$$()
  {
    return null;
  }
}
