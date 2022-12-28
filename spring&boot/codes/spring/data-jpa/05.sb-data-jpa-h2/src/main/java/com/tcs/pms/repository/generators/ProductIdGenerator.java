package com.tcs.pms.repository.generators;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ProductIdGenerator implements IdentifierGenerator {
	static int pid = 1000;
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {		
		return "RIL_"+(++pid);
	}

}
