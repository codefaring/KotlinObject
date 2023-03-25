package com.example.kotlinobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinobject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 오브젝트 생성자 없이 호출
        ObjectTest.People.name = "TestMan"

        ObjectTest.Pat.patName = "tinyPig"
        ObjectTest.Pat.shopUpPatName()

        val find = ObjectTest.Pat()    // 컴패니언 오브젝트 스코프 밖이라 생성자로 호출
        find.companionOut()

        val shoUp = ActivityMainBinding.inflate(layoutInflater)
        setContentView(shoUp.root)

        data class User(val name: String, var age: Int)
        var user = User("Jeam", 30)
//        user.name = "Tom"  // 에러발생
        user.age = 25
        Log.d("data클래스", "user정보 ${user.toString()}")

        var copyUser = user.copy()
        Log.d("data클래스", "copyUser정보 ${copyUser.toString()}")


        shoUp.btnView.setOnClickListener {
            shoUp.textView.text = "${ObjectTest.People.showName()}"
        }
    }
}