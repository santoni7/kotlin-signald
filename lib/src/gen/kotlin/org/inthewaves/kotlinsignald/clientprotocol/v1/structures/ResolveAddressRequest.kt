package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.JsonMessageWrapper
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.ResolveAddress

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 *
 * Resolve a partial JsonAddress with only a number or UUID to one with both. Anywhere that signald
 * accepts a JsonAddress will except a partial, this is a convenience function for client authors,
 * mostly because signald doesn't resolve all the partials it returns
 */
@Serializable
@SerialName("resolve_address")
public data class ResolveAddressRequest(
    /**
     * The signal account to use
     * Example: "+12024561414"
     */
    public val account: String,
    /**
     * The partial address, missing fields
     */
    public val partial: JsonAddress
) : SignaldRequestBodyV1<ResolveAddress, JsonAddress>() {
    protected override val responseWrapperSerializer: KSerializer<ResolveAddress>
        get() = ResolveAddress.serializer()

    protected override val responseDataSerializer: KSerializer<JsonAddress>
        get() = JsonAddress.serializer()

    public override fun getTypedResponseOrNull(responseWrapper: JsonMessageWrapper<*>): JsonAddress? =
        if (responseWrapper is ResolveAddress && responseWrapper.data is JsonAddress) {
            responseWrapper.data
        } else {
            null
        }
}
