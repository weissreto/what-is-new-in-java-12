package whatisnewin.java.text;

import java.text.CompactNumberFormat;
import java.text.DecimalFormatSymbols;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.math.RoundingMode;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link CompactNumberFormat}
 * that were newly introduced in Java versions 12.<br>
 *
 * {@link CompactNumberFormat} is a completely new class
 * @since 12
 * @see CompactNumberFormat
 */
public final class WhatIsNewInCompactNumberFormat
{
  /**
   * Example call to new constructor {@link CompactNumberFormat#CompactNumberFormat}
   * @since 12
   * @see CompactNumberFormat#CompactNumberFormat
   */
  public WhatIsNewInCompactNumberFormat(String decimalPattern, DecimalFormatSymbols symbols, String[] compactPatterns)
  {
    CompactNumberFormat testee = new CompactNumberFormat(decimalPattern, symbols, compactPatterns);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setGroupingUsed}
   * @since 12
   * @see CompactNumberFormat#setGroupingUsed
   */
  public void setGroupingUsed(boolean newValue)
  {
    CompactNumberFormat testee = $$$();

    testee.setGroupingUsed(newValue);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#getGroupingSize}
   * @since 12
   * @see CompactNumberFormat#getGroupingSize
   */
  public int getGroupingSize()
  {
    CompactNumberFormat testee = $$$();

    int result = testee.getGroupingSize();
    return result;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setParseBigDecimal}
   * @since 12
   * @see CompactNumberFormat#setParseBigDecimal
   */
  public void setParseBigDecimal(boolean newValue)
  {
    CompactNumberFormat testee = $$$();

    testee.setParseBigDecimal(newValue);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#formatToCharacterIterator}
   * @since 12
   * @see CompactNumberFormat#formatToCharacterIterator
   */
  public AttributedCharacterIterator formatToCharacterIterator(Object obj)
  {
    CompactNumberFormat testee = $$$();

    AttributedCharacterIterator result = testee.formatToCharacterIterator(obj);
    return result;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setGroupingSize}
   * @since 12
   * @see CompactNumberFormat#setGroupingSize
   */
  public void setGroupingSize(int newValue)
  {
    CompactNumberFormat testee = $$$();

    testee.setGroupingSize(newValue);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#isGroupingUsed}
   * @since 12
   * @see CompactNumberFormat#isGroupingUsed
   */
  public boolean isGroupingUsed()
  {
    CompactNumberFormat testee = $$$();

    boolean result = testee.isGroupingUsed();
    return result;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setMaximumIntegerDigits}
   * @since 12
   * @see CompactNumberFormat#setMaximumIntegerDigits
   */
  public void setMaximumIntegerDigits(int newValue)
  {
    CompactNumberFormat testee = $$$();

    testee.setMaximumIntegerDigits(newValue);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#format}
   * @since 12
   * @see CompactNumberFormat#format
   */
  public StringBuffer format(Object number, StringBuffer toAppendTo, FieldPosition fieldPosition)
  {
    CompactNumberFormat testee = $$$();

    StringBuffer result = testee.format(number, toAppendTo, fieldPosition);
    return result;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#format}
   * @since 12
   * @see CompactNumberFormat#format
   */
  public StringBuffer format(double number, StringBuffer result, FieldPosition fieldPosition)
  {
    CompactNumberFormat testee = $$$();

    StringBuffer result1 = testee.format(number, result, fieldPosition);
    return result1;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#format}
   * @since 12
   * @see CompactNumberFormat#format
   */
  public StringBuffer format(long number, StringBuffer result, FieldPosition fieldPosition)
  {
    CompactNumberFormat testee = $$$();

    StringBuffer result1 = testee.format(number, result, fieldPosition);
    return result1;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#parse}
   * @since 12
   * @see CompactNumberFormat#parse
   */
  public Number parse(String text, ParsePosition pos)
  {
    CompactNumberFormat testee = $$$();

    Number result = testee.parse(text, pos);
    return result;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setMinimumFractionDigits}
   * @since 12
   * @see CompactNumberFormat#setMinimumFractionDigits
   */
  public void setMinimumFractionDigits(int newValue)
  {
    CompactNumberFormat testee = $$$();

    testee.setMinimumFractionDigits(newValue);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#getRoundingMode}
   * @since 12
   * @see CompactNumberFormat#getRoundingMode
   */
  public RoundingMode getRoundingMode()
  {
    CompactNumberFormat testee = $$$();

    RoundingMode result = testee.getRoundingMode();
    return result;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#isParseBigDecimal}
   * @since 12
   * @see CompactNumberFormat#isParseBigDecimal
   */
  public boolean isParseBigDecimal()
  {
    CompactNumberFormat testee = $$$();

    boolean result = testee.isParseBigDecimal();
    return result;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setMinimumIntegerDigits}
   * @since 12
   * @see CompactNumberFormat#setMinimumIntegerDigits
   */
  public void setMinimumIntegerDigits(int newValue)
  {
    CompactNumberFormat testee = $$$();

    testee.setMinimumIntegerDigits(newValue);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setParseIntegerOnly}
   * @since 12
   * @see CompactNumberFormat#setParseIntegerOnly
   */
  public void setParseIntegerOnly(boolean value)
  {
    CompactNumberFormat testee = $$$();

    testee.setParseIntegerOnly(value);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setMaximumFractionDigits}
   * @since 12
   * @see CompactNumberFormat#setMaximumFractionDigits
   */
  public void setMaximumFractionDigits(int newValue)
  {
    CompactNumberFormat testee = $$$();

    testee.setMaximumFractionDigits(newValue);
  }

  /**
   * Example call to new method {@link CompactNumberFormat#isParseIntegerOnly}
   * @since 12
   * @see CompactNumberFormat#isParseIntegerOnly
   */
  public boolean isParseIntegerOnly()
  {
    CompactNumberFormat testee = $$$();

    boolean result = testee.isParseIntegerOnly();
    return result;
  }

  /**
   * Example call to new method {@link CompactNumberFormat#setRoundingMode}
   * @since 12
   * @see CompactNumberFormat#setRoundingMode
   */
  public void setRoundingMode(RoundingMode roundingMode)
  {
    CompactNumberFormat testee = $$$();

    testee.setRoundingMode(roundingMode);
  }

  private CompactNumberFormat $$$()
  {
    return null;
  }
}