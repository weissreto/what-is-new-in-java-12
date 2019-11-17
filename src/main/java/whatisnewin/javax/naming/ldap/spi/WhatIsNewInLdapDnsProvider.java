package whatisnewin.javax.naming.ldap.spi;

import javax.naming.ldap.spi.LdapDnsProvider;
import java.util.Optional;
import javax.naming.ldap.spi.LdapDnsProviderResult;
import java.util.Map;
import javax.naming.NamingException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link LdapDnsProvider}
 * that were newly introduced in Java version 12.<br>
 *
 * {@link LdapDnsProvider} is a completely new class.
 * @since 12
 * @see LdapDnsProvider
 */
public final class WhatIsNewInLdapDnsProvider
{
  /**
   * Example call to new method {@link LdapDnsProvider#lookupEndpoints(String, Map)}.
   * @since 12
   * @see LdapDnsProvider#lookupEndpoints(String, Map)
   */
  public Optional<LdapDnsProviderResult> lookupEndpoints(String url, Map<?, ?> env) throws NamingException
  {
    LdapDnsProvider testee = $$$();

    Optional<LdapDnsProviderResult> result = testee.lookupEndpoints(url, env);
    return result;
  }

  private LdapDnsProvider $$$()
  {
    return null;
  }
}
