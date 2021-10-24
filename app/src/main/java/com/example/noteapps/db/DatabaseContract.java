package com.example.noteapps.db;

import android.provider.BaseColumns;

public class DatabaseContract {

    public static final class NoteColumns implements BaseColumns {
       public static final String TABLE_NAME = "note";

        public static String TITLE = "TITLE";
        public static String DESCRIPTION = "DESCRIPTION";
        public static String DATE = "DATE";
    }
}
