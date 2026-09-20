package com.kalshiquickpicks

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
        }

        val title = TextView(this).apply {
            text = "Kalshi Quick Picks"
            textSize = 28f
        }

        val subtitle = TextView(this).apply {
            text = "Top opportunities based on estimated market edge"
            textSize = 16f
            setPadding(0, 20, 0, 40)
        }

        layout.addView(title)
        layout.addView(subtitle)

        val demo = TextView(this).apply {
            text = """
                QUICK PICKS

                Demo Market
                YES — 62¢
                Estimated probability: 70%
                Estimated edge: +8%

                Demo Market
                NO — 41¢
                Estimated probability: 50%
                Estimated edge: +9%

                These are simulated opportunities.
                No real money is being traded.
            """.trimIndent()
            textSize = 18f
        }

        layout.addView(demo)

        setContentView(layout)
    }
}
