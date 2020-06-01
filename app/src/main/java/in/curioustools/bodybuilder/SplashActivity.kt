package `in`.curioustools.bodybuilder

import `in`.curioustools.bodybuilder.screens.dashboard.DashBoardActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    companion object{
        const val TAG="SplashActivity>>"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread {
            try {
                Thread.sleep(500)
                runOnUiThread {startActivity(Intent(this@SplashActivity,
                    DashBoardActivity::class.java))}
            } catch (e:Exception){
                Log.e(TAG, "onCreate: ${e.message}" )
                e.printStackTrace()
            }
        }.start()



    }
}


