package com.businessapp.pictureidea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class TwoPictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_picture)

        setTitle(R.string.app_main_name)

        val decrementButton: Button = findViewById(R.id.button4)
        decrementButton.setOnClickListener(decrementAction)

        val saveButton: Button = findViewById(R.id.button5)
        saveButton.setOnClickListener(saveAction)
    }

    private val decrementAction = View.OnClickListener { finish() }

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