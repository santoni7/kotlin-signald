package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.Serializable

@Serializable
public data class DeviceInfo(
    public val id: Long? = null,
    public val name: String? = null,
    public val created: Long? = null,
    public val lastSeen: Long? = null
)
