package com.businessapp.pictureidea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class OnePictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_picture)

        setTitle(R.string.app_main_name)

        val addButton: Button = findViewById(R.id.button)
        addButton.setOnClickListener(addAction)

        val saveButton: Button = findViewById(R.id.button1)
        saveButton.setOnClickListener(saveAction)
    }

    private val addAction = View.OnClickListener {
        val intent = Intent(application, TwoPictureActivity::class.java)
        startActivity(intent)
    }

    private val saveAction = View.OnClickListener {
        val intent = Intent(application, SaveActivity::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.savedItemButton -> {
                val intent = Intent(application, SavedListActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}