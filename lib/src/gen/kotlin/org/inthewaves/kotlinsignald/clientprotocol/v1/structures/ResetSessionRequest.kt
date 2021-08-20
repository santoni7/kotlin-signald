package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.JsonMessageWrapper
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.ResetSession

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 *
 * reset a session with a particular user
 */
@Serializable
@SerialName("reset_session")
public data class ResetSessionRequest(
    /**
     * The account to use
     * Example: "+12024561414"
     */
    public val account: String,
    /**
     * the user to reset session with
     */
    public val address: JsonAddress,
    public val timestamp: Long? = null
) : SignaldRequestBodyV1<ResetSession, SendResponse>() {
    protected override val responseWrapperSerializer: KSerializer<ResetSession>
        get() = ResetSession.serializer()

    protected override val responseDataSerializer: KSerializer<SendResponse>
        get() = SendResponse.serializer()

    public override fun getTypedResponseOrNull(responseWrapper: JsonMessageWrapper<*>):
        SendResponse? = if (responseWrapper is ResetSession && responseWrapper.data is
        SendResponse
    ) {
        responseWrapper.data
    } else {
        null
    }
}
