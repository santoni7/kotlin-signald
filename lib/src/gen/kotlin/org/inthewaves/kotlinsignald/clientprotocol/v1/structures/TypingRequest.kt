package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.JsonMessageWrapper
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.Typing

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 *
 * send a typing started or stopped message
 */
@Serializable
@SerialName("typing")
public data class TypingRequest(
    /**
     * The account to use
     * Example: "+12024561414"
     */
    public val account: String,
    public val address: JsonAddress? = null,
    /**
     * Example: "EdSqI90cS0UomDpgUXOlCoObWvQOXlH5G3Z2d3f4ayE="
     */
    public val group: String? = null,
    /**
     * Example: true
     */
    public val typing: Boolean,
    public val `when`: Long? = null
) : SignaldRequestBodyV1<Typing, EmptyResponse>() {
    protected override val responseWrapperSerializer: KSerializer<Typing>
        get() = Typing.serializer()

    protected override val responseDataSerializer: KSerializer<EmptyResponse>
        get() = EmptyResponse.serializer()

    public override fun getTypedResponseOrNull(responseWrapper: JsonMessageWrapper<*>):
        EmptyResponse? = if (responseWrapper is Typing && responseWrapper.data is EmptyResponse) {
        responseWrapper.data
    } else {
        null
    }
}
