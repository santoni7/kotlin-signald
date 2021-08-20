package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.FinishLink
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.JsonMessageWrapper

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 *
 * After a linking URI has been requested, finish_link must be called with the session_id provided
 * with the URI. it will return information about the new account once the linking process is completed
 * by the other device.
 */
@Serializable
@SerialName("finish_link")
public data class FinishLinkRequest(
    @SerialName("device_name")
    public val deviceName: String? = null,
    @SerialName("session_id")
    public val sessionId: String? = null
) : SignaldRequestBodyV1<FinishLink, Account>() {
    protected override val responseWrapperSerializer: KSerializer<FinishLink>
        get() = FinishLink.serializer()

    protected override val responseDataSerializer: KSerializer<Account>
        get() = Account.serializer()

    public override fun getTypedResponseOrNull(responseWrapper: JsonMessageWrapper<*>): Account? =
        if (responseWrapper is FinishLink && responseWrapper.data is Account) {
            responseWrapper.data
        } else {
            null
        }
}
