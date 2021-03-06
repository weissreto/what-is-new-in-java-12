package whatisnewin.com.sun.source.tree;

import com.sun.source.tree.TreeVisitor;
import com.sun.source.tree.SwitchExpressionTree;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link TreeVisitor}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link TreeVisitor} is an old class but has new fields, constructors or methods.
 * @since 1.6
 * @see TreeVisitor
 */
public final class WhatIsNewInTreeVisitor<R, P>
{
  /**
   * Example call to new method {@link TreeVisitor#visitSwitchExpression(SwitchExpressionTree, Object)}.
   * @since 12
   * @see TreeVisitor#visitSwitchExpression(SwitchExpressionTree, Object)
   */
  public R visitSwitchExpression(SwitchExpressionTree node, P p)
  {
    TreeVisitor<R, P> testee = $$$();

    R result = testee.visitSwitchExpression(node, p);
    return result;
  }

  private TreeVisitor<R, P> $$$()
  {
    return null;
  }
}
