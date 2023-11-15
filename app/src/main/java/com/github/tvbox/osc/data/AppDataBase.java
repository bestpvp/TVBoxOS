package com.github.tvbox.fengchu.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.github.tvbox.fengchu.cache.Cache;
import com.github.tvbox.fengchu.cache.CacheDao;
import com.github.tvbox.fengchu.cache.VodCollect;
import com.github.tvbox.fengchu.cache.VodCollectDao;
import com.github.tvbox.fengchu.cache.VodRecord;
import com.github.tvbox.fengchu.cache.VodRecordDao;


/**
 * 类描述:
 *
 * @author pj567
 * @since 2020/5/15
 */
@Database(entities = {Cache.class, VodRecord.class, VodCollect.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract CacheDao getCacheDao();

    public abstract VodRecordDao getVodRecordDao();

    public abstract VodCollectDao getVodCollectDao();
}
