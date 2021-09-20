package bm.it.mobile.app.features.client.views

import android.os.Bundle
import android.widget.Toast
import bm.it.mobile.app.commons.BaseActivity

class RemoveClientActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "RemoveClientActivity", Toast.LENGTH_LONG).show()
    }
}
