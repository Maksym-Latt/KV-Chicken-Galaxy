package com.chicken.galaxy.data.settings

interface SettingsRepository {
    fun getMusicVolume(): Int
    fun getSoundVolume(): Int

    fun setMusicVolume(value: Int)
    fun setSoundVolume(value: Int)
}