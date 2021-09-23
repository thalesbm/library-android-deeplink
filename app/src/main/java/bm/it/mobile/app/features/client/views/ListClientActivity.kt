package bm.it.mobile.app.features.client.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ListClientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "ListClientActivity", Toast.LENGTH_LONG).show()
    }
}
