package com.example.notesapp.models

import java.io.Serializable
import java.util.Date

data class Note(
    // данные для Simple note item
     val title: String, //общее
     val lastEditedDate: Date,//общее
     val description: String,
     val isSimpleNote: Boolean,

     // данные для Check box note item


     val checkBoxIsCheckedList: List<Boolean>,
     val checkBoxTilesList: List<String>
     ): Serializable
