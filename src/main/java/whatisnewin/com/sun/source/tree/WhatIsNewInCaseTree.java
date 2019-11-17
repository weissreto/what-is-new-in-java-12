package whatisnewin.com.sun.source.tree;

import com.sun.source.tree.CaseTree;
import java.util.List;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.Tree;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link CaseTree}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link CaseTree} is an old class but has new fields, constructors or methods.
 * @since 1.6
 * @see CaseTree
 */
public final class WhatIsNewInCaseTree
{
  /**
   * Example call to new method {@link CaseTree#getExpressions()}.
   * @since 12
   * @see CaseTree#getExpressions()
   */
  public List<? extends ExpressionTree> getExpressions()
  {
    CaseTree testee = $$$();

    List<? extends ExpressionTree> result = testee.getExpressions();
    return result;
  }

  /**
   * Example call to new method {@link CaseTree#getBody()}.
   * @since 12
   * @see CaseTree#getBody()
   */
  public Tree getBody()
  {
    CaseTree testee = $$$();

    Tree result = testee.getBody();
    return result;
  }

  private CaseTree $$$()
  {
    return null;
  }
}
