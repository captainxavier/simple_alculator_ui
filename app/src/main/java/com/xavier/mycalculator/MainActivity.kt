package com.xavier.mycalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.unit.dp
import com.xavier.mycalculator.screens.CalculatorScreen
import com.xavier.mycalculator.ui.theme.MediumGrey
import com.xavier.mycalculator.ui.theme.MyCalculatorTheme
import com.xavier.mycalculator.viewModel.CalculatorViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalculatorTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp

                CalculatorScreen(
                    state =state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier
                        .background(MediumGrey)
                        .padding(16.dp)
                )

            }
        }
    }
}
