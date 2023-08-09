package com.lordpacific.tracker_domain.use_case

import com.lordpacific.tracker_domain.model.TrackedFood
import com.lordpacific.tracker_domain.repository.TrackerRepository

class DeleteTrackedFood(private val repository: TrackerRepository) {
    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}