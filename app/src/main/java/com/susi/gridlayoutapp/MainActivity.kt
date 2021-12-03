package com.susi.gridlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.susi.gridlayoutapp.R
import com.susi.gridlayoutapp.adapters.AlphaAdapters
import com.susi.gridlayoutapp.model.AlphaChar


class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var arrayList: ArrayList<AlphaChar>? = null
    private var alphaAdapters: AlphaAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.my_recycler_view)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters(applicationContext, arrayList!!)
        recyclerView?.adapter = alphaAdapters

    }
    private fun setDataInList(): ArrayList<AlphaChar> {

        var items: ArrayList<AlphaChar> = ArrayList()

        items.add(AlphaChar(R.drawable.letter_a, "Char A"))
        items.add(AlphaChar(R.drawable.letter_b, "Char B"))
        items.add(AlphaChar(R.drawable.letter_c, "Char C"))
        items.add(AlphaChar(R.drawable.letter_d, "Char D"))
        items.add(AlphaChar(R.drawable.letter_e, "Char E"))
        items.add(AlphaChar(R.drawable.letter_f, "Char F"))
        items.add(AlphaChar(R.drawable.letter_g, "Char G"))
        items.add(AlphaChar(R.drawable.letter_h, "Char H"))
        items.add(AlphaChar(R.drawable.letter_i, "Char I"))
        items.add(AlphaChar(R.drawable.letter_j, "Char J"))
        items.add(AlphaChar(R.drawable.letter_k, "Char K"))
        items.add(AlphaChar(R.drawable.letter_l, "Char L"))
        items.add(AlphaChar(R.drawable.letter_m, "Char M"))
        items.add(AlphaChar(R.drawable.letter_n, "Char N"))
        items.add(AlphaChar(R.drawable.letter_o, "Char o"))
        items.add(AlphaChar(R.drawable.letter_p, "Char P"))
        items.add(AlphaChar(R.drawable.letter_q, "Char Q"))
        items.add(AlphaChar(R.drawable.letter_r, "Char R"))
        items.add(AlphaChar(R.drawable.letter_s, "Char S"))
        items.add(AlphaChar(R.drawable.letter_t, "Char T"))
        items.add(AlphaChar(R.drawable.letter_u, "Char U"))
        items.add(AlphaChar(R.drawable.letter_v, "Char V"))
        items.add(AlphaChar(R.drawable.letter_w, "Char W"))
        items.add(AlphaChar(R.drawable.letter_x, "Char X"))
        items.add(AlphaChar(R.drawable.letter_y, "Char Y"))
        items.add(AlphaChar(R.drawable.letter_z, "Char Z"))

        return items
    }
}
