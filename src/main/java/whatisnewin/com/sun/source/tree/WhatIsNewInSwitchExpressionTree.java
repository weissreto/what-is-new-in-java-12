package whatisnewin.com.sun.source.tree;

import com.sun.source.tree.SwitchExpressionTree;
import com.sun.source.tree.ExpressionTree;
import java.util.List;
import com.sun.source.tree.CaseTree;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link SwitchExpressionTree}
 * that were newly introduced in Java versions 12.<br>
 *
 * {@link SwitchExpressionTree} is a completely new class
 * @since 12
 * @see SwitchExpressionTree
 */
public final class WhatIsNewInSwitchExpressionTree
{
  /**
   * Example call to new method {@link SwitchExpressionTree#getExpression}
   * @since 12
   * @see SwitchExpressionTree#getExpression
   */
  public ExpressionTree getExpression()
  {
    SwitchExpressionTree testee = $$$();

    ExpressionTree result = testee.getExpression();
    return result;
  }

  /**
   * Example call to new method {@link SwitchExpressionTree#getCases}
   * @since 12
   * @see SwitchExpressionTree#getCases
   */
  public List<? extends CaseTree> getCases()
  {
    SwitchExpressionTree testee = $$$();

    List<? extends CaseTree> result = testee.getCases();
    return result;
  }

  private SwitchExpressionTree $$$()
  {
    return null;
  }
}