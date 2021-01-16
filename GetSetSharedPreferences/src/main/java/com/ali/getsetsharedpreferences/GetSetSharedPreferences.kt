@file:Suppress("DEPRECATION")

package com.ali.getsetsharedpreferences

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager


/**
 * Created by Taiyab Ali on 17-Jan-21.
 */

class GetSetSharedPreferences {


    private var _preferences: SharedPreferences? = null
    private val _instance: Application? = null


    /**
     * Gets shared preferences.
     *
     * @return the shared preferences
     */
    fun getSharedPreferences(): SharedPreferences? {
        if (_preferences == null) _preferences =
            PreferenceManager.getDefaultSharedPreferences(_instance)
        return _preferences
    }


    //set methods
    fun setPreferences(key: String?, value: String?) {
        getSharedPreferences()!!.edit().putString(key, value).apply()
    }

    fun setPreferences(key: String?, value: Long) {
        getSharedPreferences()!!.edit().putLong(key, value).apply()
    }

    fun setPreferences(key: String?, value: Int) {
        getSharedPreferences()!!.edit().putInt(key, value).apply()
    }

    fun setPreferencesBoolean(key: String?, value: Boolean) {
        getSharedPreferences()!!.edit().putBoolean(key, value).apply()
    }

    //get methods
    fun getPrefranceData(key: String?): String? {
        return getSharedPreferences()!!.getString(key, "")
    }

    fun getPrefranceDataInt(key: String?): Int {
        return getSharedPreferences()!!.getInt(key, 0)
    }

    fun getPrefranceDataBoolean(key: String?): Boolean {
        return getSharedPreferences()!!.getBoolean(key, false)
    }

    fun getPrefranceDataLong(interval: String?): Long {
        return getSharedPreferences()!!.getLong(interval, 0)
    }
}