package whatisnewin.java.text;

import java.text.NumberFormat;
import java.util.Locale;
import java.text.NumberFormat.Style;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link NumberFormat}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link NumberFormat} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see NumberFormat
 */
public final class WhatIsNewInNumberFormat
{
  /**
   * Example call to new method {@link NumberFormat#getCompactNumberInstance()}.
   * @since 12
   * @see NumberFormat#getCompactNumberInstance()
   */
  public static NumberFormat getCompactNumberInstance()
  {
    NumberFormat result = NumberFormat.getCompactNumberInstance();
    return result;
  }

  /**
   * Example call to new method {@link NumberFormat#getCompactNumberInstance(Locale, Style)}.
   * @since 12
   * @see NumberFormat#getCompactNumberInstance(Locale, Style)
   */
  public static NumberFormat getCompactNumberInstance(Locale locale, Style formatStyle)
  {
    NumberFormat result = NumberFormat.getCompactNumberInstance(locale, formatStyle);
    return result;
  }

}
