package recipefindermyapp.kotlin.com.recipefinderapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import recipefindermyapp.kotlin.com.recipefinderapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchBtn.setOnClickListener {
            var intent = Intent(this, RecipeList::class.java)
            var ingredients = IngredientsEdt.text.toString().trim()
            var searchTerm = searchTermEdt.text.toString().trim()

            intent.putExtra("ingredients", ingredients)
            intent.putExtra("search", searchTerm)

            startActivity(intent)
        }
    }
}
