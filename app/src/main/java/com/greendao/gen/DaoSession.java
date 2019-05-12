package com.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.greendao.gen.bean.ZipFileData;

import com.greendao.gen.ZipFileDataDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig zipFileDataDaoConfig;

    private final ZipFileDataDao zipFileDataDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        zipFileDataDaoConfig = daoConfigMap.get(ZipFileDataDao.class).clone();
        zipFileDataDaoConfig.initIdentityScope(type);

        zipFileDataDao = new ZipFileDataDao(zipFileDataDaoConfig, this);

        registerDao(ZipFileData.class, zipFileDataDao);
    }
    
    public void clear() {
        zipFileDataDaoConfig.clearIdentityScope();
    }

    public ZipFileDataDao getZipFileDataDao() {
        return zipFileDataDao;
    }

}