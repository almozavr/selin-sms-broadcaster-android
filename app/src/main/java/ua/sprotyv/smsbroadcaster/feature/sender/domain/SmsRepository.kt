package ua.sprotyv.smsbroadcaster.feature.sender.domain

import kotlinx.coroutines.flow.Flow
import ua.sprotyv.smsbroadcaster.feature.sender.domain.entity.SmsSendStatus

interface SmsRepository {
    fun connect(): Flow<SmsSendStatus>
    suspend fun send(body: String, phones: List<String>)
    suspend fun cancel()
}
