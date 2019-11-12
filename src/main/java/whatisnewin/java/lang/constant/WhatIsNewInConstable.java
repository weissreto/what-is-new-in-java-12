package whatisnewin.java.lang.constant;

import java.lang.constant.Constable;
import java.util.Optional;
import java.lang.constant.ConstantDesc;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Constable}
 * that were newly introduced in Java versions 12.<br>
 *
 * {@link Constable} is a completely new class
 * @since 12
 * @see Constable
 */
public final class WhatIsNewInConstable
{
  /**
   * Example call to new method {@link Constable#describeConstable}
   * @since 12
   * @see Constable#describeConstable
   */
  public Optional<? extends ConstantDesc> describeConstable()
  {
    Constable testee = $$$();

    Optional<? extends ConstantDesc> result = testee.describeConstable();
    return result;
  }

  private Constable $$$()
  {
    return null;
  }
}