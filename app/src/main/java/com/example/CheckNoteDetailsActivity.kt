package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notesapp.NOTE_KEY
import com.example.notesapp.databinding.ActivityCheckNoteDatailsBinding
import com.example.notesapp.models.Note

class CheckNoteDetailsActivity : AppCompatActivity() {

    private val binding: ActivityCheckNoteDatailsBinding by lazy {
        ActivityCheckNoteDatailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val note = intent.extras?.getSerializable(NOTE_KEY) as? Note
        initViews(note)
    }
    private fun initViews(note: Note?) {
        if (note == null) return
        binding.titleTextView.text = note.title
        binding.lastEditedTextView.text = "last edited" + note.lastEditedDate.toString()
        binding.firstCheckBox.isChecked = note.checkBoxIsCheckedList[0]
        binding.secondCheckBox.isChecked = note.checkBoxIsCheckedList[1]
        binding.thirdCheckBox.isChecked = note.checkBoxIsCheckedList[2]
        binding.fourCheckBox.isChecked = note.checkBoxIsCheckedList[3]
        binding.fifeCheckBox.isChecked = note.checkBoxIsCheckedList[4]
        binding.sixthCheckBox.isChecked = note.checkBoxIsCheckedList[5]

        

    }


}
