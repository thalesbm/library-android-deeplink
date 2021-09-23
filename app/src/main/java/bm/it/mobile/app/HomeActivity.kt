package bm.it.mobile.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bm.it.mobile.library.BMDeeplinkBuilder

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onResume() {
        super.onResume()

        BMDeeplinkBuilder.Builder()
            .redirectTo(deeplinkUri = intent?.data)
            .build()
            .init()
    }
}
