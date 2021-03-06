package whatisnewin.java.lang;

import java.util.Optional;
import java.lang.Enum.EnumDesc;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Enum}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link Enum} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see Enum
 */
public final class WhatIsNewInEnum<E extends Enum<E>>
{
  /**
   * Example call to new method {@link Enum#describeConstable()}.
   * @since 12
   * @see Enum#describeConstable()
   */
  public Optional<EnumDesc<E>> describeConstable()
  {
    Enum<E> testee = $$$();

    Optional<EnumDesc<E>> result = testee.describeConstable();
    return result;
  }

  private Enum<E> $$$()
  {
    return null;
  }
}
