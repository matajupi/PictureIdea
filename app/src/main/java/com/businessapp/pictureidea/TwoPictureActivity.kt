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

        var decrementButton: Button = findViewById(R.id.button4)
        decrementButton.setOnClickListener(decrementAction)
    }

    val decrementAction = object:View.OnClickListener {
        override fun onClick(v: View?) {
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.savedItemButton -> {
                var intent: Intent = Intent(application, SavedListActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}