package org.inthewaves.kotlinsignald.clientprotocol.v0.structures

import kotlinx.serialization.Serializable

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 */
@Serializable
public data class IceUpdateMessage(
    public val id: Long? = null,
    public val opaque: String? = null,
    public val sdp: String? = null
)
