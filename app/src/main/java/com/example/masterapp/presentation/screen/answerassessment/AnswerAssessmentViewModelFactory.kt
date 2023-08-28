package com.example.masterapp.presentation.screen.answerassessment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.masterapp.data.HealthConnectManager
import com.example.masterapp.data.roomDatabase.AnswerViewModel
import com.example.masterapp.data.roomDatabase.QuestionnaireReminderViewModel
import com.example.masterapp.presentation.screen.SharedViewModel

class AnswerAssessmentViewModelFactory(
    private val healthConnectManager: HealthConnectManager,
    private val answerViewModel: AnswerViewModel,
    private val sharedViewModel: SharedViewModel,
    private val questionnaireReminderViewModel: QuestionnaireReminderViewModel
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AnswerAssessmentViewModel::class.java)) {
            return AnswerAssessmentViewModel(healthConnectManager,
                answerViewModel,
                sharedViewModel,
                questionnaireReminderViewModel) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
