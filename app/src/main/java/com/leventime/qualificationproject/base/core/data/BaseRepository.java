package com.leventime.qualificationproject.base.core.data;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

/**
 * Base repository
 *
 * @author kv
 */
public interface BaseRepository{

    /**
     * Get string resource
     *
     * @param aResourceId resource id
     * @param aFormatArgs format args
     * @return string resource
     */
    String getStringResource(@StringRes int aResourceId, @NonNull Object... aFormatArgs);
}
