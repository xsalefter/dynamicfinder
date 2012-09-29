package org.xsalefter.finder4j.jpa.handler;

/**
 * @author xsalefter (xsalefter@gmail.com)
 */
public class LikeRestrictionHandler extends LikeComparatorRestrictionHandler {

	private static final String PREFIX = "'%',";
	private static final String POSTFIX = ",'%'";

	public LikeRestrictionHandler(final String entityAliasName) {
		super(entityAliasName, PREFIX, POSTFIX);
	}

}
