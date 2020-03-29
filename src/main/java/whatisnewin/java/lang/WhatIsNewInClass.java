package whatisnewin.java.lang;

import java.util.Optional;
import java.lang.constant.ClassDesc;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Class}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link Class} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see Class
 */
public final class WhatIsNewInClass<T>
{
  /**
   * Example call to new method {@link Class#descriptorString()}.
   * @since 12
   * @see Class#descriptorString()
   */
  public String descriptorString()
  {
    Class<T> testee = $$$();

    String result = testee.descriptorString();
    return result;
  }

  /**
   * Example call to new method {@link Class#componentType()}.
   * @since 12
   * @see Class#componentType()
   */
  public Class<?> componentType()
  {
    Class<T> testee = $$$();

    Class<?> result = testee.componentType();
    return result;
  }

  /**
   * Example call to new method {@link Class#arrayType()}.
   * @since 12
   * @see Class#arrayType()
   */
  public Class<?> arrayType()
  {
    Class<T> testee = $$$();

    Class<?> result = testee.arrayType();
    return result;
  }

  /**
   * Example call to new method {@link Class#describeConstable()}.
   * @since 12
   * @see Class#describeConstable()
   */
  public Optional<ClassDesc> describeConstable()
  {
    Class<T> testee = $$$();

    Optional<ClassDesc> result = testee.describeConstable();
    return result;
  }

  private Class<T> $$$()
  {
    return null;
  }
}
