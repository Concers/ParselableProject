package com.ovologos.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*
import java.io.Serializable


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     15/02/2020 - 20:24     ║
╚════════════════════════════╝
 */

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        btnOpenMainActivity.text = "asdfsaf"
        btnOpenMainActivity.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            val userProfileStruct = object : Serializable{
                val keyName: String = "Gökhan"
                val keyAge: Int = 29
                val keyIsMale: Boolean = true
            }


            val userProfile = UserProfile("Gökhan",29,true)

//            intent.putExtra("KEY_NAME", userProfile.keyName)
//            intent.putExtra(UserProfileType.KEY_NAME.name, userProfile.keyName)
//
//            val bundle = Bundle()
//            bundle.putInt(UserProfileType.KEY_AGE.name, userProfile.keyAge)
//            bundle.putBoolean(UserProfileType.KEY_IS_MALE.name, userProfile.keyIsMale)
//            intent.putExtras(bundle)


            intent.putExtra("keyUserProfile", userProfile)
            intent.putExtra("adasd", userProfileStruct)

            startActivity(intent)
            finish()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

}