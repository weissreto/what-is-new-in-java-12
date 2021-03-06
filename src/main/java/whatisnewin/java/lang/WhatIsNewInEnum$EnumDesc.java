package whatisnewin.java.lang;

import java.lang.Enum.EnumDesc;
import java.lang.constant.ClassDesc;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link EnumDesc}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link EnumDesc} is a completely new class.
 * @since 12
 * @see EnumDesc
 */
public final class WhatIsNewInEnum$EnumDesc<E extends Enum<E>>
{
  /**
   * Example call to new method {@link EnumDesc#of(ClassDesc, String)}.
   * @since 12
   * @see EnumDesc#of(ClassDesc, String)
   */
  public static <E extends Enum<E>> EnumDesc<E> of(ClassDesc enumClass, String constantName)
  {
    EnumDesc<E> result = EnumDesc.of(enumClass, constantName);
    return result;
  }

}
