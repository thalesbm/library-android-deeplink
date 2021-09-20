package bm.it.mobile.app.features.user.views

import android.os.Bundle
import android.widget.Toast
import bm.it.mobile.app.commons.BaseActivity

class RemoveUserActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "RemoveUserActivity", Toast.LENGTH_LONG).show()
    }
}
