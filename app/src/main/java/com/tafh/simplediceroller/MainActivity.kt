package com.tafh.simplediceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun diceRoll(view: View) {
        // ketika tombol roll di klik
        // 1. mengacak angka 1 sampai 6
        val randomInt = (1 until 6).random()
        // 2. mengambil gambar dadu sesuai angka acak
        val imageResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // 3. mencetak hasil angka acak ke tv_result
        tv_result.text = randomInt.toString()
        // 5. merubah gambar hasil imageResource ke iv_dice
        iv_dice.setImageResource(imageResource)
    }
}