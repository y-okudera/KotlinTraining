package com.yuoku.KotlinTraining112

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        dataType()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun dataType() {
        // List 中身も要素数も変更不可
        val list: List<String> = listOf("1", "2")
        println(list[0])

        // Array 要素数の変更不可。中身の変更は可能。
        val array: Array<String> = arrayOf("apple", "banana")
        println(array[1])
        array[1] = "cherry"
        println(array[1])

        // ArrayList 中身も要素数も変更可能
        val arrayList: ArrayList<String> = arrayListOf("carrot", "potato")
        arrayList.add("cabbage")
        println(arrayList[2])
        arrayList[2] = "lettuce"
        println(arrayList[2])

        // Map
        val map = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4)
        println(map.keys)
        println(map.values)
        println(map["key1"])
        println(map.filter { it.value > 2 })

        // Listの重複を除去したHashSetを生成
        val hashSet = listOf(1, 1, 2, 3, 2, 4, 5, 6).toHashSet()
        println(hashSet)
        // HashSetをListに変換
        val listFromHashSet = hashSet.toList()
        listFromHashSet.forEach {
            println(it)
        }
    }
}
