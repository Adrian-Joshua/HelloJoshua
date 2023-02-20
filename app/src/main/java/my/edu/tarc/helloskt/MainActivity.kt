package my.edu.tarc.helloskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.accessibility.AccessibilityViewCommand.MoveWindowArguments
import androidx.core.view.isVisible

//Instance Name : Type / Class name
class MainActivity : AppCompatActivity() {
    //onCreate = main function

    lateinit var imageQr: ImageView
    lateinit var nameText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton:Button = findViewById(R.id.show_button)
        val hideButton:Button = findViewById(R.id.hide_button)
        imageQr = findViewById(R.id.imageView)
        nameText = findViewById(R.id.name_text)

        showButton.setOnClickListener {
            showQr()
        }

        hideButton.setOnClickListener {
            hideQr()
        }

    }

    private fun showQr(){

        imageQr.visibility = View.VISIBLE

    }

    private fun hideQr(){

        imageQr.visibility = View.INVISIBLE
    }




}