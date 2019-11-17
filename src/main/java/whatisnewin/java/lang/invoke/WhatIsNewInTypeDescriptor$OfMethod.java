package whatisnewin.java.lang.invoke;

import java.lang.invoke.TypeDescriptor.OfMethod;
import java.lang.invoke.TypeDescriptor.OfField;
import java.util.List;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link OfMethod}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link OfMethod} is a completely new class.
 * @since 12
 * @see OfMethod
 */
public final class WhatIsNewInTypeDescriptor$OfMethod<F extends OfField<F>, M extends OfMethod<F, M>>
{
  /**
   * Example call to new method {@link OfMethod#returnType()}.
   * @since 12
   * @see OfMethod#returnType()
   */
  public F returnType()
  {
    OfMethod<F, M> testee = $$$();

    F result = testee.returnType();
    return result;
  }

  /**
   * Example call to new method {@link OfMethod#changeParameterType(int, OfField)}.
   * @since 12
   * @see OfMethod#changeParameterType(int, OfField)
   */
  public M changeParameterType(int index, F paramType)
  {
    OfMethod<F, M> testee = $$$();

    M result = testee.changeParameterType(index, paramType);
    return result;
  }

  /**
   * Example call to new method {@link OfMethod#parameterList()}.
   * @since 12
   * @see OfMethod#parameterList()
   */
  public List<F> parameterList()
  {
    OfMethod<F, M> testee = $$$();

    List<F> result = testee.parameterList();
    return result;
  }

  /**
   * Example call to new method {@link OfMethod#insertParameterTypes(int, java.lang.invoke.TypeDescriptor.OfField[])}.
   * @since 12
   * @see OfMethod#insertParameterTypes(int, java.lang.invoke.TypeDescriptor.OfField[])
   */
  public M insertParameterTypes(int pos, F[] paramTypes)
  {
    OfMethod<F, M> testee = $$$();

    M result = testee.insertParameterTypes(pos, paramTypes);
    return result;
  }

  /**
   * Example call to new method {@link OfMethod#parameterCount()}.
   * @since 12
   * @see OfMethod#parameterCount()
   */
  public int parameterCount()
  {
    OfMethod<F, M> testee = $$$();

    int result = testee.parameterCount();
    return result;
  }

  /**
   * Example call to new method {@link OfMethod#changeReturnType(OfField)}.
   * @since 12
   * @see OfMethod#changeReturnType(OfField)
   */
  public M changeReturnType(F newReturn)
  {
    OfMethod<F, M> testee = $$$();

    M result = testee.changeReturnType(newReturn);
    return result;
  }

  /**
   * Example call to new method {@link OfMethod#parameterArray()}.
   * @since 12
   * @see OfMethod#parameterArray()
   */
  public F[] parameterArray()
  {
    OfMethod<F, M> testee = $$$();

    F[] result = testee.parameterArray();
    return result;
  }

  /**
   * Example call to new method {@link OfMethod#dropParameterTypes(int, int)}.
   * @since 12
   * @see OfMethod#dropParameterTypes(int, int)
   */
  public M dropParameterTypes(int start, int end)
  {
    OfMethod<F, M> testee = $$$();

    M result = testee.dropParameterTypes(start, end);
    return result;
  }

  /**
   * Example call to new method {@link OfMethod#parameterType(int)}.
   * @since 12
   * @see OfMethod#parameterType(int)
   */
  public F parameterType(int i)
  {
    OfMethod<F, M> testee = $$$();

    F result = testee.parameterType(i);
    return result;
  }

  private OfMethod $$$()
  {
    return null;
  }
}
