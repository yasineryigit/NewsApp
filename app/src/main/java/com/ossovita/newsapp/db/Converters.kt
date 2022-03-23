package com.ossovita.newsapp.db

import androidx.room.TypeConverter
import com.ossovita.newsapp.model.Source

//Article içindeki Source objesini room'a kaydederken string ve değeri name property'si olarak kaydetmek için converter class
class Converters {


    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }

}