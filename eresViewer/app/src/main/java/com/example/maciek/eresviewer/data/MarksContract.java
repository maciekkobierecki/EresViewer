package com.example.maciek.eresviewer.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Adrian on 2017-07-14.
 */

// Kontrakt bazy danych
public final class MarksContract {
    /**
     * The "Content authority" is a name for the entire content provider, similar to the
     * relationship between a domain name and its website.  A convenient string to use for the
     * content authority is the package name for the app, which is guaranteed to be unique on the
     * device.
     */
    public static final String CONTENT_AUTHORITY = "com.example.maciek.eresviewer";
    /**
     * Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
     * the content provider.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    /**
     * Possible path (appended to base content URI for possible URI's)
     * For instance, content://com.example.android.pets/pets/ is a valid path for
     * looking at pet data. content://com.example.android.pets/staff/ will fail,
     * as the ContentProvider hasn't been given any information on what to do with "staff".
     */
    public static final String PATH_MARKS = "marks";
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.

    private MarksContract() {
    }

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static abstract class MarksEntry implements BaseColumns {
        /**
         * The content URI to access the pet data in the provider
         */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_MARKS);


        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MARKS;


        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MARKS;


        public static final String TABLE_NAME = "marks";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_SUBJECT = "subject";
        public static final String COLUMN_MARK_TITLE = "mark_title";
        public static final String COLUMN_MY_MARK = "my_mark";
        public static final String COLUMN_LOWER_MARK = "lower_mark";
        public static final String COLUMN_AVEREGE_MARK = "averege_mark";
        public static final String COLUMN_HIGHER_MARK = "higher_mark";
        public static final String COLUMN_AMOUNT_OF_MARKS = "amount_of_marks";


    }
}
