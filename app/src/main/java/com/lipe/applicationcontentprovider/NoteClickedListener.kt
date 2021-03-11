package com.lipe.applicationcontentprovider

import android.database.Cursor

//Resposável pelas ações de clicks dentro do adapter
interface NoteClickedListener {

    fun noteClickedItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}