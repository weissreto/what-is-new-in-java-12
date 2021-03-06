package whatisnewin.java.util.concurrent;

import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.concurrent.Executor;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link CompletionStage}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link CompletionStage} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see CompletionStage
 */
public final class WhatIsNewInCompletionStage<T>
{
  /**
   * Example call to new method {@link CompletionStage#exceptionallyAsync(Function)}.
   * @since 12
   * @see CompletionStage#exceptionallyAsync(Function)
   */
  public CompletionStage<T> exceptionallyAsync(Function<Throwable, ? extends T> fn)
  {
    CompletionStage<T> testee = $$$();

    CompletionStage<T> result = testee.exceptionallyAsync(fn);
    return result;
  }

  /**
   * Example call to new method {@link CompletionStage#exceptionallyAsync(Function, Executor)}.
   * @since 12
   * @see CompletionStage#exceptionallyAsync(Function, Executor)
   */
  public CompletionStage<T> exceptionallyAsync(Function<Throwable, ? extends T> fn, Executor executor)
  {
    CompletionStage<T> testee = $$$();

    CompletionStage<T> result = testee.exceptionallyAsync(fn, executor);
    return result;
  }

  /**
   * Example call to new method {@link CompletionStage#exceptionallyCompose(Function)}.
   * @since 12
   * @see CompletionStage#exceptionallyCompose(Function)
   */
  public CompletionStage<T> exceptionallyCompose(Function<Throwable, ? extends CompletionStage<T>> fn)
  {
    CompletionStage<T> testee = $$$();

    CompletionStage<T> result = testee.exceptionallyCompose(fn);
    return result;
  }

  /**
   * Example call to new method {@link CompletionStage#exceptionallyComposeAsync(Function)}.
   * @since 12
   * @see CompletionStage#exceptionallyComposeAsync(Function)
   */
  public CompletionStage<T> exceptionallyComposeAsync(Function<Throwable, ? extends CompletionStage<T>> fn)
  {
    CompletionStage<T> testee = $$$();

    CompletionStage<T> result = testee.exceptionallyComposeAsync(fn);
    return result;
  }

  /**
   * Example call to new method {@link CompletionStage#exceptionallyComposeAsync(Function, Executor)}.
   * @since 12
   * @see CompletionStage#exceptionallyComposeAsync(Function, Executor)
   */
  public CompletionStage<T> exceptionallyComposeAsync(Function<Throwable, ? extends CompletionStage<T>> fn, Executor executor)
  {
    CompletionStage<T> testee = $$$();

    CompletionStage<T> result = testee.exceptionallyComposeAsync(fn, executor);
    return result;
  }

  private CompletionStage<T> $$$()
  {
    return null;
  }
}
