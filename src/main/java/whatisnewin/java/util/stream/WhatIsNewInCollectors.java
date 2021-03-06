package whatisnewin.java.util.stream;

import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.function.BiFunction;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Collectors}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link Collectors} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see Collectors
 */
public final class WhatIsNewInCollectors
{
  /**
   * Example call to new method {@link Collectors#teeing(Collector, Collector, BiFunction)}.
   * @since 12
   * @see Collectors#teeing(Collector, Collector, BiFunction)
   */
  public static <T, R1, R2, R> Collector<T, ?, R> teeing(Collector<? super T, ?, R1> downstream1, Collector<? super T, ?, R2> downstream2, BiFunction<? super R1, ? super R2, R> merger)
  {
    Collector<T, ?, R> result = Collectors.teeing(downstream1, downstream2, merger);
    return result;
  }

}
