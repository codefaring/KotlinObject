package com.example.kotlinobject

import android.util.Log

class ObjectTest {
    // 오브젝트를 이용하면 별도의 생성자 없이 호출이 가능하다.
    object People {
        var name: String = "Aiden"
        fun showName(): String {
            Log.d("ObjectTest", "object People의 이름정보는 $name")
            return "object People의 이름정보는 $name"
        }
    }

    class Pat {
        companion object {
            var patName: String = "None"
            fun shopUpPatName() {
                Log.d("Pat클래스/컴패니언 오브젝트", "애완동물의 이름은 $patName")
            }
        }
        fun companionOut() {
            Log.d("Pat클래스", "애완동물의 이름을 볼 수 없다.")
        }
    }
}