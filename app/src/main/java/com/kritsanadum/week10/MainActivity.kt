package com.kritsanadum.week10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count =  0
    var context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_up.setOnClickListener {

            count += 1

            tv_result.text = ""+count

        }
        btn_down.setOnClickListener {
            if(count > 0){
                count -= 1
                tv_result.text = ""+count

            }else{

                Toast.makeText(context,"ไม่สามารถลดค่าได้แล้วนะ" ,Toast.LENGTH_LONG).show()
            }

        }
    }
}
