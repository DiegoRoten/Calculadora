package DIEGO.diegoprueba.Calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.diegoinicial.diegoprueba.R
import java.text.DecimalFormat


class CalculatorActivity : AppCompatActivity() {

    private lateinit var textView1: TextView
    private lateinit var textResult: TextView
    private var currentExpression: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        initViews()

        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        val buttonMultiply: Button = findViewById(R.id.buttonMultiply)
        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        val buttonEqual: Button = findViewById(R.id.buttonEqual)
        val buttonDecimal: Button = findViewById(R.id.buttonDecimal)
        val buttonClear: Button = findViewById(R.id.buttonClear)
        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)


        buttonClear.setOnClickListener { clear() }
        buttonDecimal.setOnClickListener { currentExpression += "." }
        buttonEqual.setOnClickListener { calculate() }
        buttonPlus.setOnClickListener { operationExpression("+")
            updateTextView()
        }
        buttonMinus.setOnClickListener { operationExpression("-")
            updateTextView()
        }
        buttonMultiply.setOnClickListener { operationExpression("*")
            updateTextView()
        }
        buttonDivide.setOnClickListener { operationExpression("/")
            updateTextView()
        }
        button0.setOnClickListener {currentExpression += "0"
            updateTextView()
        }
        button1.setOnClickListener {currentExpression += "1"
            updateTextView()
        }
        button2.setOnClickListener { currentExpression += "2"
            updateTextView()
        }
        button3.setOnClickListener { currentExpression += "3"
            updateTextView()
        }
        button4.setOnClickListener { currentExpression += "4"
            updateTextView()
        }
        button5.setOnClickListener { currentExpression += "5"
            updateTextView()
        }
        button6.setOnClickListener { currentExpression += "6"
            updateTextView()
        }
        button7.setOnClickListener { currentExpression += "7"
            updateTextView()
        }
        button8.setOnClickListener { currentExpression += "8"
            updateTextView()
        }
        button9.setOnClickListener { currentExpression += "9"
            updateTextView()
        }
    }
    private fun operationExpression(operator: String) {
        currentExpression += operator
        textView1.text = currentExpression
    }
    private fun initViews() {
        textView1 = findViewById(R.id.textView1)
        textResult = findViewById(R.id.textResult)
    }
    private fun clear() {
        currentExpression = ""
        textResult.text = ""
        textView1.text = ""
    }
    private fun calculate(): Double {
        val operations = when {
            currentExpression.contains("+") -> {
                val numbers = currentExpression.split("+")
                val operand1 = numbers[0].toDouble()
                val operand2 = numbers[1].toDouble()
                operand1 + operand2
            }
            currentExpression.contains("-") -> {
                val numbers = currentExpression.split("-")
                val operand1 = numbers[0].toDouble()
                val operand2 = numbers[1].toDouble()
                operand1 - operand2
            }
            currentExpression.contains("*") -> {
                val numbers = currentExpression.split("*")
                val operand1 = numbers[0].toDouble()
                val operand2 = numbers[1].toDouble()
                operand1 * operand2
            }
            currentExpression.contains("/") -> {
                val numbers = currentExpression.split("/")
                val operand1 = numbers[0].toDouble()
                val operand2 = numbers[1].toDouble()
                operand1 / operand2
            }
            else -> { textResult.text = "ERROR"
            }
        }
        val df = DecimalFormat("#.##")
        return df.format(operations).toDouble()
    }
    private fun updateTextView() {
        textView1.text = currentExpression
    }
}






