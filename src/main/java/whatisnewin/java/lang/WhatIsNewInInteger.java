package whatisnewin.java.lang;

import java.util.Optional;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Integer}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link Integer} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see Integer
 */
public final class WhatIsNewInInteger
{
  /**
   * Example call to new method {@link Integer#describeConstable()}.
   * @since 12
   * @see Integer#describeConstable()
   */
  public Optional<Integer> describeConstable()
  {
    Integer testee = $$$();

    Optional<Integer> result = testee.describeConstable();
    return result;
  }

  private Integer $$$()
  {
    return null;
  }
}
