package eu.sergiobelli.jworkcons.be.orm;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

public class BaseSqlMapDao extends SqlMapClientTemplate {
	protected static final int PAGE_SIZE = 4;
}
