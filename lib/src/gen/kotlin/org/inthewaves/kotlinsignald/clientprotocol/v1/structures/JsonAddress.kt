package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.serializers.UUIDSerializer
import java.util.UUID

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 */
@Serializable
public data class JsonAddress(
    /**
     * An e164 phone number, starting with +. Currently the only available user-facing Signal
     * identifier.
     * Example: "+13215551234"
     */
    public val number: String? = null,
    /**
     * A UUID, the unique identifier for a particular Signal account.
     */
    @Serializable(UUIDSerializer::class)
    public val uuid: UUID? = null,
    public val relay: String? = null
) : SignaldResponseBodyV1()
